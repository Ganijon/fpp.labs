package self.study;

public class HelloWorld {
    public static void main(String[] argvs) {
        
        String a = "Che";
        System.out.println("Hello World " + a + "!");
        
        
        StaticOuterClass.StaticNestedClass outer = new StaticOuterClass.StaticNestedClass();
        
        StaticOuterClass.StaticNestedClass nested = new StaticOuterClass.StaticNestedClass();
        
        StaticOuterClass.StaticNestedClass.staticFieldNested = 10;
        System.out.println(nested.staticFieldNested);
    }
}
