package zigzag;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 1/2/14
 * Time: 4:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {
    Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void testConvert() throws Exception {
        Assert.assertEquals("PAHNAPLSIIGYIR", main.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void testZigZagConvert() throws Exception {
        Assert.assertEquals("A", main.convert("A", 1));
    }

    @Test
    public void testZigZagConvert2() throws Exception {
        Assert.assertEquals("ABCDEF", main.convert("ABCDEF", 6));
    }
}
