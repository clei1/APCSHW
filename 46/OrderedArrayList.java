/*
Connie Lei
APCS1 pd1
HW#46 -- ascending
2016-12-15
*/


/*============================================
  class OrderedArrayList
  Wrapper class for ArrayList.
  Imposes the restriction that stored items 
  must remain sorted in ascending order
  ============================================*/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

//COMPARABLE, classes Integer, Double, String implement interface Comparable
//a.compareTo(b)
//a < b    negative
//a = b    0
//a > b    positive


public class OrderedArrayList {

    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data; //Comparable can be int, double, string


    // default constructor initializes instance variable _data
    public OrderedArrayList() {
	_data = new ArrayList<Comparable>();
    }


    public String toString() {
	return _data.toString(); //you can call the ArrayList methods
    }


    public Comparable remove( int index ) { 
	return _data.remove(index);
    }


    public int size() {
	return _data.size();
    }

    
    public Comparable get( int index ) { 
	return _data.get(index);
    }
    
    // addLinear takes as input any comparable object
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index
    public void addLinear( Comparable newVal ) {
	/*
	if(_data.size() == 0){ //base case for adding the first value to the Array
	    _data.add(newVal);
	}
	*/

	int temp = _data.size();
	for(int x = 0; x < temp && temp == _data.size(); x++){
	
	    //for(int x = 0; x < _data.size(); x++){ //you want values between 0 and one less than the length, x will never be equal to the total length, it will max at the last index
	    if(newVal.compareTo(_data.get(x)) < 0){
		_data.add(x, newVal);
		//	return; //needed to exit out of the for loop because after the if statement turned true, it would grow infinitely, [1,2,3] adding a 2 would cause it togrow [1,2,2,3] and then size would grow and the index would grow so it would become [1,2,2,2,3] and [1,2,2,2,2,3] and so on, a way to fix this would be to go backward
		//example [1,2,3,3] with input 2
		//test index 0, (2 < 1) false
		//index 1, (2 < 2) false
		//index 2, (2 < 3) true, [1,2,3,3] size = 4 --> [1,2,2,3,3] size = 5
		//index 3, (2 < 3) true, [1,2,2,3,3] size = 5 --> [1,2,2,2,3,3] size = 6
		//.....continues onto infinite because after updating the array, the boolean will always be true since you repeat the same test over and over
		//break only stops the loop
	    }
	    /*
	    if(x == _data.size - 1){
		_data.add(x);
	    }
	    */
	}
	//since there is nothing after the for loop, it runs the rest of the function
	//System.out.println("break");
	//changed it so if we iterated through the entire array and the newVal was the largest, it would just be added, works for the first case
	//example [1,1] with input 2
	//test index 0, (2 < 1) false
	//index 1, (2 < 1) false
	//index 2 = size 2, doesn't run an iteration
	//[1,1] --> [1,1,2]
	if(temp == _data.size()){
	    _data.add(newVal);
	}
    }

    /*==============================================
      SUMMARY FOR POSSIBLE SOLUTIONS
      1. Run through a for loop and if you added a value, break the for loop and add the last value if you reached end of the array
      2. Have a temporary variable that remembers the original size, so you don't have to break the for loop, just implement another boolean
      3. Run through a for loop and if you added a value, return nothing, and deal with the adding the last value if you reached the end of 
         the array by creating another if statement that checks if the value is the largest in the array
      4. Go backwards through the array
      5. I've realized there are a lot more variations.... ETC
      ==============================================*/

    
    public boolean check(){
	return ALTester.check(_data); //adapted ALTester's check for correct sorting, meant changing the previous ArrayList<Integer> to ArrayList<Comparable> and changing the for loop to use toCompare() instead of a direct operator 
    }
    
    // main method solely for testing purposes
    public static void main( String[] args){

	OrderedArrayList Franz = new OrderedArrayList();

	System.out.println("\nValues to add via addLinear() calls:");

	// testing linear search
	for( int i = 0; i < 15; i++ ) {
	    int valToAdd = (int)( 50 * Math.random() ); //Integers implement interface Comparable 
	    System.out.println( valToAdd );
	    Franz.addLinear( valToAdd );
	}
	
	System.out.println("\nafter population via addLinear() calls:");
	System.out.println( Franz );
	System.out.println();
	System.out.println( Franz.size() );
	System.out.println( Franz.check() );

    }

}//end class OrderedArrayList
 
