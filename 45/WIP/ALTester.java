/*
Connie Lei
APCS1 pd1
HW#45 - Al<B> Sorted!
2016-12-13
*/

import java.util.ArrayList;

public class ALTester{
    public static boolean check(ArrayList<Integer> s){
	boolean status = true; //sets default return to true
	for(int x = 0; x < s.size()-1;x ++){//size of ArrayList is 23, but you only need to check the 21 index because the biggest index is 22, but the last number won't have to check if the next number is larger or smaller because there is no next number, so only 21 has to check
	    if (s.get(x) > s.get(x + 1)){//checks the current index with next index
		return false; //acts like a short circuit, once a single index fails, the entire list fails, immediately returns false and doesn't iterate through the rest of the list
	    }
	}
	return status;//only goes through if every number was consecutively greater or equal than the previous one
    }
    public static void main(String[] args){
	ArrayList<Integer> a = new ArrayList<Integer>();	    
	while(a.size() != 23){
	    a.add((int)(Math.random() * 24)); //populates randomly
	}
	System.out.print(a); //prints out the entire array
	System.out.println(check(a)); //prints out true or false
	ArrayList<Integer> b= new ArrayList<Integer>();
	while(b.size() != 23){
	    b.add(b.size()); //test for true
	}
	System.out.print(b);
	System.out.println(check(b));
    }
	
}
