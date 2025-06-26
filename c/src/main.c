#include "stdio.h"


#include "leetcode1/n0704/N704_BinarySearch.h"

int main() {
    int nums[] = {-1, 0, 3, 5, 9, 12};
    int numsSize = 6;
    int target = 9;
    int res = search(nums, numsSize, target);
    printf("%d", res);
    return 0;
}