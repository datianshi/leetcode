package zigzag;

import sun.jvm.hotspot.interpreter.Bytecodes;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 1/2/14
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public String convert(String s, int nRows) {
        if(nRows <= 1){
            return s;
        }
        ArrayList<Character>[] chars = new ArrayList[nRows];
        for(int i=0; i< nRows; i++){
            chars[i] = new ArrayList<Character>();
        }

        char[] array = s.toCharArray();
        for(int i=0; i < array.length; i++){
            int remainder = i % (2*nRows - 2);
            if(remainder < nRows){
                chars[remainder].add(array[i]);
            }
            else{
                chars[2*nRows - remainder - 2].add(array[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< nRows; i++){
            for(Character c: chars[i]){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
