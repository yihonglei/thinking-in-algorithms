#include <iostream>
#include <vector>

#include "leetcode1/n0704/N704_BinarySearch.hpp"

int main() {
    N704_BinarySearch c;
    std::vector<int> arr = {-1, 0, 3, 5, 9, 12};
    int target = 9;
    int result = c.search(arr, target);
    std::cout << result << " ";
    return 0;
}

