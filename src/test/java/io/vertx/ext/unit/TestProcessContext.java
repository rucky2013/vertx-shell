package io.vertx.ext.unit;

import io.vertx.core.Context;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.shell.Session;
import io.vertx.ext.shell.io.EventType;
import io.vertx.ext.shell.io.Stream;
import io.vertx.ext.shell.impl.SessionImpl;
import io.vertx.ext.shell.process.ProcessContext;
import io.vertx.ext.shell.io.Tty;

import java.util.HashMap;

/**
* @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
*/
class TestProcessContext implements ProcessContext, Tty {

  final SessionImpl session = new SessionImpl();
  private Handler<Integer> endHandler;
  final Context context = Vertx.currentContext();
  final HashMap<EventType, Handler<Void>> eventHandlers = new HashMap<>();
  int width, height;
  Handler<String> stdin;
  private Stream stdout;

  @Override
  public Tty tty() {
    return this;
  }

  @Override
  public void end(int status) {
    if (endHandler != null) {
      endHandler.handle(status);
    }
  }

  public TestProcessContext endHandler(Handler<Integer> handler) {
    endHandler = context != null ? status -> context.runOnContext(v -> handler.handle(status) ) : handler;
    return this;
  }

  @Override
  public int width() {
    return width;
  }

  @Override
  public int height() {
    return height;
  }

  public void setWindowSize(int width, int height) {
    this.width = width;
    this.height = height;
    sendEvent(EventType.SIGWINCH);
  }

  @Override
  public TestProcessContext setStdin(Handler<String> stdin) {
    this.stdin = stdin;
    return this;
  }

  @Override
  public Tty setStdin(Stream stdin) {
    return setStdin((Handler<String>)stdin::write);
  }

  @Override
  public Stream stdout() {
    return stdout;
  }

  public TestProcessContext setStdout(Stream stream) {
    stdout = context != null ? Stream.ofObject(txt -> context.runOnContext(v -> stream.write(txt))) : stream;
    return this;
  }

  @Override
  public TestProcessContext eventHandler(EventType eventType, Handler<Void> handler) {
    if (handler != null) {
      eventHandlers.put(eventType, handler);
    } else {
      eventHandlers.remove(eventType);
    }
    return this;
  }

  @Override
  public Session session() {
    return session;
  }

  public boolean sendEvent(EventType eventType) {
    Handler<Void> handler = eventHandlers.get(eventType);
    if (handler != null) {
      handler.handle(null);
      return true;
    } else {
      return false;
    }
  }
}
