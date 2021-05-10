package test_main;

public class OuterClass {
    
    //InnerClass example
    //private declaration
    //private class InnerClass {
        
    //public example of InnerClass
    public class InnerClass{
        //inner class method
        public void display() {
            System.out.println("This is an inner class");
        }
    }

    //establishing an instance of the "OuterClass" so we can actually use the "InnerClass"
    public void inner(){
        InnerClass in = new InnerClass();
        in.display();
    }

}
