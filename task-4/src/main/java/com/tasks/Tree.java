package com.tasks;

public class Tree {
    public int x;
    public Tree l;
    public Tree r;

    public Tree(int x, Tree l, Tree r) {
        this.x = x;
        this.l = l;
        this.r = r;
    }
}
