package com.tasks;

public class Solution {

    public int solution(String S) {
        Integer number = 0;
        String[] splitString = S.split("[.!?]");

        for (String str : splitString) {
            Integer newNumber = getWordsNumberFromSentence(str);
            number = (number < newNumber) ? newNumber : number;
        }

        return number;
    }

    private Integer getWordsNumberFromSentence(String elem)
    {
        String[] splitString = elem.trim().split("\\s+");

        return splitString.length;
    }
}
