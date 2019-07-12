package com.tasks;

import org.junit.*;
import org.junit.rules.ExpectedException;
import com.tasks.exceptions.IncorrectArgumentException;

public class SolutionTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void canProcessSimpleTree() throws IncorrectArgumentException {
        Solution tree = new Solution();
        tree.root = new Tree(4);
        tree.root.left = new Tree(5);
        tree.root.right = new Tree(6);
        tree.root.right.left = new Tree(1);
        tree.root.right.right = new Tree(6);
        tree.root.left.left = new Tree(4);
        tree.root.left.left.left = new Tree(5);
        tree.root.left.left.left.left = new Tree(5);

        Assert.assertEquals(3, tree.getMaxDistingValuesNumber());
    }

    @Test
    public void throwsExceptionWhenNodeValueBelowAcceptable() throws IncorrectArgumentException {
        Solution tree = new Solution();
        tree.root = new Tree(-1);
        tree.root.left = new Tree(5);
        tree.root.right = new Tree(6);
        expectedEx.expect(IncorrectArgumentException.class);
        expectedEx.expectMessage("Tree node value out of range");

        tree.getMaxDistingValuesNumber();
    }

    @Test
    public void throwsExceptionWhenNodeValueIsMoreThanAcceptable() throws IncorrectArgumentException {
        Solution tree = new Solution();
        tree.root = new Tree(50001);
        tree.root.left = new Tree(5);
        tree.root.right = new Tree(6);
        expectedEx.expect(IncorrectArgumentException.class);
        expectedEx.expectMessage("Tree node value out of range");

        tree.getMaxDistingValuesNumber();
    }

    @Test
    public void throwsExceptionWhenDepthOfTreeIsMoreThanAcceptable() throws IncorrectArgumentException {
        Solution tree = new Solution();
        for (int i = 0; i < 3501; ++i)
        {
            tree.fillTree(i);
        }
        expectedEx.expect(IncorrectArgumentException.class);
        expectedEx.expectMessage("Tree depth is out of range");

        tree.getMaxDistingValuesNumber();
    }
}