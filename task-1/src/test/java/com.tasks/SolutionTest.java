package com.tasks;

import org.junit.*;
import java.lang.IllegalArgumentException;

public class SolutionTest {

    @Test
    public void can_find_the_shortest_length_for_simple_data() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.solution(17));
    }

    @Test
    public void can_find_the_shortest_length_for_assumptions_1() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(1));
    }

    @Test
    public void can_find_the_shortest_length_for_assumptions_2() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution(2));
    }

    @Test
    public void can_find_the_shortest_length_for_assumptions_483() {
        Solution solution = new Solution();
        Assert.assertEquals(483, solution.solution(14));
    }


    @Test
    public void can_find_the_shortest_length_for_assumptions_483() {
        Solution solution = new Solution();
        Assert.assertEquals(647, solution.solution(14));
    }

    @Test (expected = IllegalArgumentException.class)
    public void throws_an_exception_for_non_positive_number() {
        Solution solution = new Solution();
        solution.solution(-100);
    }

    @Test
    public void check_of_extreme_values() {
        Solution solution = new Solution();
        Assert.assertEquals(61, solution.solution(2147483647));
    }

//    TODO:: check out of int exception
//    @Test (expected = NumberFormatException.class)
//    public void redundancy_check() {
//        Solution solution = new Solution();
//        Assert.assertEquals(61, solution.solution(2147483648));
//    }
}