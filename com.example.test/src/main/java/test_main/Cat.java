package test_main;

//"extends Dog" will apply Dog methods/variables to new "Cat" class, "Dog" would be the parent class
public class Cat extends Dog {

    //example extra variable, on top of Dog attributes
    private int food;

    //constructor to make Cat object match Dog object by attribute
    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    //secondary constructor w/o the "food" attribute so that arguments with only name/age will work
    public Cat(String name, int age) {
        super(name, age);
        //default parameter, sets food value to 50 if not set
        this.food = 50;
    }

    //tertiary constructor in case only name is sent, defaults "age" attribute to 0
    public Cat(String name){
        //defaults age to 0 if only the name is entered
        super(name, 0);
        this.food = 50;
    }

    // Overrides "Dog" speak() method because Cat is the "child" class
    public void speak() {
        System.out.println("Meow my name is " + this.name + " and I get fed " + this.food + " grams of food!");
    }
    
}
