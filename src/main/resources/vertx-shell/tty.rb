require 'vertx-shell/stream'
require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.shell.io.Tty
module VertxShell
  #  Provide interactions with the Shell TTY.
  class Tty
    # @private
    # @param j_del [::VertxShell::Tty] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxShell::Tty] the underlying java delegate
    def j_del
      @j_del
    end
    #  @return the current width, i.e the number of rows or  if unknown
    # @return [Fixnum]
    def width
      if !block_given?
        return @j_del.java_method(:width, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling width()"
    end
    #  @return the current height, i.e the number of columns or  if unknown
    # @return [Fixnum]
    def height
      if !block_given?
        return @j_del.java_method(:height, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling height()"
    end
    #  Set an handler the standard input to read the data in String format.
    # @yield the standard input
    # @return [self]
    def set_stdin(stdin=nil)
      if stdin.class.method_defined?(:j_del) && !block_given?
        @j_del.java_method(:setStdin, [Java::IoVertxExtShellIo::Stream.java_class]).call(stdin.j_del)
        return self
      elsif block_given? && stdin == nil
        @j_del.java_method(:setStdin, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |event| yield(event) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling set_stdin(stdin)"
    end
    #  @return the standard output for emitting data
    # @return [::VertxShell::Stream]
    def stdout
      if !block_given?
        return ::Vertx::Util::Utils.safe_create(@j_del.java_method(:stdout, []).call(),::VertxShell::Stream)
      end
      raise ArgumentError, "Invalid arguments when calling stdout()"
    end
    #  Set an event handler to be notified by Shell events.
    # @param [:SIGTSTP,:EOF,:SIGINT,:SIGWINCH,:SIGCONT] eventType the event type
    # @yield 
    # @return [self]
    def event_handler(eventType=nil)
      if eventType.class == Symbol && block_given?
        @j_del.java_method(:eventHandler, [Java::IoVertxExtShellIo::EventType.java_class,Java::IoVertxCore::Handler.java_class]).call(Java::IoVertxExtShellIo::EventType.valueOf(eventType),Proc.new { yield })
        return self
      end
      raise ArgumentError, "Invalid arguments when calling event_handler(eventType)"
    end
  end
end
