package ar.com.pablocaamano.stringbinizer;

import java.io.Serializable;

/**
 * Class to decode binary concatenation to string
 * @author Caamaño, Pablo
 */
public class Decoder implements Serializable {

    public static String decode(String b){
        String[] binArray = b.split("");
        String binWord ="";
        String s = "";
        for (int i=0; i<binArray.length; i++){
            if(binWord.length()<7){
                binWord += binArray[i];
            }else{
                s += binToChar(binWord);
                binWord = binArray[i];
            }
            if(i == binArray.length-1){
                s += binToChar(binWord);
            }
        }
        return s;
    }

    private static char binToChar(String bin){
        int charIndex = Integer.parseInt(bin,2);
        return (char)charIndex;
    }
}
