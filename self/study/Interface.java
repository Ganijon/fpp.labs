package self.study;

/*
 * Interfaces cannot be final
 * All fields of the interface are final by default
 * 
 */
public interface Interface {
    
    int FINAL_FIELD_BY_DEFAULT = 10;     // final by default
    final int FINAL_FIELD_DECLARED = 20; // final field as declared
    
    //int FINAL_BLANK_FIELD_BY_DEFAULT;    // blank final field not allowed
   
}
