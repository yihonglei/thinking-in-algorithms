# [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)

## 题目

Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all 
the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:
- void push(int x) Pushes element x to the back of the queue.
- int pop() Removes the element from the front of the queue and returns it.
- int peek() Returns the element at the front of the queue.
- boolean empty() Returns true if the queue is empty, false otherwise.

**Notes:**
- You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
- Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) 
as long as you use only a stack's standard operations.

Example 1:
```
Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]

Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false
```

Constraints:
- 1 <= x <= 9
- At most 100 calls will be made to push, pop, peek, and empty.
- All the calls to pop and peek are valid.

**Follow-up:** Can you implement the queue such that each operation is amortized O(1) time complexity? In other words, 
performing n operations will take overall O(n) time even if one of those operations may take longer.

## 题目含义

用栈实现队列。栈是先进后出，队列是先进先出。

## 算法思路

【两个栈】

1、一个栈负责队列的入队，一个栈负责队列的出队；

2、出队队列为空的时候，需要把入队队列出队转到出队队列中，保持队列的先进先出特性；

3、如果出队队列不为空，不能将入队队列转到出队队列中，否则不能保证先进先出的特性；

## 复杂度分析

时间复杂度：O(1)。元素入栈时间复杂度为 O(1)。

空间复杂度：O(n)。n 为队列存储空间元素个数。
