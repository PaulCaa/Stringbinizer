package ar.com.pablocaamano.stringbinizer;

import ar.com.pablocaamano.stringbinizer.exception.EmptyParamterException;

/**
 * @author Caamaño, Pablo
 * @website http://pablocaamano.com.ar
 */
public class Stringbinizer {

    private static final String EMPTY_PARAM_ERROR_MSG = "Please add any string...";

    /**
     * Method to encode any string in binary string
     * @param words = this parameter must contains a word or any oration
     * @return String
     */
    public static String encode(String words){
        try {
            // Parameter validation
            parameterValidation(words);
            // Encode process
            Encoder encoder = new Encoder();
            return encoder.process(words);
        }catch(Exception exception){
            if (exception instanceof EmptyParamterException)
                return EMPTY_PARAM_ERROR_MSG;
            return "Any error ocurred in encode process :(";
        }
    }

    /**
     * Method to decode a binary string
     * @param binString = this parameter must contain a binary
     * @return String
     */
    public static String decode(String binString){
        try{
            // Parameter validation
            parameterValidation(binString);
            // Decode process
            Decoder decoder = new Decoder();
            return decoder.process(binString);
        }catch (Exception exception){
            if (exception instanceof EmptyParamterException)
                return EMPTY_PARAM_ERROR_MSG;
            return "Any error ocurred in decode process :(";
        }
    }

    private static void parameterValidation(String parameter){
        if(parameter.equalsIgnoreCase("") | parameter.isEmpty())
            throw new EmptyParamterException();
    }
}
