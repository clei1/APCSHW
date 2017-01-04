/*
Connie Lei
APCS1 pd1
HW#48 -- Halving the Halves
2016-12-19
*/

/*============================================
   class OrderedArrayList
   Wrapper class for ArrayList.
   Imposes the restriction that stored items 
   must remain sorted in ascending order
   ============================================*/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;


public class OrderedArrayList 
{
    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList() 
    {
	_data = new ArrayList<Comparable>();
    }


    public String toString() 
    { 
	return _data.toString(); 
    }


    public Comparable remove( int index ) 
    { 
	return _data.remove(index); 
    }


    public int size() 
    { 
	return _data.size();
    }

    
    public Comparable get( int index ) 
    { 
	return _data.get(index); 
    }


    // addLinear takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index
    // takes f(n) = n
    public void addLinear( Comparable newVal ) 
    { 
	for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { 
		//newVal < oal[p]
		_data.add( p, newVal );
		return; //Q:why not break?
	    }
	}
	_data.add( newVal ); //newVal > every item in oal, so add to end
    }

    // takes f(n) = log base 2 of n
    public void addBin( Comparable newVal)
    {
	System.out.println(_data.toString());
	System.out.println(newVal);
	if(_data.size() == 0){
	    _data.add(newVal);
	    return;
	}
        int upper = _data.size() -1;
	int lower = 0;
	while(upper != lower && upper > lower){
	    if(newVal.compareTo(_data.get((upper + lower)/2)) >= 0){
		lower = (upper + lower) /2 + 1;
	    }
	    else{
		upper = (upper + lower) /2 - 1;
	    }
	}
	if(newVal.compareTo(_data.get(lower)) > 0){ //sometimes you end up getting the position you should insert it at or the one after, so you need to have a second check
	    _data.add(lower + 1, newVal);
	}
	else{
	    _data.add(lower, newVal);
	}
    }

    // main method solely for testing purposes
    public static void main( String[] args ) {

	OrderedArrayList Franz = new OrderedArrayList();

	// testing linear search
	for( int i = 0; i < 15; i++ )
	    Franz.addBin( (int)( 50 * Math.random() ) );
	System.out.println( Franz );

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class OrderedArrayList
