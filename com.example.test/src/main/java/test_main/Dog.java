package test_main;

//new class
public class Dog {
    
    //declaring variables
    //protected makes it so only files within the java package can access the var
    protected String name;
    protected int age;

    //protected static class variable
    protected static int count = 0;

    //new method within class "Dog"
    public Dog(String name, int age) {

        //setting private variable values (with "this.") to arguments from public method
        this.name = name;
        this.age = age;

        //incrementing count static variable
        Dog.count += 1;
        //calling static method below
        Dog.display();

        //int x  = add2();
        //System.out.println(x);
    }

    //static method example, basically a function, can not access class object attributes
    public static void display() {
        System.out.println("I am a dog!");
    }

    //method to print out result from classes
    public void speak(){
        System.out.println("I am " + this.name + " and I am " + this.age + " years old!");
    }

    //returns age of whichever "dog" is being queried
    public int getAge(){
        //demonstrating how to pull private variables easily from external class
        return this.age;
    }

    //example method to set one attribute of existing class object
    public void setAge(int age){
        this.age = age;
    }
    //example of private method, only accessible within the "Dog" class, not the main App
    private int add2() {
        return this.age + 2;
    }
}

