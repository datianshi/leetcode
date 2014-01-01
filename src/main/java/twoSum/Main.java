package twoSum;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 12/24/13
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 *
 * Hash map look up is constant time
 *
 */
public class Main {

    public int[] twoSum(int[] numbers, int target){
        int[] retVal = null;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++){
            if(hashMap.containsKey(target-numbers[i])){
                retVal = new int[2];
                retVal[0] = hashMap.get(target-numbers[i]);
                retVal[1] = i;
                return retVal;
            }
            else{
                hashMap.put(numbers[i], i);
            }
        }
        return null;
    }

}
