#include <iostream>
#include <vector>

#include "leetcode1/n0209/N209_MinimumSizeSubarraySum.hpp"

int main() {
    N209_MinimumSizeSubarraySum c;
    std::vector<int> arr = {2, 3, 1, 2, 4, 3};
    int target = 7;
    int result = c.minSubArrayLen(target, arr);
    std::cout << result << " ";
    return 0;
}

