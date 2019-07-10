package com.tasks;

import org.apache.log4j.Logger;

public class App
{
    private static final Logger LOG = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        Solution wordMachine = new Solution();
        LOG.info(wordMachine.solution("13 DUP 4 POP 5 DUP + DUP + -"));
    }
}