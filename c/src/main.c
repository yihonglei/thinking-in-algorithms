#include "stdio.h"


#include "leetcode1/n0704//N704_BinarySearch.h"

int main() {
    int nums[] = {-1, 0, 3, 5, 9, 12};
    int numsSize = 6;
    int target = 9;
    int result = search((int *) &nums, numsSize, target);
    printf("%d", result);
    return 0;
}