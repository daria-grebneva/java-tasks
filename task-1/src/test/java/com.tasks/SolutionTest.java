package com.tasks;

import com.tasks.exceptions.IncorrectArgumentException;
import org.junit.*;

import static org.junit.Assert.fail;

public class SolutionTest {

    @Test
    public void canFindTheShortestLengthForSimpleData() throws IncorrectArgumentException {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.solution(17));
    }

    @Test
    public void canFinTheShortestLengthForAssumptions1() throws IncorrectArgumentException {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(1));
    }

    @Test
    public void canFindTheShortestLengthForAssumptions2() throws IncorrectArgumentException {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution(2));
    }

    @Test
    public void canFindTheShortestLengthForAssumptions483() throws IncorrectArgumentException {
        Solution solution = new Solution();
        Assert.assertEquals(14, solution.solution(483));
    }

    @Test
    public void canFindTheShortestLengthForAssumptions647() throws IncorrectArgumentException {
        Solution solution = new Solution();
        Assert.assertEquals(14, solution.solution(647));
    }

    @Test
    public void throwsAnExceptionForNonPositiveNumber() {
        Solution solution = new Solution();
        try {
            solution.solution(-100);
            fail();
        } catch (Exception e) {
            Assert.assertEquals("The number should be positive", e.getMessage());
            Assert.assertEquals(IncorrectArgumentException.class, e.getClass());
        }
    }

    @Test
    public void checkOfExtremeValues() throws IncorrectArgumentException {
        Solution solution = new Solution();
        Assert.assertEquals(61, solution.solution(2147483647));
    }
}