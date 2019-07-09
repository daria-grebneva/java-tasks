package com.tasks;
import java.lang.IllegalArgumentException;

public class Solution {

    public int solution(int N) {

        if (N < 0)
        {
            throw new IllegalArgumentException("The number should be positive");
        }

        int result = 0;

        while (N >= 1) {
            N = (N % 2 == 0) ? (N / 2) : (--N);
            ++result;
        }

        return result;
    }
}