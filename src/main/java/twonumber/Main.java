package twonumber;

/**
 * Created with IntelliJ IDEA.
 * User: Shaozhen
 * Date: 1/2/14
 * Time: 10:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode head = new ListNode(-1);
        ListNode pointer = head;
        int addition = 0;
        while(node1 != null || node2 !=null){
            int value = (node1 == null ? 0 : node1.val) + (node2 == null ? 0 : node2.val) + addition;
            if(value >= 10){
                value = value - 10;
                addition = 1;
            }
            else{
                addition = 0;
            }
            pointer.next = new ListNode(value);
            pointer = pointer.next;
            if(node1 != null) {
                node1 = node1.next;
            }
            if(node2 != null) {
                node2 = node2.next;
            }
        }
        if(addition == 1){
            pointer.next = new ListNode(1);
        }
        return head.next;
    }
}
