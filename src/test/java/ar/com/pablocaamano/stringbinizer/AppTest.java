package ar.com.pablocaamano.stringbinizer;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }

    /**
     * Test encode string to binary method
     */
    @Test
    public void testEncoder(){
        String str = "Hola App";
        String bin = Encoder.encode(str);
        System.out.println(str + " --to binary--> " + bin);
        Assert.assertEquals("10010001101111110110011000010100000100000111100001110000", bin);
    }

    /**
     * Test decode binary to string
     */
    @Test
    public void testDecode(){
        String bin = "10010001101111110110011000010100000100000111100001110000";
        String str = Decoder.decode(bin);
        System.out.println(bin + " --to string--> " + str);
        Assert.assertEquals("Hola App", str);
    }
}
