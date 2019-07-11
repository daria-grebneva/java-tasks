package com.tasks;

import org.junit.*;
import org.junit.rules.ExpectedException;
import com.tasks.exceptions.IncorrectArgumentException;

public class SolutionTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void canFindTheMostWordsInASentenceWithADotAndAnExclamationPoint() throws IncorrectArgumentException {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.solution("We test coders. Give us a try?"));
    }

    @Test
    public void canFindTheMostWordsInASentenceWithSeveralPoints() throws IncorrectArgumentException {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution("Forget CVs..Save time . x x"));
    }

    @Test
    public void canFindTheMostWordsInASentenceWithAFewSpaces() throws IncorrectArgumentException {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.solution(" Forget CVs    Save time       x x"));
    }

    @Test
    public void canFindTheMostWordsInASentenceWithAnExclamationMark() throws IncorrectArgumentException {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.solution(" Forget CVs! Save time       x x"));
    }

    @Test
    public void canFindTheMostWordsInASentenceWithManyCharacters() throws IncorrectArgumentException {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution(" Forget CVs! Save !time.   ???   x ..x"));
    }

    @Test
    public void throwsAnExceptionWhenStringIsTooLarge() throws IncorrectArgumentException {
        expectedEx.expect(IncorrectArgumentException.class);
        expectedEx.expectMessage("Length of string is not in range [1...100]");

        Solution solution = new Solution();
        solution.solution(" Forgeaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaxaaaaaaaaaaaaaaaaaaaaaaaaaaaaa sssssssssssssssss ddddddddddddddddddddddddddddddddddddddddddddddddddt CVs! Save !time.   ???   x ..x");
    }

    @Test
    public void throwsAnExceptionWhenStringIsTooSmall() throws IncorrectArgumentException {
        expectedEx.expect(IncorrectArgumentException.class);
        expectedEx.expectMessage("Length of string is not in range [1...100]");
        Solution solution = new Solution();
        solution.solution("");
    }

    @Test
    public void throwsAnExceptionWhenStringContainsWrongSymbols() throws IncorrectArgumentException {
        expectedEx.expect(IncorrectArgumentException.class);
        expectedEx.expectMessage("String contains unacceptable symbols");
        Solution solution = new Solution();
        solution.solution("Some string with 1 wrong symbol");
    }
}