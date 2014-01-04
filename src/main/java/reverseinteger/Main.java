package reverseinteger;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 1/2/14
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public int reverse(int x) {
        int original = x;
        int retVal = 0;
        while(original != 0){
            int remainder = original % 10;
            retVal = retVal * 10 + remainder;
            original = original/10;
        }
       return retVal;
    }
}
