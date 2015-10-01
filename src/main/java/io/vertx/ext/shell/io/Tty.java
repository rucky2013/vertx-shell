package io.vertx.ext.shell.io;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Handler;

/**
 * Provide interactions with the Shell TTY.
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface Tty {

  /**
   * @return the current width, i.e the number of rows or {@literal -1} if unknown
   */
  int width();

  /**
   * @return the current height, i.e the number of columns or {@literal -1} if unknown
   */
  int height();

  /**
   * Set a stream on the standard input to read the data.
   *
   * @param stdin the standard input
   * @return this object
   */
  @Fluent
  Tty setStdin(Stream stdin);

  /**
   * Set an handler the standard input to read the data in String format.
   *
   * @param stdin the standard input
   * @return this object
   */
  @Fluent
  Tty setStdin(Handler<String> stdin);

  /**
   * @return the standard output for emitting data
   */
  Stream stdout();

  /**
   * Set an event handler to be notified by Shell events.
   *
   * @param eventType the event type
   * @param handler
   * @return
   */
  @Fluent
  Tty eventHandler(EventType eventType, Handler<Void> handler);

}