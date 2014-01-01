package twoSum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 12/24/13
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void basicTestTwoSum() throws Exception {
        int[] input = {2, 7, 11, 15};
        int target = 9;

        int[] indexes = main.twoSum(input, target);
        Assert.assertEquals(0, indexes[0]);
        Assert.assertEquals(1, indexes[1]);

    }

    @Test
    public void basic2TestTwoSum() throws Exception {
        int[] input = {2, 6, 11, 15, 7};
        int target = 9;

        int[] indexes = main.twoSum(input, target);
        Assert.assertEquals(0, indexes[0]);
        Assert.assertEquals(4, indexes[1]);

    }

    @Test
    public void basic3TestTwoSum() throws Exception {
        int[] input = {8, 2, 6, 11, 7, 15};
        int target = 9;

        int[] indexes = main.twoSum(input, target);
        Assert.assertEquals(1, indexes[0]);
        Assert.assertEquals(4, indexes[1]);

    }



    @Test
    public void notFoundTestTwoSum() throws Exception {
        int[] input = {3, 2, 5, 11, 9, 15};
        int target = 9;

        int[] indexes = main.twoSum(input, target);
        Assert.assertNull(indexes);

    }
}
