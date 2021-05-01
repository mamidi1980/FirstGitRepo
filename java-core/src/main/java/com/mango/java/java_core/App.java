package com.mango.java.java_core;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator calc = new Calculator();
        //calc.setParams(Arrays.asList(new int[] {1,2}));
        calc.sum(		
			(int x, int y) -> {				
				return x+y;
			}
		);
       
    }
}
