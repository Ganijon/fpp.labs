package self.study;

/*
 * Final class can't be extended
 * Final static fields can't be changed 
 * Final static fields must be initialized at the time of declaration, or if not
 * Blank final static fields must be initialized only within static block
 * Blank final instance fields must be initialized within constructor or instance initializer block
 */
public final class FinalClass {
    
    public static final int FINAL_STATIC_FIELD = 10;
    public static final int FINAL_STATIC_BLANK_FIELD_INIT_BY_STATIC_INITIALIZER;
        
    /*
     * static initializer block | class initializer
     */
    static {

        // final filed cannot be re-assigned
        // FINAL_FIELD = 0;


        // initializing blank static final field in static initialer
        FINAL_STATIC_BLANK_FIELD_INIT_BY_STATIC_INITIALIZER = 20;  
        
        // calling static final method with final parameter
        FinalStaticMethod(FINAL_STATIC_FIELD); 
    }   
    
    public final int FINAL_FIELD = 30;
    public final int FINAL_BLANK_FIELD_INIT_BY_INSTANCE_INITIALIZER;
    public final int FINAL_BLANK_FIELD_INIT_BY_CONTSTRUCTOR;
    
    /**
     * instance initializer block | instance initializer
     */
    {
        FINAL_BLANK_FIELD_INIT_BY_INSTANCE_INITIALIZER = 40;

        // final filed cannot be re-assigned
        // FINAL_FIELD = 0;
        
        // calling static final method with final parameter as array
        FinalInstanceMethod(10, 20, 30, 40);
        FinalInstanceMethod(10, 20, 30, 40, 50);
        FinalInstanceMethod(10, 20, 30, 40, 50, 60);
    }
    
    /*
     * Constructors can't be declared as final
     */
    public FinalClass(int initialValue) {
        
        FINAL_BLANK_FIELD_INIT_BY_CONTSTRUCTOR = initialValue;
        
        // not allowed
        //FINAL_FIELD = 0;
        
        /* Interface variable are final by default and can't be re-assigned
        
        Interface.FINAL_VARIABLE = 30;
        Interface.VARIABLE_FINAL_BY_DEFAULT = 20;
        
        */
    }
    
    /*
     * Final static method can't be overriden
     * Final parameter can't be re-assigned
     * Local final variables must be initialized at the time of declaration 
     */
    public final static int FinalStaticMethod(final int FINAL_PARAMETER) {
       
       final int FINAL_LOCAL_VARIABLE = 1;
       
       return FINAL_PARAMETER * FINAL_LOCAL_VARIABLE;
    }
    
    /*
     * Final method can't be overriden by sub-class
     * Final parameters can't be re-assigned
     * Final parameters' array elements can be re-assigned
     */
    protected final int FinalInstanceMethod(final int... FINAL_PARAMETERS) {
        
        final int FINAL_LOCAL_VARIABLE = 2;
        int local_variable = 0;

        // final parameter array elements can be re-assigned
        FINAL_PARAMETERS[0] = 70;
        
        for(int i: FINAL_PARAMETERS)
            local_variable += i * FINAL_LOCAL_VARIABLE;
            
        return local_variable;
    }

}
