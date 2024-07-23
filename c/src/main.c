#include "stdio.h"

#include "leetcode1/n0027/N27_RemoveElement.h"

int main() {
    int nums[] = {3, 2, 2, 3};
    int val = 3;
    int res = removeElement(nums, 4, val);
    printf("算法结果: %d\n", res);
    return 0;
}