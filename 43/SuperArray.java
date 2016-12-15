/*
Team B(a)Con
Brian Kwong & Connie Lei
APCS1 pd1
HW#43 -- Array of Titanium!
2016-12-08
*/ 

/*==================================================
  class SuperArray version 3.0
  Wrapper class for array. Facilitates resizing, 
  expansion, and read/write capability on elements.
  ==================================================*/

public class SuperArray implements ListInt 
{
    private int[] _data;  //underlying container structure
    private int _lastPos; //marker for last meaningful value
    private int _size;    //number of meaingful values

    //default constructor
    //initializes 10-item array
    public SuperArray() { 
	_data = new int[10];
	_lastPos = -1;
	_size = 0;
    }

    //output array in [a,b,c] format
    //eg, for int[] a = {1,2,3} ...
    //toString() -> "[1,2,3]"
    public String toString() { 
	String foo = "[";
	for( int i = 0; i < _size; i++ ) {
	    foo += _data[i] + ",";
	}
	if ( foo.length() > 1 )
	    //shave off trailing comma
	    foo = foo.substring( 0, foo.length()-1 );
	foo += "]";
	return foo;
    }

    //double capacity of this instance of SuperArray 
    private void expand() { 
	int[] temp = new int[ _data.length * 2 ];
	for( int i = 0; i < _data.length; i++ )
	    temp[i] = _data[i];
	_data = temp;
    }

    //accessor method -- return value at specified index
    public int get( int index ) {
	return _data[index];
    }

    //mutator method -- set index to newVal, return old value at index
    public int set( int index, int newVal ) {
	int temp = _data[index];
	_data[index] = newVal;
	return temp;
    }

    //adds newVal to the next avaliable slot
    public void add(int newVal){
	if(_size == _data.length){
	    expand();
	}
	_lastPos += 1;
	set(_lastPos, newVal);
	_size += 1;
    }
    
    //adds newVal to slot index, shifts preexisting values to the right
    public void add(int index, int newVal){
	if(_size == _data.length){
	    expand();
	}
	_lastPos += 1;
	_size += 1;
	for(int x = _lastPos; x > index; x--){
	    _data[x] = _data[x-1];
	}
	_data[index] = newVal;
    }

    //removes value at slot index, shifts preexisting values to the left
    public void remove(int index){
	_lastPos -= 1;
	_size -= 1;
	for(int x = index; x < _size; x ++){
	    _data[x] = _data[x + 1];
	}
	_data[_size] = 0;
    }
     
    //accessor method -- returns the number of meaningful values in _data
    public int size(){
	return _size;
    }

    //tests
    public static void main( String[] args ) {

	SuperArray curtis = new SuperArray();
 	System.out.println("Printing empty SuperArray curtis...");
	System.out.println(curtis);

	//tests the set() method, improper usage
	//user will interact with the array using the add() or remove() methods
	for( int i = 0; i < curtis._data.length; i++ ) {
	    curtis.set(i,i*2);
	    curtis._size++;
 	}
 
 	System.out.println("Printing populated SuperArray mayfield...");
 	System.out.println(curtis);
 
 	ListInt mayfield = new SuperArray();
 	System.out.println("Printing empty SuperArray mayfield...");
 	System.out.println(mayfield);
 
 	mayfield.add(5); // [5]
 	mayfield.add(4); // [5,4]
 	mayfield.add(3); // [5,4,3]
 	mayfield.add(2); // [5,4,3,2]
 	mayfield.add(1); // [5,4,3,2,1]
 
 	System.out.println("Printing populated SuperArray mayfield...");
 	System.out.println(mayfield);
 
 	mayfield.remove(3); // [5,4,3,1]
 	System.out.println("Printing SuperArray mayfield post-remove...");
 	System.out.println(mayfield);
 	mayfield.remove(3); // [5,4,3]
 	System.out.println("Printing SuperArray mayfield post-remove...");
 	System.out.println(mayfield);
 
 	mayfield.add(3,99); // [5,4,3,99]
 	System.out.println("Printing SuperArray mayfield post-insert...");
 	System.out.println(mayfield);
 	mayfield.add(2,88); // [5,4,88,3,99]
 	System.out.println("Printing SuperArray mayfield post-insert...");
 	System.out.println(mayfield);
 	mayfield.add(1,77); // [5,77,4,88,3,99]
 	System.out.println("Printing SuperArray mayfield post-insert...");
 	System.out.println(mayfield);

	//the following should fail, since set() is not defined in interface ListInt
	// mayfield.set(0,999); // fails, since mayfield is of variable type ListInt, which doesn't have set()
	// System.out.println(mayfield);
    }

}//end class SuperArray
