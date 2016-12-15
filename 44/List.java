/*==================================================
  interface List
  Declares methods that will be implemented by any 
  class wishing to adhere to this specification.
  This interface specifies behavior of a list of objects
  ==================================================*/

public interface List{

    // Return number of meaningful elements in the list
    int size();

    // Append an int to the end. Return true.
    boolean add( Object o ); 

    // Retrieve the int at index
    Object get( int index );

    // Overwrite the int at index
    int set( int index, Object o );

}//end interface ListInt
