package com.tasks;

import com.tasks.exceptions.IncorrectArgumentException;

public class Solution {

    public int solution(String S) throws IncorrectArgumentException {

        Integer number = 0;

        if (S.length() < 1 || S.length() > 100) {
            throw new IncorrectArgumentException("Length of string is not in range [1...100]");
        }

        boolean isCorrectInputString = S.matches("[a-zA-Z\\s.!?]+");

        if (!isCorrectInputString) {
            throw new IncorrectArgumentException("String contains unacceptable symbols");
        }

        String[] splitString = S.split("[.!?]");

        for (String str : splitString) {
            Integer newNumber = getWordsNumberFromSentence(str);
            number = (number < newNumber) ? newNumber : number;
        }

        return number;
    }

    private Integer getWordsNumberFromSentence(String elem) {
        String[] splitString = elem.trim().split("\\s+");

        return splitString.length;
    }
}
