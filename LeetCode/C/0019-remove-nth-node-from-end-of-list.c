#include <stdlib.h>

/** Definition for singly-linked list. **/
struct ListNode {
    int val;
    struct ListNode *next;
};

// Function that computes the size of a singly-linked list.
int size(struct ListNode* head) {
    struct ListNode* ptr = head;
    int len = 0;
    while (ptr != NULL) {
        len++;
        ptr = ptr -> next;
    }
    return len;
}

struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    int len = size(head);
    struct ListNode *ptr = head;
    if (len == n) {
        return head -> next;            // Handle the case where the head element is being removed.
    }
    for (int i = 1; i < len - n; i++) {
        ptr = ptr -> next;              // Advance the node pointer to the node preceding the target node.
    }
    ptr -> next = ptr -> next -> next;  // Relink to the node that follows the target node (can be null).
    
    return head;                        // Return the original pointer to the head node.
    
}