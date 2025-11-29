/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//iterative approach
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode slow = null;
        while(head != null){
            temp = head;
            head = head.next;
            temp.next = slow;
            slow = temp;
        }
        return temp;
    }
}
//recursive approach
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}