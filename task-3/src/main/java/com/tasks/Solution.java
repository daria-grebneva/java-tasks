package com.tasks;

import com.tasks.exceptions.IncorrectArgumentException;

import java.util.Stack;

public class Solution {

    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 1048575;
    private Stack<Integer> stack = new Stack<>();

    public int solution(String S) {
        try {
            if (!isInputStringCorrect(S)) {
                throw new IncorrectArgumentException("String must be in range [0...2000]");
            }
            for (String s : S.split(" ")) {
                processMachineWord(s);
            }
            return pop();
        } catch (IncorrectArgumentException e) {
            return -1;
        }
    }

    private void processMachineWord(String s) throws IncorrectArgumentException {
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

    private void push(int num) throws IncorrectArgumentException {
        checkOutOfRange(num);
        stack.push(num);
    }

    private int pop() throws IncorrectArgumentException {
        checkStackSize(1);
        return stack.pop();
    }

    private void dup() throws IncorrectArgumentException {
        checkStackSize(1);
        push(stack.peek());
    }

    private void add() throws IncorrectArgumentException {
        checkStackSize(2);
        push(stack.pop() + stack.pop());
    }

    private void sub() throws IncorrectArgumentException {
        checkStackSize(2);
        push(stack.pop() - stack.pop());
    }

    private void checkOutOfRange(int num) throws IncorrectArgumentException {
        if (num < LOWER_BOUND || num > UPPER_BOUND) {
            throw new IncorrectArgumentException("Number out of range");
        }
    }

    private void checkStackSize(int minimalSize) throws IncorrectArgumentException {
        if (stack.size() < minimalSize) {
            throw new IncorrectArgumentException("There are no numbers in the stack to perform this operation.");
        }
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private boolean isInputStringCorrect(String S) {
        return (S.length() <= 2000);
    }
}