/*
  Connie Lei
  APCS1 pd1
  HW#39 -- Putting It All Together
  2016-12-03
*/

import cs1.Keyboard;
import java.io.*;
import java.util.*;

public class Swapper{
	
    final static String CHARAC = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890-=[]\',./`~!@#$%^&*(){}|:<>?";

    public static void populate(String[][] array){
	for(int x = 0; x < array.length; x ++){
	    for (int y = 0; y < array[x].length; y ++){
		array[x][y] = createString();
	    }
	}
    }

    public static String createString(){
	int a = (int) (Math.random() * CHARAC.length());
	int b = (int) (Math.random() * CHARAC.length());
	int c = (int) (Math.random() * CHARAC.length());
	String rand = CHARAC.substring(a, a + 1) + CHARAC.substring(b, b + 1) + CHARAC.substring(c, c + 1);
	return rand;
    }
		
    public static void print( String[][] array ) { 
	for (int x = 0; x < array.length; x ++){
	    for (int y = 0; y < array[x].length; y ++){
		System.out.print(array[x][y] + " ");
	    }
	    System.out.println();
	}
    }
    
    public static void swap(String[][] array){
	int x = -1, y = -1, a = -1, b = -1;
	while(x >= array.length || x < 0){
	    System.out.println("Input the row you would like to swap.");
	    x = Keyboard.readInt();
	}
	while(y >= array[0].length || y < 0){
	    System.out.println("Input the column you would like to swap.");
	    y = Keyboard.readInt();
	}
	while(a >= array.length || a < 0){
	    System.out.println("Input the second row you would like to swap.");
	    a = Keyboard.readInt();
	}
	while(b >= array[0].length || b < 0){
	    System.out.println("Input the second column you would like to swap.");
	    b = Keyboard.readInt();
	}

	System.out.println("Swapping [" + x + "][" + y + "]: " + array[x][y] + " and [" + a +"][" + b +"]: " + array[a][b]);
	
	String temp = array[x][y];
	array[x][y] = array[a][b];
	array[a][b] = temp;
	System.out.println("Success! Strings swapped.");
	print(array);
    }	
	
    public static void main(String[] args){
	String[][] a = new String[3][3];
	populate(a);
	print(a);
	swap(a);
    }
}
