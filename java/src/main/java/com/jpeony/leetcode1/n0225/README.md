# [225. Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/)

## 题目

Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support 
all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:
- void push(int x) Pushes element x to the top of the stack.
- int pop() Removes the element on the top of the stack and returns it.
- int top() Returns the element on the top of the stack.
- boolean empty() Returns true if the stack is empty, false otherwise.

**Notes:**
- You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
- Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque 
(double-ended queue) as long as you use only a queue's standard operations.

Example 1:
```
Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False
```

Constraints:
- 1 <= x <= 9
- At most 100 calls will be made to push, pop, top, and empty.
- All the calls to pop and top are valid.

**Follow-up:** Can you implement the stack using only one queue?

## 题目含义

用队列实现栈。
队列是先进先出，元素从后端入队，从前端出队。
栈是后进先出，元素从栈顶入栈，从栈顶出栈。

## 算法思路

【一个队列】

1、队列是先进先出的，而栈的后进先出的；

2、每次往队列插入元素时，之前的元素全部出队重新插入一遍，当栈出队时从队列头部取值，就能慢足栈后进先出的特性；

## 复杂度分析

时间复杂度：入栈操作 O(n)，其余操作都是 O(1)。 n 为栈内元素个数。

空间复杂度：O(n)。n 为栈内元素个数。
