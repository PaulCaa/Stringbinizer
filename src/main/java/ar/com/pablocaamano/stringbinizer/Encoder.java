package ar.com.pablocaamano.stringbinizer;

import java.io.Serializable;

/**
 * Class to encode characters string based in dictionary definition
 * @author Caamaño, Pablo
 */
public class Encoder implements Serializable {

    public static String encode(String s){
        String resultBin = "";
        for (int i=0; i<s.length(); i++){
            int a = s.charAt(i);
            String bin = Integer.toBinaryString(a);
            if(bin.length() == 6){
                String aux = bin;
                bin = "0" + aux;
            }
            resultBin += bin;
        }
        return resultBin;
    }

}
