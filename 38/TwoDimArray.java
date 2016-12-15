/*
Connie Lei
APCS1 pd1
HW38 -- Arrays of Arrays
2016-12-02
*/

// skeleton file for 
// class TwoDimArray
// ...practice working with 2D arrays

public class TwoDimArray {

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a ) 
    { 
	for (int x = 0; x < a.length; x ++){
	    for (int y = 0; y < a[x].length; y ++){
		System.out.println(a[x][y]);
	    }
	}
    }

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOREACH loop
    public static void print2( int[][] a ) 
    { 
	for(int[] array: a){
	    for(int x: array){
		System.out.println(x);
	    }
	}
    }


    //postcond: returns sum of all items in 2D integer array a
    public static int sum1( int[][] a )
    {
	int sum = 0;
	for (int x = 0; x < a.length; x ++){
	    for (int y = 0; y < a[x].length; y ++){
		sum += a[x][y];
	    }
	}
        return sum;
    }


    //postcond: returns sum of all items in 2D integer array a
    //          * uses helper fxn sumRow
    public static int sum2( int [][] m ) 
    { 
	int sum = 0;
	for(int x = 0; x < m.length; x ++){
	    sum += sumRow2(x, m);
	}
	return sum;
    }


    //postcond: returns sum of all items on row r of 2D integer array 
    //          uses a FOR loop
    public static int sumRow( int r, int[][] a ) 
    { 
	int sum = 0;
	for(int x = 0; x < a[r].length; x ++){
	    sum += a[r][x];
	}
	return sum;
    }


    //postcond: returns sum of all items on row r of 2D integer array 
    //          uses a FOREACH loop
    public static int sumRow2( int r, int[][] m ) 
    {
	int sum = 0;
	for(int x: m[r]){
	    sum += x;
	}
	return sum;
    }


    //postcond: returns sum of all items in column c of 2D integer array 
    public static int sumCol( int c, int[][] m ) 
    { 
	int sum = 0;
	for(int x = 0; x < m.length; x ++){
	    sum += m[x][c];
	}
	return sum;
    }


    public static void main( String [] args ) 
    {
	int [][] m1 = new int[4][2];
	int [][] m2 = { {2,4,6}, {3,5,7} };
	int [][] m3 = { {2}, {4,6}, {1,3,5} };
	print1(m1);
	print1(m2);
	print1(m3);
	print2(m1);
	print2(m2);
	print2(m3);
	System.out.print("testing sum1...\n");
	System.out.println("sum m1 : " + sum1(m1));
	System.out.println("sum m2 : " + sum1(m2));
	System.out.println("sum m3 : " + sum1(m3));
	System.out.print("testing sum2...\n");
	System.out.println("sum m1 : " + sum2(m1));
	System.out.println("sum m2 : " + sum2(m2));
	System.out.println("sum m3 : " + sum2(m3));
    }

}//end class TwoDimArray
