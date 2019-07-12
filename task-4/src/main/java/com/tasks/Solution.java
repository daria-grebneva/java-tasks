package com.tasks;

import com.tasks.exceptions.IncorrectArgumentException;

import java.util.HashMap;

import static java.lang.Math.max;

public class Solution {
    public Tree root;

    public Solution() {
        root = null;
    }

    private int getMaxDistingValuesNumberUtil(Tree node, HashMap<Integer, Integer> m) throws IncorrectArgumentException {
        if (node == null)
            return m.size();

        if ((node.key < 1) || (node.key > 50000)) {
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

    public int getMaxDistingValuesNumber() throws IncorrectArgumentException {
        if (root == null)
            return 0;

        HashMap<Integer, Integer> hash = new HashMap<>();
        Integer depth = maxDepthUtil(root);

        if (depth < 0 || depth > 3500) {
            throw new IncorrectArgumentException("Tree depth is out of range");
        }
        return getMaxDistingValuesNumberUtil(root, hash);
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

    public void fillTree(int value) {
        root = fillTreeUtil(root, value);
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
