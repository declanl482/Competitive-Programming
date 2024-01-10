#include <stdlib.h>

/** Definition for singly-linked list. **/
struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode dummy = {0};        // Create a dummy node which we will anchor the merged list onto.
    struct ListNode *cur = &dummy;
    
    while (list1 != NULL && list2 != NULL) {
        if (list1 -> val < list2 -> val) {
            cur -> next = list1;        // If the list1 node has a lesser value than the list2 node, anchor on the list1 node.
            list1 = list1 -> next;
        }    
        else {
            cur -> next = list2;        // Otherwise anchor on the list2 node.
            list2 = list2 -> next;
        }
        cur = cur -> next;
    }
    
    cur -> next = (list1 == NULL) ? list2 : list1;  // Anchor on the remaining nodes in the list that is not yet null.
    
    return dummy.next;
}