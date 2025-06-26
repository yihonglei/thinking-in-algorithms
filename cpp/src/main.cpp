#include <iostream>

#include "leetcode1/n0704/N704_BinarySearch.hpp"

int main() {
    N704_BinarySearch re;

    std::vector<int> nums = {-1, 0, 3, 5, 9, 12};
    int target = 9;

    int res = re.search(nums, target);
    std::cout << res << std::endl;
    return 0;
}

