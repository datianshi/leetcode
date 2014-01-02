package palindromic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 1/2/14
 * Time: 2:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    Main main;
    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void testLongestPalindrome() throws Exception {
        Assert.assertEquals("abcba", main.longestPalindrome("asdhabcbaof"));
        Assert.assertEquals("a", main.longestPalindrome("a"));
        Assert.assertEquals("a", main.longestPalindrome("abc"));
        Assert.assertEquals("aa", main.longestPalindrome("aa"));
        Assert.assertEquals("aa", main.longestPalindrome("caad"));
        Assert.assertEquals("aa", main.longestPalindrome("cmaa"));
        Assert.assertEquals("abcba", main.longestPalindrome("aaahabcbaof"));
        Assert.assertEquals("abcba", main.longestPalindrome("aaahabcba"));
        Assert.assertEquals("cc", main.longestPalindrome("acc"));
        Assert.assertEquals("ccc", main.longestPalindrome("acccb"));
        Assert.assertEquals("cccc", main.longestPalindrome("accccb"));
    }

    @Test
    public void testLeetCodeEdge(){
        Assert.assertEquals("ccc", main.longestPalindrome("ccc"));
    }

    @Test
    public void testLeetCodeEdge2(){
        Assert.assertEquals("cccc", main.longestPalindrome("cccc"));
    }
}
