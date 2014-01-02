package longestString;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 1/1/14
 * Time: 3:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public int lengthOfLongestSubstring(String s) {
        int retVal = 0;
        ArrayDeque<Character> queue = new ArrayDeque<Character>();
        HashSet<Character> hashSet = new HashSet<Character>();
        char[] array = s.toCharArray();
        for(int i=0 ; i < array.length; i++){
            if(!queue.isEmpty() && hashSet.contains(array[i])){
                int size = queue.size();
                retVal = retVal > size ? retVal : size;
                while(!queue.getFirst().equals(array[i])){
                    hashSet.remove(queue.removeFirst());
                }
                hashSet.remove(queue.removeFirst());
            }
            queue.add(array[i]);
            hashSet.add(array[i]);
        }
        retVal = retVal > queue.size() ? retVal : queue.size();
        return retVal;
    }
}
