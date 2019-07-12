package com.tasks;

import java.util.HashMap;
import static java.lang.Math.max;

public class Solution {
    public Tree root;

    public Solution()
    {
        root = null;
    }

    private int getMaxDistingValuesNumberUtil(Tree node, HashMap<Integer, Integer> m)
    {
        if (node == null)
            return m.size();
        
        m.put(node.key,(m.containsKey(node.key)) ? (m.get(node.key) + 1) : 1);

        int max = max(getMaxDistingValuesNumberUtil(node.left, m),
                getMaxDistingValuesNumberUtil(node.right, m));
        
        if (m.containsKey(node.key))
        {
            m.put(node.key,m.get(node.key) - 1);
        }

        if (m.get(node.key) == 0)
            m.remove(node.key);

        return max;
    }

    public int getMaxDistingValuesNumber()
    {
        if (root == null)
            return 0;

        HashMap<Integer, Integer> hash = new HashMap<>();
        int large = getMaxDistingValuesNumberUtil(root, hash);
        return large;
    }

}
