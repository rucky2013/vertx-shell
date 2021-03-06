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

package io.vertx.groovy.ext.shell.system;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.core.json.JsonObject
import java.util.Set
import io.vertx.core.Handler
/**
 * The job controller.<p/>
*/
@CompileStatic
public class JobController {
  private final def io.vertx.ext.shell.system.JobController delegate;
  public JobController(Object delegate) {
    this.delegate = (io.vertx.ext.shell.system.JobController) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * @return the current foreground job
   * @return 
   */
  public Job foregroundJob() {
    def ret= InternalHelper.safeCreate(this.delegate.foregroundJob(), io.vertx.groovy.ext.shell.system.Job.class);
    return ret;
  }
  /**
   * @return the active jobs
   * @return 
   */
  public Set<Job> jobs() {
    def ret = this.delegate.jobs()?.collect({underpants -> new io.vertx.groovy.ext.shell.system.Job(underpants)}) as Set;
    return ret;
  }
  /**
   * Returns an active job in this session by its .
   * @param id the job id
   * @return the job of  when not found
   */
  public Job getJob(int id) {
    def ret= InternalHelper.safeCreate(this.delegate.getJob(id), io.vertx.groovy.ext.shell.system.Job.class);
    return ret;
  }
  /**
   * Create a job wrapping a process.
   * @param process the process
   * @param line the line
   * @return the created job
   */
  public Job createJob(Process process, String line) {
    def ret= InternalHelper.safeCreate(this.delegate.createJob((io.vertx.ext.shell.system.Process)process.getDelegate(), line), io.vertx.groovy.ext.shell.system.Job.class);
    return ret;
  }
  /**
   * Close the controller and terminate all the underlying jobs, a closed controller does not accept anymore jobs.
   * @param completionHandler 
   */
  public void close(Handler<Void> completionHandler) {
    this.delegate.close(completionHandler);
  }
  /**
   * Close the shell session and terminate all the underlying jobs.
   */
  public void close() {
    this.delegate.close();
  }
}
