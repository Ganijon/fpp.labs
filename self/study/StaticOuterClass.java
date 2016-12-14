package self.study;

public class StaticOuterClass {
    
    public static int staticFieldParent;
    public int instanceFieldOuter;
    
    public static class StaticNestedClass{
        
        public static int staticFieldNested=9;
        public int instanceFieldNested;
        
        {
            staticFieldParent = 0;
            //instanceFieldOuter = 9;
        } 
    }
}
