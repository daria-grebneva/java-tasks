package com.tasks;

public class Solution {

    public int solution(int N) {
        int result = 0;

        while (N > 1) {
            int temp = N % 2;

            if (temp == 0) {
                N = N / 2;
                ++result;
            } else {
                N = N - 1;
                ++result;
            }
        }

        if (N == 1) {
            ++result;
        }

        return result;
    }
}