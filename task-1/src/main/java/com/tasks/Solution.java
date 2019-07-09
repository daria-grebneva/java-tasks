package com.tasks;

public class Solution {

    public int solution(int N) {
        int result = 0;

        while (N >= 1) {
            N = (N % 2 == 0) ? (N / 2) : (--N);
            ++result;
        }

        return result;
    }
}