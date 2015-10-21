/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.shell.net;

import java.util.Map;
import io.vertx.lang.rxjava.InternalHelper;
import rx.Observable;
import io.vertx.rxjava.ext.shell.io.Stream;
import io.vertx.rxjava.ext.shell.io.Tty;
import io.vertx.core.Handler;

/**
 * The remote terminal.
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.shell.net.Terminal original} non RX-ified interface using Vert.x codegen.
 */

public class Terminal extends Tty {

  final io.vertx.ext.shell.net.Terminal delegate;

  public Terminal(io.vertx.ext.shell.net.Terminal delegate) {
    super(delegate);
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public Terminal resizehandler(Handler<Void> handler) { 
    ( /* Work around for https://jira.codehaus.org/browse/GROOVY-6970 */ (io.vertx.ext.shell.io.Tty) delegate).resizehandler(handler);
    return this;
  }

  public Terminal setStdin(Stream stdin) { 
    ( /* Work around for https://jira.codehaus.org/browse/GROOVY-6970 */ (io.vertx.ext.shell.io.Tty) delegate).setStdin((io.vertx.ext.shell.io.Stream) stdin.getDelegate());
    return this;
  }

  public Terminal closeHandler(Handler<Void> handler) { 
    this.delegate.closeHandler(handler);
    return this;
  }

  public void close() { 
    this.delegate.close();
  }


  public static Terminal newInstance(io.vertx.ext.shell.net.Terminal arg) {
    return arg != null ? new Terminal(arg) : null;
  }
}