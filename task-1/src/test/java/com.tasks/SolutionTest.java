package com.tasks;

import org.junit.*;

public class SolutionTest {

    @Test
    public void can_find_the_shortest_length_for_simple_data() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.solution(17));
    }
}