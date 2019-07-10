package com.tasks;

import org.apache.log4j.Logger;

public class App
{
    private static final Logger LOG = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        Solution solution = new Solution();
        int result = solution.solution(" Forget CVs    Save time       x x");
        LOG.info(result);
    }
}