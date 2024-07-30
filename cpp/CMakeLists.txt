cmake_minimum_required(VERSION 3.16)
project(cpp)

set(CMAKE_CXX_STANDARD 14)

set(SOURCES
        src/main.cpp
        src/leetcode1/n0027/N27_RemoveElement.cpp
        src/leetcode1/n0067/N67_AddBinary.cpp)

set(HEADERS
        src/leetcode1/n0027/N27_RemoveElement.hpp
        src/leetcode1/n0067/N67_AddBinary.hpp)

add_executable(${PROJECT_NAME} ${SOURCES} ${HEADERS})