package com.tasks;

import org.junit.*;
import java.lang.IllegalArgumentException;
import org.junit.rules.ExpectedException;

public class SolutionTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

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

    @Test
    public void throws_an_exception_when_string_is_too_large() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Length of string is not in range [1...100]");
        Solution solution = new Solution();
        solution.solution(" Forgeaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaxaaaaaaaaaaaaaaaaaaaaaaaaaaaaa sssssssssssssssss ddddddddddddddddddddddddddddddddddddddddddddddddddt CVs! Save !time.   ???   x ..x");
    }

    @Test
    public void throws_an_exception_when_string_is_too_small() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Length of string is not in range [1...100]");
        Solution solution = new Solution();
        solution.solution("");
    }

    @Test
    public void throws_an_exception_when_string_contains_wrong_symbols() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("String contains unacceptable symbols");
        Solution solution = new Solution();
        solution.solution("Some string with 1 wrong symbol");
    }
}