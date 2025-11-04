/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//hashmap solution
import java.util.HashMap;
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> listMap = new HashSet<>();
        while(head != null){
            if(listMap.contains(head)){
                return head;
            }
            listMap.add(head);
            head = head.next;
        }
        return null;
    }
}
//fast and slow pointers solution
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        var isCyclic = false;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}