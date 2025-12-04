class Solution {
public:
    ListNode* sortList(ListNode* head) {
        if (!head || !head->next){
            return head;
        }

        ListNode* fast = head;
        ListNode* slow = head;
        ListNode* temp = head;

        while (fast != nullptr && fast->next != nullptr) {
            temp = slow;
            slow = slow->next;       
            fast = fast->next->next;
        }
        temp->next = nullptr;
        ListNode* leftSide = sortList(head);
        ListNode* rightSide = sortList(slow);
        return merge(leftSide, rightSide);
    }
private:
    ListNode* merge(ListNode* l1, ListNode* l2) {
        ListNode dummy(0);
        ListNode* curr = &dummy;
        
        while (l1 != nullptr && l2 != nullptr) {
            if (l1->val < l2->val) {
                curr->next = l1;
                l1 = l1->next;
            } else {
                curr->next = l2;
                l2 = l2->next;
            }
            curr = curr->next;
        }
        
        if (l1 != nullptr) curr->next = l1;
        if (l2 != nullptr) curr->next = l2;
        
        return dummy.next;
    }
};