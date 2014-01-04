package reverseinteger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 1/2/14
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {
    Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void testReverse() throws Exception {
        Assert.assertEquals(321, main.reverse(123));
        Assert.assertEquals(-321, main.reverse(-123));
    }

    @Test
    public void testIsPalindrome(){
        Assert.assertTrue(main.isPalindrome(121));
        Assert.assertTrue(main.isPalindrome(-2147447412));
    }
}
