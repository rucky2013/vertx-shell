require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.shell.io.Stream
module VertxShell
  #  A stream of text.
  class Stream
    # @private
    # @param j_del [::VertxShell::Stream] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxShell::Stream] the underlying java delegate
    def j_del
      @j_del
    end
    # @param [String] event 
    # @return [void]
    def handle(event=nil)
      if event.class == String && !block_given?
        return @j_del.java_method(:handle, [Java::java.lang.String.java_class]).call(event)
      end
      raise ArgumentError, "Invalid arguments when calling handle(event)"
    end
    # @param [String] data 
    # @return [void]
    def write(data=nil)
      if data.class == String && !block_given?
        return @j_del.java_method(:write, [Java::java.lang.String.java_class]).call(data)
      end
      raise ArgumentError, "Invalid arguments when calling write(data)"
    end
  end
end
