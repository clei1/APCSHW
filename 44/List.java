/*==================================================
  interface List
  Declares methods that will be implemented by any 
  class wishing to adhere to this specification.
  This interface specifies behavior of a list of objects
  ==================================================*/

public interface List{

    // Return number of meaningful elements in the list
    int size();

    // Append an object to the end. Return true.
    boolean add( Object o ); 

    // Retrieve the object at index
    Object get( int index );

    // Overwrite the object at index
    int set( int index, Object o );

}//end interface ListInt
