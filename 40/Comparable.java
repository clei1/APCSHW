/***
    From Duke's AP Java subset API...
    ( https://www.cs.duke.edu/csed/ap/subset/doc/ )
    -------------------------------------------------
    int compareTo(Object o)
    Compares this object with the specified object for order. 
    Returns a negative integer, zero, or a positive integer
    as this object is less than, equal to, or greater than
    the specified object. 

    Parameters:
    o - the object to be compared.
    Returns:
    a negative integer, zero, or a positive integer
    as this object is less than, equal to, or greater than 
    the specified object.
    -------------------------------------------------
***/

public interface Comparable 
{
    int compareTo( Object o);
}



