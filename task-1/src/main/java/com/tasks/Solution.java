package com.tasks;
import com.tasks.exceptions.IncorrectArgumentException;

public class Solution {

    public int solution(int N) throws IncorrectArgumentException {

        if (N < 0)
        {
            throw new IncorrectArgumentException("The number should be positive");
        }

        int result = 0;

        while (N >= 1) {
            N = (N % 2 == 0) ? (N / 2) : (--N);
            ++result;
        }

        return result;
    }
}