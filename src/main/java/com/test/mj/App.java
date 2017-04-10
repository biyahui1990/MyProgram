package com.test.mj;

import com.google.common.base.Joiner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Joiner join = Joiner.on(":");
        System.out.println(join.join("aa","bb","ccs"));
    }
}
