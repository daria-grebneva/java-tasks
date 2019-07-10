package com.tasks;

import org.junit.*;

public class SolutionTest {
    @Test
    public void can_find_the_most_words_in_a_sentence_with_a_dot_and_an_exclamation_point() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.solution("We test coders. Give us a try?"));
    }

    @Test
    public void can_find_the_most_words_in_a_sentence_with_several_points() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution("Forget CVs..Save time . x x"));
    }

    @Test
    public void can_find_the_most_words_in_a_sentence_with_a_few_spaces() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.solution(" Forget CVs    Save time       x x"));
    }

    @Test
    public void can_find_the_most_words_in_a_sentence_with_an_exclamation_mark() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.solution(" Forget CVs! Save time       x x"));
    }

    @Test
    public void can_find_the_most_words_in_a_sentence_with_many_characters() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution(" Forget CVs! Save !time.   ???   x ..x"));
    }
}