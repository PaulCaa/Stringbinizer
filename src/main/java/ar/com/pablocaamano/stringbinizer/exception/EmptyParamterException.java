package ar.com.pablocaamano.stringbinizer.exception;

public class EmptyParamterException extends  RuntimeException{

    private static final String DEFAULT_MESSAGE = "A required parameters is null or empty";

    /**
     * Contructor to build a exception with default message
     */
    public EmptyParamterException(){
        super(DEFAULT_MESSAGE);
    }

    /**
     * Constructor to build a exception with custom message
     * @param customMessage
     */
    public EmptyParamterException(String customMessage){
        super(customMessage);
    }
}
