/*
Team C++
Caleb Smith Salzberg & Connie Lei
APCS1 pd1
HW#42 -- Array of Grade 100!
2016-12-08
*/ 

/*==================================================
  class SuperArray version 2.0
  Wrapper class for array. Facilitates resizing, 
  expansion, and read/write capability on elements.
  ==================================================*/

public class SuperArray 
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

    public void add(int newVal){
	if(_size == _data.length){
	    expand();
	}
	_lastPos += 1;
	set(_lastPos, newVal);
	_size += 1;
    }
    
    public void add(int index, int newVal){
	if(_size == data.length){
	    expand();
	}
	_lastPos += 1;
	_size += 1;
	for(int x = _lastPos; x > index; x--){
	    _data[x] = _data[x-1];
	}
	_data[index] = newVal;
    }

    public void remove(int index){
	_lastPos -= 1;
	_size -= 1;
	for(int x = index; x < _size; x ++){
	    _data[x] = _data[x + 1];
	}
	_data[_size] = 0;
    }

    public static void main( String[] args ) {

	SuperArray curtis = new SuperArray();
 	System.out.println("Printing empty SuperArray curtis...");
	System.out.println(curtis);

	for( int i = 0; i < curtis._data.length; i++ ) {
	    curtis.set(i,i*2);
	    curtis._size++;
 	}
 
 	System.out.println("Printing populated SuperArray mayfield...");
 	System.out.println(curtis);
 
 	SuperArray mayfield = new SuperArray();
 	System.out.println("Printing empty SuperArray mayfield...");
 	System.out.println(mayfield);
 
 	mayfield.add(5);
 	mayfield.add(4);
 	mayfield.add(3);
 	mayfield.add(2);
 	mayfield.add(1); 
 
 	System.out.println("Printing populated SuperArray mayfield...");
 	System.out.println(mayfield);
 
 	mayfield.remove(3);
 	System.out.println("Printing SuperArray mayfield post-remove...");
 	System.out.println(mayfield);
 	mayfield.remove(3);
 	System.out.println("Printing SuperArray mayfield post-remove...");
 	System.out.println(mayfield);
 
 	mayfield.add(3,99);
 	System.out.println("Printing SuperArray mayfield post-insert...");
 	System.out.println(mayfield);
 	mayfield.add(2,88);
 	System.out.println("Printing SuperArray mayfield post-insert...");
 	System.out.println(mayfield);
 	mayfield.add(1,77);
 	System.out.println("Printing SuperArray mayfield post-insert...");
 	System.out.println(mayfield);
    }

}//end class SuperArray
