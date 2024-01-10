#include <stdlib.h>

/** Definition for singly-linked list. **/
struct ListNode
{
    int val;
    struct ListNode *next;
};

struct ListNode *reverseList(struct ListNode *head) {
    if (head == NULL || head->next == NULL)
    {
        return head; // Return the head if the list is empty or contains only a single node.
    }

    struct ListNode *next;
    struct ListNode *prev = NULL;
    struct ListNode *cur = head;

    while (cur != NULL)
    {
        next = cur->next; // Maintain a pointer to the next node in the list.
        cur->next = prev; // Reverse the direction of the link for the current node.
        prev = cur;       // Advance the prev pointer to the current node.
        cur = next;       // Advance the cur pointer to the next node in the list.
    }

    return prev;
}