#include "stdio.h"


#include "leetcode1/n0067/N67_AddBinary.h"

int main() {
    char a[] = "1010";
    char b[] = "1011";
    char* res = addBinary(a, b);
    printf("%s\n", res);
    return 0;
}