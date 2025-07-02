#include "stdio.h"


#include "leetcode1/n0027/N27_RemoveElement.h"

int main() {
    int nums[] = {3, 2, 2, 3};
    int numsSize = 4;
    int val = 3;
    int res = removeElement((int *) &nums, numsSize, val);
    printf("%d", res);
    return 0;
}