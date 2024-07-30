cmake_minimum_required(VERSION 3.16)
project(c)

set(CMAKE_C_STANDARD 99)

set(SOURCES
        src/main.c
        src/leetcode1/n0027/N27_RemoveElement.c
        src/leetcode1/n0067/N67_AddBinary.c
        )

set(HEADERS
        src/leetcode1/n0027/N27_RemoveElement.h
        src/leetcode1/n0067/N67_AddBinary.h)

add_executable(${PROJECT_NAME} ${SOURCES} ${HEADERS})