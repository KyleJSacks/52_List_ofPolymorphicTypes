/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    // ================================================================
    // FIELDS
    
    private int filledElements; // the number of elements in this list

    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private Object[] list;

    private static final int INITIAL_CAPACITY = 10;
    
    // ================================================================
    // CONSTRUCTORS
    
    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
      list = new Object[INITIAL_CAPACITY];
    }
    
    // ================================================================
    // METHODS
    
    /**
      @return the number of elements in this list
     */
    public int size() {
      return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
      String stringRep = "[";
      
      for (int index = 0; index < filledElements; index++)
        stringRep += list[index] + ",";

      stringRep += "]";
      return stringRep;
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add(Integer intValue){
		 if (list.length == filledElements) expand();
		 list[filledElements] = intValue;
		 filledElements++;
		 return true;
	 }
 
	 public boolean add(Double doubleValue){
		 if (list.length == filledElements) expand();
		 list[filledElements] = doubleValue;
		 filledElements++;
		 return true;
	 }

     public boolean add(boolean booleanValue){
		 if (list.length == filledElements) expand();
		 list[filledElements] = booleanValue;
		 filledElements++;
		 return true;
	 }
     
	 public boolean add(String stringValue){
		 if (list.length == filledElements) expand();
		 list[filledElements] = stringValue;
		 filledElements++;
		 return true;
	 }



    public Object get(int index){
        return list[index];
    }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */

       //System.out.println( "old length:" + typeOfElements.length);

        // create new list, copy values over, and replace list
        Object[] bigger = new Object[list.length * 2];
        for(int index=0;index<list.length; index++){
            bigger[index] = list[index];
        }
        list = bigger;


       // System.out.println( "new length:" + typeOfElements.length);

     }
}
