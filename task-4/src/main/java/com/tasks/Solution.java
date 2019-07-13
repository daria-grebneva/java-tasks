package com.tasks;

import com.tasks.exceptions.IncorrectArgumentException;

import java.util.HashMap;

import static java.lang.Math.max;

public class Solution {

    private Tree node;
    private static final int MIN_DEPTH = 0;
    private static final int MAX_DEPTH = 3500;
    private static final int MIN_NODE_VALUE = 1;
    private static final int MAX_NODE_VALUE = 50000;

    public Solution(Tree tree) {
        node = tree;
    }

    public int getMaxDistingValuesNumber() throws IncorrectArgumentException {
        if (node == null)
            return 0;

        HashMap<Integer, Integer> hash = new HashMap<>();
        Integer depth = maxDepthUtil(node);

        if (depth < MIN_DEPTH || depth > MAX_DEPTH) {
            throw new IncorrectArgumentException("Tree depth is out of range");
        }
        return getMaxDistingValuesNumberUtil(node, hash);
    }

    public void fillTree(int value) {
        node = fillTreeUtil(node, value);
    }

    private int getMaxDistingValuesNumberUtil(Tree node, HashMap<Integer, Integer> m) throws IncorrectArgumentException {
        if (node == null)
            return m.size();

        if ((node.key < MIN_NODE_VALUE) || (node.key > MAX_NODE_VALUE)) {
            throw new IncorrectArgumentException("Tree node value out of range");
        }

        m.put(node.key, (m.containsKey(node.key)) ? (m.get(node.key) + 1) : 1);

        int max = max(getMaxDistingValuesNumberUtil(node.left, m),
                getMaxDistingValuesNumberUtil(node.right, m));


        if (m.containsKey(node.key)) {
            m.put(node.key, m.get(node.key) - 1);
        }

        if (m.get(node.key) == 0)
            m.remove(node.key);

        return max;
    }

    private int maxDepthUtil(Tree node) {
        if (node == null)
            return 0;
        else {
            int lDepth = maxDepthUtil(node.left);
            int rDepth = maxDepthUtil(node.right);

            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    private Tree fillTreeUtil(Tree current, int value) {
        if (current == null) {
            return new Tree(value);
        }

        if (value < current.key) {
            current.left = fillTreeUtil(current.left, value);
        } else if (value > current.key) {
            current.right = fillTreeUtil(current.right, value);
        } else {
            return current;
        }

        return current;
    }

}
