cmake_minimum_required(VERSION 3.16) # 最低CMake版本
project(cpp) # 项目名称与版本

# 设置C++标准
set(CMAKE_CXX_STANDARD 14)

#set(SOURCES
#        src/main.cpp)
#
#set(HEADERS
#        src/leetcode1/n0704/N704_BinarySearch.hpp
#        src/leetcode1/n0704/N704_BinarySearch.cpp)
# 添加源文件
file(GLOB_RECURSE SOURCES "src/*.cpp")

# 添加可执行文件
add_executable(cpp ${SOURCES})