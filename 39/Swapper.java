/*
Connie Lei
APCS1 pd1
HW#39 -- Putting It All Together
2016-12-03
*/

/*
I'm not really sure what I did, but it works. I sort of followed the YORPG.java file you gave us
and implemented some things from there to here. I didn't use Keyboard because it was just confusing.
It works though.
I think I need clearer instructions because I tend to take the really long unnecessary route or even
the not even thought of one. I don't really know.
*/

import cs1.Keyboard;
import java.io.*;
import java.util.*;

public class Swapper{
	
	final static String CHARAC = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890-=[]\',./`~!@#$%^&*(){}|:<>?";

	public static void populate(String[][] array){
		for(int x = 0; x < array.length; x ++){
			for (int y = 0; y < array[x].length; y ++){
				int a = (int) (Math.random() * CHARAC.length());
				int b = (int) (Math.random() * CHARAC.length());
				int c = (int) (Math.random() * CHARAC.length());
				String rand = CHARAC.substring(a, a + 1) + CHARAC.substring(b, b + 1) + CHARAC.substring(c, c + 1);
				array[x][y] = rand;
			}
		}
	}
		
	public static void print1( String[][] array ) { 
		for (int x = 0; x < array.length; x ++){
			for (int y = 0; y < array[x].length; y ++){
				System.out.println(array[x][y]);
			}
		}
    }
	
	public static void swap(String[][] array){
		InputStreamReader isr;
		BufferedReader in;
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		int x = 0;
		int y = 0;
		int a = 0;
		int b = 0;
		try{
			System.out.println("Input the row you would like to swap.");
			x = Integer.parseInt(in.readLine());
		}
		catch ( IOException e ) { }
		try{
			System.out.println("Input the column you would like to swap.");
			y = Integer.parseInt(in.readLine());
		}
		catch ( IOException e ) { }
		try{
			System.out.println("Input the second row you would like to swap.");
			a = Integer.parseInt(in.readLine());
		}
		catch ( IOException e ) { }	
		try{
			System.out.println("Input the second column you would like to swap.");
			b = Integer.parseInt(in.readLine());
		}
		catch ( IOException e ) { }
		String temp = array[x][y];
		array[x][y] = array[a][b];
		array[a][b] = temp;
		System.out.println("Success! Strings swapped.");
		print1(array);
	}	
	
	public static void main(String[] args){
		String[][] a = new String[3][3];
		populate(a);
		print1(a);
		swap(a);
	}
}
