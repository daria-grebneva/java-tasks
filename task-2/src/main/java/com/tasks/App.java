package com.tasks;

import org.apache.log4j.Logger;

public class App
{
    private static final Logger LOG = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        Solution solution = new Solution();
        int result = solution.solution("We test coders- Give us a try?");
        LOG.info(result);
    }
}