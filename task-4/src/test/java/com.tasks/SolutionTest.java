package com.tasks;

import org.junit.*;
import org.junit.rules.ExpectedException;
import com.tasks.exceptions.IncorrectArgumentException;

public class SolutionTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void canProcessSimpleTree() throws IncorrectArgumentException {
        Tree tree = new Tree(4);
        tree.left = new Tree(5);
        tree.right = new Tree(6);
        tree.right.left = new Tree(1);
        tree.right.right = new Tree(6);
        tree.left.left = new Tree(4);
        tree.left.left.left = new Tree(5);
        tree.left.left.left.left = new Tree(5);
        Solution solution = new Solution(tree);

        Assert.assertEquals(3, solution.getMaxDistingValuesNumber());
    }

    @Test
    public void throwsExceptionWhenNodeValueBelowAcceptable() throws IncorrectArgumentException {
        Tree tree = new Tree(-1);
        tree.left = new Tree(5);
        tree.right = new Tree(6);
        expectedEx.expect(IncorrectArgumentException.class);
        expectedEx.expectMessage("Tree node value out of range");

        Solution solution = new Solution(tree);
        solution.getMaxDistingValuesNumber();
    }

    @Test
    public void throwsExceptionWhenNodeValueIsMoreThanAcceptable() throws IncorrectArgumentException {
        Tree tree = new Tree(50001);
        tree.left = new Tree(5);
        tree.right = new Tree(6);

        expectedEx.expect(IncorrectArgumentException.class);
        expectedEx.expectMessage("Tree node value out of range");

        Solution solution = new Solution(tree);
        solution.getMaxDistingValuesNumber();
    }

    @Test
    public void throwsExceptionWhenDepthOfTreeIsMoreThanAcceptable() throws IncorrectArgumentException {

        expectedEx.expect(IncorrectArgumentException.class);
        expectedEx.expectMessage("Tree depth is out of range");

        Tree tree = new Tree(1);
        Solution solution = new Solution(tree);
        for (int i = 1; i < 4000; ++i)
        {
            solution.fillTree(i);
        }

        solution.getMaxDistingValuesNumber();
    }
}