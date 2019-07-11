package com.tasks;

import com.tasks.exceptions.IncorrectArgumentException;
import org.apache.log4j.Logger;
import com.tasks.Solution;

public class App
{
    private static final Logger LOG = Logger.getLogger(Solution.class);

    public static void main( String[] args )
    {
        Solution solution = new Solution();
        try
        {
            int result = solution.solution(0);
            LOG.info(result);
        }
        catch (IncorrectArgumentException e)
        {
            LOG.error(e.getMessage());
        }

    }
}