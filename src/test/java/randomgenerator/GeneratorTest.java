package randomgenerator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: liujia
 * Date: 12/30/13
 * Time: 2:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class GeneratorTest {

    Generator generator;

    @Before
    public void setUp() throws Exception {
        generator = new Generator();
    }

    @Test
    public void shouldReturnCorrectLength() throws Exception {
        Assert.assertEquals(10, generator.array(10).length);
    }

    @Test
    public void printArray() throws Exception {
        int[] array = generator.array(10);
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
