cmake_minimum_required(VERSION 3.16) # 最低CMake版本
project(c) # 项目名称与版本

# 设置C标准
set(CMAKE_C_STANDARD 99)

#set(SOURCES
#        src/main.c
#        src/leetcode1/n0027/N27_RemoveElement.c
#        src/leetcode1/n0067/N67_AddBinary.c
#        )
#
#set(HEADERS
#        src/leetcode1/n0027/N27_RemoveElement.h
#        src/leetcode1/n0067/N67_AddBinary.h)

# 添加源文件
file(GLOB_RECURSE SOURCES "src/*.c")

# 添加可执行文件
add_executable(c ${SOURCES})