package com.tasks;
import org.apache.log4j.Logger;

public class App {
    private static final Logger LOG = Logger.getLogger(App.class);

    public static void main(String[] args) {
        Tree tree = new Tree(4);
        tree.left = new Tree(5);
        tree.right = new Tree(6);
        tree.right.left = new Tree(1);
        tree.right.right = new Tree(6);
        tree.left.left = new Tree(4);
        tree.left.left.left = new Tree(5);
        tree.left.left.left.left = new Tree(5);

        try {
            Solution solution = new Solution(tree);
            LOG.info(solution.getMaxDistingValuesNumber());
        } catch (Exception e) {
            LOG.error(e.getMessage());
        }
    }
}