package com.tasks;

import org.apache.log4j.Logger;

public class App
{
    private static final Logger LOG = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        Solution tree = new Solution();
        tree.root = new Tree(4);
        tree.root.left = new Tree(3);
        tree.root.right = new Tree(6);
        tree.root.right.left = new Tree(1);
        tree.root.right.right = new Tree(6);
        tree.root.left.left = new Tree(2);
        tree.root.left.left.left = new Tree(1);
        tree.root.left.left.left.left = new Tree(5);

        LOG.info(tree.getMaxDistingValuesNumber());
    }
}