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

package io.vertx.groovy.ext.shell.command;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.core.json.JsonObject
/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
*/
@CompileStatic
public class BaseCommands {
  private final def io.vertx.ext.shell.command.BaseCommands delegate;
  public BaseCommands(Object delegate) {
    this.delegate = (io.vertx.ext.shell.command.BaseCommands) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public static Command verticle_ls() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.verticle_ls(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command verticle_deploy() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.verticle_deploy(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command verticle_undeploy() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.verticle_undeploy(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command verticle_factories() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.verticle_factories(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command server_ls() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.server_ls(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command local_map_get() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.local_map_get(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command local_map_put() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.local_map_put(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command local_map_rm() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.local_map_rm(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command bus_send() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.bus_send(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command bus_tail() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.bus_tail(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command fs_cd() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.fs_cd(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command fs_pwd() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.fs_pwd(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command fs_ls() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.fs_ls(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command sleep() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.sleep(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command echo() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.echo(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
  public static Command help() {
    def ret= InternalHelper.safeCreate(io.vertx.ext.shell.command.BaseCommands.help(), io.vertx.groovy.ext.shell.command.Command.class);
    return ret;
  }
}
