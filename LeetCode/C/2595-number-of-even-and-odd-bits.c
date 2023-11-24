/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
#include <stdlib.h>

int* evenOddBit(int n, int* returnSize) {
    *returnSize = 2;
    int *result = malloc(2 * sizeof(int));    
    result[0] = 0;
    result[1] = 0;
    int even = 0;
    int odd = 0;
    for (int i = 0; n != 0; n >>= 1, i++) {
        if (n & 1) {
            (i % 2 == 0) ? even++ : odd++;
        }
    }
    result[0] = even;
    result[1] = odd;
    return result;
}