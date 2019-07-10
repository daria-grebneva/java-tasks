package com.tasks;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 1048575;
    private final Stack<Integer> stack = new Stack<>();

    public int solution(String S) {
        try {
            if (!isInputStringCorrect(S)) {
                throw new IllegalArgumentException("String must be in range [0...2000]");
            }
            Arrays.asList(S.split(" ")).forEach(this::processMachineWord);
            return pop();
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    private void processMachineWord(String s) {
        if (isNumeric(s)) {
            push(Integer.valueOf(s));
        } else {
            switch (s) {
                case ("POP"):
                    pop();
                    break;
                case ("DUP"):
                    dup();
                    break;
                case ("+"):
                    add();
                    break;
                case ("-"):
                    sub();
                    break;
                default:
                    break;
            }
        }
    }

    private void push(int num) {
        checkOutOfRange(num);
        stack.push(num);
    }

    private int pop() {
        checkStackSize(1);
        return stack.pop();
    }

    private void dup() {
        checkStackSize(1);
        push(stack.peek());
    }

    private void add() {
        checkStackSize(2);
        push(stack.pop() + stack.pop());
    }

    private void sub() {
        checkStackSize(2);
        push(stack.pop() - stack.pop());
    }

    private void checkOutOfRange(int num) {
        if (num < LOWER_BOUND || num > UPPER_BOUND) {
            throw new IllegalArgumentException("Number out of range");
        }
    }

    private void checkStackSize(int minimalSize) {
        if (stack.size() < minimalSize) {
            throw new IllegalArgumentException("There are no numbers in the stack to perform this operation.");
        }
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private boolean isInputStringCorrect(String S) {
        return (S.length() <= 2000);
    }
}