package com.tasks;

import com.tasks.utils.TestUtilites;
import org.junit.*;

public class SolutionTest {

    @Test
    public void canProcessStandartInput() {
        Solution solution = new Solution();
        Assert.assertEquals(7, solution.solution("13 DUP 4 POP 5 DUP + DUP + -"));
    }

    @Test
    public void canProcessBigInput() {
        Solution solution = new Solution();
        Assert.assertEquals(7, solution.solution("13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + -"));
    }

    @Test
    public void canHandleOutOfRangeeOfInputString() {
        Solution solution = new Solution();
        String filePath = TestUtilites.getPathToTestFile("BigInputSentence.txt");
        String bigSentence = TestUtilites.gelFileContent(filePath);
        Assert.assertEquals(-1, solution.solution(bigSentence));
    }

    @Test
    public void canHandleOutOfRangeWithOverflow() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("1048576 POP 3 DUP"));
    }

    @Test
    public void canHandleOutOfRangeWithUnderflow() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("-12 POP 3 DUP"));
    }

    @Test
    public void canHandleOutOfRangeWithPlusOperation() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("1048575 1 +"));
    }

    @Test
    public void canHandleOutOfRangeWithMinusOperation() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("3 DUP 5 - -"));
    }

    @Test
    public void throwAnExceptionIfThereAreFewerNumbersOnTheStack() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("5 6 + -"));
    }

    @Test
    public void throwsAnExceptionWhenNothingIsLeftOnTheStack() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("30 POP"));
    }
}