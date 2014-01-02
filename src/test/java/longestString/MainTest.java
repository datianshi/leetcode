package longestString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 1/1/14
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void basicTest() throws Exception {
        Assert.assertEquals(4, main.lengthOfLongestSubstring("abcabcbbbehgbb"));
        Assert.assertEquals(1, main.lengthOfLongestSubstring("bbbbbb"));
    }

    @Test
    public void leetCodeEdge() throws Exception {
        Assert.assertEquals(12, main.lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));
        Assert.assertEquals(4, main.lengthOfLongestSubstring("abcad"));
    }
}
