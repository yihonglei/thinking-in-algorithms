#include "stdio.h"
#include <vector>

#include "leetcode1/n0027/N27_RemoveElement.hpp"

int main() {
    std::vector<int> nums = {3, 2, 2, 3};
    int val = 3;

    N27_RemoveElement re;

    int res = re.removeElement(nums, val);
    printf("算法结果: %d\n", res);
    return 0;
}

