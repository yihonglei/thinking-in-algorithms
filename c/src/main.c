#include "stdio.h"


#include "leetcode1/n0209/N209_MinimumSizeSubarraySum.h"

int main() {
    int nums[] = {2, 3, 1, 2, 4, 3};
    int numsSize = 6;
    int target = 7;
    int result = minSubArrayLen(target, (int *) &nums, numsSize);
    printf("%d", result);
    return 0;
}