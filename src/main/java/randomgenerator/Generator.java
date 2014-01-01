package randomgenerator;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: liujia
 * Date: 12/30/13
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Generator {

    public int[] array(int length){
       int[] retVal = new int[length];
       Random r = new Random();
       for(int i= 0; i < length; i++){
           retVal[i] = r.nextInt(length * 3);
       }
       return retVal;
    }
}
