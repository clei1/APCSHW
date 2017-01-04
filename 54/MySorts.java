/*
Connie Lei
APCS1 pd1
HW#54--Never Fear, Big O Is Here!
2017-01-04
*/

import java.util.ArrayList;

public class MySorts{

    /*
      This is the slowest sort. It is a different  way of bubbleSort. Both bubbleSort and insertionSort have the function
      f(n) = .5n(n+1)and the worst case scenario.
     */    
    public static void insertionSortV( ArrayList<Comparable> data ) 
    {
	for(int x = 1; x < data.size(); x++){
	    int pos = x;
	    while(pos > 0 && data.get(pos).compareTo(data.get(pos-1)) < 0){
		data.set(pos, data.set(pos - 1, data.get(pos)));
		pos -= 1;
	    }		   
	}
    }

    /*
      This is the fastest sort. The maximum number of swaps needed is one less than the length of the list. This is similar to insertionSort except
      you don't continously swap. You check through the list first and then swap. Both insertionSort and selectionSort have a barrier seperating the sorted
      list and the unsorted list. The function would be f(n) = n-1. The sorted list can not be changed unlike in bubbleSort.
     */
    public static void selectionSortV( ArrayList<Comparable> data ) 
    {
	int maxPos;
	for(int x = data.size() -1; x >= 0; x--){
	    maxPos = x;
	    for(int y = x; y>= 0; y--){
		if(data.get(y).compareTo(data.get(maxPos)) > 0){
		    maxPos = y;
		}
	    }
	    data.set(maxPos,data.set(x, data.get(maxPos)));
	}
    }

    /*
      This is the slowest sort. The function would be f(n) = .5n(n+1). You start sorting at the beginning meaning you might have to swap
      through the entire sorted area before you arrive.
     */
    public static void bubbleSortV( ArrayList<Comparable> data ) 
    {
	for(int y = data.size() - 1; y >= 0; y--){ //runs it the # size -1 rotations 
	    for(int x = 0; x < data.size() - 1; x++){ //x will the the second to last index maximum
		if(data.get(x).compareTo(data.get(x+1)) > 0){ //if the current number at index x is greater than the index x+1, then swap them
		    data.set(x + 1, data.set(x, data.get(x+1)));
		}
	    }
	}
    }
    
}
