package twonumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 1/2/14
 * Time: 11:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void testAddTwoNumbers(){
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode result = main.addTwoNumbers(listNode1, listNode4);
        Assert.assertEquals(7, result.val);
        Assert.assertEquals(0, result.next.val);
        Assert.assertEquals(8, result.next.next.val);

    }

    @Test
    public void leetCodeEdge(){
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(5);

        ListNode result = main.addTwoNumbers(listNode1, listNode2);
        Assert.assertEquals(0, result.val);
        Assert.assertEquals(1, result.next.val);

    }

    @Test
    public void leetCodeEdge2(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(8);
        ListNode listNode3 = new ListNode(0);

        listNode1.next = listNode2;

        ListNode result = main.addTwoNumbers(listNode1, listNode3);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(8, result.next.val);

    }
}
