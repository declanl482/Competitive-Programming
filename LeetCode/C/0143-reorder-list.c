#include <stdlib.h>

/** Definition for singly-linked list. **/
struct ListNode {
     int val;
     struct ListNode *next;
};


// Function that computes the length of a singly-linked list.
int size(struct ListNode* head) {
    int len = 0;
    struct ListNode *lenPtr = head;
    while (lenPtr != NULL) {
        len++;
        lenPtr = lenPtr -> next;
    }
    return len;
}

void reorderList(struct ListNode* head) {
    int len = size(head);
    if (len == 0 || len == 1) {
        return;
    }
    struct ListNode **nodes = (struct ListNode**)malloc(len * sizeof(struct ListNode*)); // Dynamically allocate space for an array of node pointers.
    struct ListNode *itr = head;
    for (int i = 0; itr != NULL && i < len; i++) { // Fill the array with node pointers from the given list.
        nodes[i] = itr;
        itr = itr -> next;
    }
    
    for (int i = 0, j = len - 1; i < j; i++, j--) { // Rearrange the linked list to match the specified pattern.
        nodes[i]->next = nodes[j];
        nodes[j]->next = (i + 1 < j) ? nodes[i + 1] : NULL;
    }
    
    nodes[len / 2] -> next = NULL;
    
    free(nodes);
}