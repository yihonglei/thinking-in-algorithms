#include <iostream>
#include <string>
using namespace std;

#include "leetcode1/n0067/N67_AddBinary.hpp"

int main() {
    N67_ADDBINARY re;

    string res = re.addBinary("1010", "1011");
    std::cout << res << std::endl;
    return 0;
}

