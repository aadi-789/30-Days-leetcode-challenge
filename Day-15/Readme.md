# LeetCode 20 — Valid Parentheses

## Problem

Given a string containing `()`, `{}`, and `[]`, determine whether the brackets are valid and properly nested.

## Approach

* Use a Stack.
* Push every opening bracket.
* For every closing bracket:

  * Check if the stack is empty.
  * Pop the top bracket.
  * Verify that it matches the closing bracket.
* At the end, the stack must be empty.

## Example

```text
Input:  s = "()[]{}"
Output: true

Input:  s = "([)]"
Output: false
```

## Complexity

* Time: O(n)
* Space: O(n)

## Pattern

Stack — Matching Parentheses


# LeetCode 155 — Min Stack

## Problem

Design a stack that supports `push`, `pop`, `top`, and retrieving the minimum element in O(1) time.

## Approach

Use two stacks:

* `stack` stores all elements.
* `minStack` stores the minimum values.

When pushing, add the value to `minStack` if it is smaller than or equal to the current minimum.

When popping, remove from `minStack` if the removed value is the current minimum.

## Example

```text
push(5)
push(3)
push(7)
push(2)

getMin() → 2
```

## Complexity

* Push: O(1)
* Pop: O(1)
* Top: O(1)
* GetMin: O(1)
* Space: O(n)

## Pattern

Stack + Auxiliary Stack


# LeetCode 150 — Evaluate Reverse Polish Notation

## Problem

Evaluate an arithmetic expression given in Reverse Polish Notation using `+`, `-`, `*`, and `/`.

## Approach

* Use a Stack.
* If the token is a number, push it.
* If the token is an operator:

  * Pop the second operand.
  * Pop the first operand.
  * Perform the operation.
  * Push the result back.
* Return the final value in the stack.

## Example

```text
Input: ["2","1","+","3","*"]

2 + 1 = 3
3 * 3 = 9

Output: 9
```

## Complexity

* Time: O(n)
* Space: O(n)

## Pattern

Stack — Expression Evaluation

