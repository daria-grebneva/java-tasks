package com.tasks;

import org.apache.log4j.Logger;

public class App
{
    private static final Logger LOG = Logger.getLogger(App.class);

//    Solution.solution();
    public static void main( String[] args )
    {
        Tree treeG = new Tree(5, null, null);
        Tree treeD = new Tree(4, treeG, null);
        Tree treeB = new Tree(5, treeD, null);
        Tree treeE = new Tree(1, null, null);
        Tree treeF = new Tree(6, null, null);
        Tree treeC = new Tree(6, treeE, treeF);
        Tree treeA = new Tree(4, treeB, treeC);
        LOG.info("Hello world!");
    }
}