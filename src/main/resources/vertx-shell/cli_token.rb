require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.shell.cli.CliToken
module VertxShell
  #  A parsed token in the command line interface.
  class CliToken
    # @private
    # @param j_del [::VertxShell::CliToken] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxShell::CliToken] the underlying java delegate
    def j_del
      @j_del
    end
    #  Create a text token.
    # @param [String] text the text
    # @return [::VertxShell::CliToken] the token
    def self.create_text(text=nil)
      if text.class == String && !block_given?
        return ::Vertx::Util::Utils.safe_create(Java::IoVertxExtShellCli::CliToken.java_method(:createText, [Java::java.lang.String.java_class]).call(text),::VertxShell::CliToken)
      end
      raise ArgumentError, "Invalid arguments when calling create_text(text)"
    end
    #  Create a new blank token.
    # @param [String] blank the blank value
    # @return [::VertxShell::CliToken] the token
    def self.create_blank(blank=nil)
      if blank.class == String && !block_given?
        return ::Vertx::Util::Utils.safe_create(Java::IoVertxExtShellCli::CliToken.java_method(:createBlank, [Java::java.lang.String.java_class]).call(blank),::VertxShell::CliToken)
      end
      raise ArgumentError, "Invalid arguments when calling create_blank(blank)"
    end
    #  @return the token value
    # @return [String]
    def value
      if !block_given?
        return @j_del.java_method(:value, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling value()"
    end
    #  @return the raw token value, that may contain unescaped chars, for instance 
    # @return [String]
    def raw
      if !block_given?
        return @j_del.java_method(:raw, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling raw()"
    end
    #  @return true when it's a text token
    # @return [true,false]
    def text?
      if !block_given?
        return @j_del.java_method(:isText, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling text?()"
    end
    #  @return true when it's a blank token
    # @return [true,false]
    def blank?
      if !block_given?
        return @j_del.java_method(:isBlank, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling blank?()"
    end
    #  Tokenize the string argument and return a list of tokens.
    # @param [String] s the tokenized string
    # @return [Array<::VertxShell::CliToken>] the tokens
    def self.tokenize(s=nil)
      if s.class == String && !block_given?
        return Java::IoVertxExtShellCli::CliToken.java_method(:tokenize, [Java::java.lang.String.java_class]).call(s).to_a.map { |elt| ::Vertx::Util::Utils.safe_create(elt,::VertxShell::CliToken) }
      end
      raise ArgumentError, "Invalid arguments when calling tokenize(s)"
    end
  end
end
