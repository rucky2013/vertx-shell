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

package io.vertx.rxjava.ext.shell.system;

import java.util.Map;
import io.vertx.lang.rxjava.InternalHelper;
import rx.Observable;
import io.vertx.ext.shell.system.ExecStatus;
import io.vertx.core.Handler;
import io.vertx.rxjava.ext.shell.term.Tty;
import io.vertx.rxjava.ext.shell.session.Session;

/**
 * A job executed in a {@link io.vertx.rxjava.ext.shell.system.JobController}, grouping one or several process.<p/>
 *
 * The job life cycle can be controlled with the {@link io.vertx.rxjava.ext.shell.system.Job#run}, {@link io.vertx.rxjava.ext.shell.system.Job#resume} and {@link io.vertx.rxjava.ext.shell.system.Job#suspend} and {@link io.vertx.rxjava.ext.shell.system.Job#interrupt}
 * methods.
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.shell.system.Job original} non RX-ified interface using Vert.x codegen.
 */

public class Job {

  final io.vertx.ext.shell.system.Job delegate;

  public Job(io.vertx.ext.shell.system.Job delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * @return the job id
   * @return 
   */
  public int id() { 
    int ret = this.delegate.id();
    return ret;
  }

  /**
   * @return the job exec status
   * @return 
   */
  public ExecStatus status() { 
    ExecStatus ret = this.delegate.status();
    return ret;
  }

  /**
   * @return when the job was last stopped
   * @return 
   */
  public long lastStopped() { 
    long ret = this.delegate.lastStopped();
    return ret;
  }

  /**
   * @return the execution line of the job, i.e the shell command line that launched this job
   * @return 
   */
  public String line() { 
    String ret = this.delegate.line();
    return ret;
  }

  /**
   * Set a tty on the job.
   * @param tty the tty to use
   * @return this object
   */
  public Job setTty(Tty tty) { 
    this.delegate.setTty((io.vertx.ext.shell.term.Tty) tty.getDelegate());
    return this;
  }

  /**
   * Set a session on the job.
   * @param session the session to use
   * @return this object
   */
  public Job setSession(Session session) { 
    this.delegate.setSession((io.vertx.ext.shell.session.Session) session.getDelegate());
    return this;
  }

  /**
   * Set an handler called when the job terminates.
   * @param handler the terminate handler
   * @return this object
   */
  public Job statusUpdateHandler(Handler<ExecStatus> handler) { 
    this.delegate.statusUpdateHandler(null /* Handler<io.vertx.ext.shell.system.ExecStatus> with kind ENUM not yet implemented */);
    return this;
  }

  /**
   * Run the job, before running the job a  must be set.
   * @return this object
   */
  public Job run() { 
    this.delegate.run();
    return this;
  }

  /**
   * Attempt to interrupt the job.
   * @return true if the job is actually interrupted
   */
  public boolean interrupt() { 
    boolean ret = this.delegate.interrupt();
    return ret;
  }

  /**
   * Resume the job to foreground.
   * @return 
   */
  public Job resume() { 
    Job ret= Job.newInstance(this.delegate.resume());
    return ret;
  }

  /**
   * Send the job to background.
   * @return this object
   */
  public Job toBackground() { 
    this.delegate.toBackground();
    return this;
  }

  /**
   * Send the job to foreground.
   * @return this object
   */
  public Job toForeground() { 
    this.delegate.toForeground();
    return this;
  }

  /**
   * Resume the job.
   * @param foreground true when the job is resumed in foreground
   * @return 
   */
  public Job resume(boolean foreground) { 
    this.delegate.resume(foreground);
    return this;
  }

  /**
   * Resume the job.
   * @return this object
   */
  public Job suspend() { 
    this.delegate.suspend();
    return this;
  }

  /**
   * Terminate the job.
   */
  public void terminate() { 
    this.delegate.terminate();
  }

  /**
   * @return the first process in the job
   * @return 
   */
  public Process process() { 
    if (cached_0 != null) {
      return cached_0;
    }
    Process ret= Process.newInstance(this.delegate.process());
    cached_0 = ret;
    return ret;
  }

  private Process cached_0;

  public static Job newInstance(io.vertx.ext.shell.system.Job arg) {
    return arg != null ? new Job(arg) : null;
  }
}
