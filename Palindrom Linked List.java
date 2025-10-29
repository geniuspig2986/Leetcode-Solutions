// better solution is to reverse second half in place
import java.util.Stack;
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> elements = new Stack<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        dummy = dummy.next;
        int listLength = 0;
        int curPos = 0;
        while(head != null){
            listLength++;
            head = head.next;
        }
        for (int i = 0; i < listLength / 2; i++) {
            elements.push(dummy.val);
            dummy = dummy.next;
        }
        if(listLength % 2 == 1){
            dummy = dummy.next;
        }
        while(dummy != null){
            if(dummy.val != elements.pop()){
                return false;
            }
            dummy = dummy.next;
        }
        return true;
    }
}