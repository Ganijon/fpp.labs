package lesson3.lab33;

/*
 * Flexible collection to store strings
 */
public class MyStringList {

    private final static int DEFAULT_SIZE = 50;
    private String[] strArray;
    private int size;
    
    public MyStringList() {
        strArray = new String[DEFAULT_SIZE];
    }
    
    /*
     * adds s to the end of the underlying array
     */
    public void add(String s) {
        
        if(find(s) == true) return;
        
        if(size  == strArray.length - 1)
            resize();    
             
        size ++;
        
        strArray[size - 1] = s;
    }

    
    /*
     * retrieves the String at the ith position in the underlying array
     */
    public String get(int i) {
        
        if(i > 0 && i < strArray.length) 
            return strArray[i];       
        
        return null;
    }


    /*
     * returns true if String s is found in the array, false otherwise
     */
    public boolean find(String s) {
    
        for(String item: strArray) {
            if(s.equals(item)) 
                return true;
        }
        
        return false;
    }

     
    /*
     * removes first occurrence of String s if it is found in the underlying array
     * if found, returns true; if not found returns false
     */
    public boolean remove(String s) {
        
        int index = -1;
        for(int i=0; i < strArray.length; i++) 
            if(strArray[i] == s) 
                index = i;
            
        
        if(index != -1) {
            // to remove item from the array
            // copy each elements behind the item 1 position higher
            System.arraycopy(strArray, index + 1, strArray, index, strArray.length - index - 1);    
            size--;
        }
        
        // item not found
        return false;
    }

    /*
     * returns a String representation of the underlying array
     * here is a typical output:
     * [Bob, Steve, Susan, Mark, Dave]
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(int i=0; i < size; i++) {
            sb.append(strArray[i]);
            if(i < size - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    /*
     * returns the next open position in the underlying array – this is precisely the
     * number of Strings that have been added minus the number of String that have
     * been removed.
     */
    public int size() {
        return size;
    }
    
    /*
     *  when array reaches the limit:
     *   - create new array twice the size
     *   - copy elements from old array to new array
     *   - assign new array to strArray
     */
    private void resize() {
        System.out.println("Resizing ...");
        String[] newArray = new String[2 * strArray.length];
        System.arraycopy(strArray, 0, newArray, 0, strArray.length);
        strArray = newArray;     
    }
}
