package test_main;

import java.util.Scanner;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        System.out.println( "Hello World!" );
        //System.out.println( "Hello World!!" );

        //var declarations
        int firstVar = 2;
        double firstDouble = 5.0;
        boolean firstBoolean = true;
        char c = 'c';
        //String must be caps?
        String str = "billus";

        System.out.println(firstVar * 2);
        System.out.println(firstDouble * 2.2);

        if (firstBoolean == true){
            System.out.println(firstBoolean);
            firstBoolean = false;
            System.out.println(firstBoolean);
        }
        if (firstBoolean == false){
            System.out.println(c);
        }

        System.out.println(str);
        //using "String.format" to prepare to display
        str = String.format("str: %s", str);
        System.out.println(str);
        

        int x = 5;
        int y = 7;
        int z = 57;
        //casting to double w/ "Double.valueOf()" or typecasting "(double)" before var for division
        double u = Double.valueOf(z) / Double.valueOf(y);
        double v = (double)z / (double)y;
        //exponential power through Math.pow()
        double d = Math.pow(x,y);

        System.out.println(u);
        System.out.println(v);
        System.out.println(d);
        
        //modulus var, holds remainder from div
        int x = 56 % 5;
        System.out.println(x);
        

        //"requires java.util.Scanner;" inclusion at header
        //scanner variable
        Scanner sc = new Scanner(System.in);

        //variable to hold actual value from scanner var
        //int scanned = sc.nextInt();
        //double scanned = sc.nextDouble();
        //boolean scanned = sc.nextBoolean();
        String scanned = sc.next();
        //"boolean scanned_check = scanned.equals(variable);" would be used to check string against string

        //"Integer.parseInt" used to parse/cast into integer value
        int x = Integer.parseInt(scanned);

        System.out.println(scanned);
        System.out.println(x * 2 + 1);
        

        int x = 6;
        int y = 7;
        int z = 10;

        boolean compare = (x < y && y > z) || (z+2 < 5 || x+7 > y);
        //conditions and booleans
        // > < == >= <= !=

        System.out.println(compare);
        

        //scanner variable
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("billus")) {
            System.out.println("Hello Billus!");
        } else if (s.equals("b")) {
            System.out.println("Hello B");
        } else {
            System.out.println("Hello Other!");
        }

        //escape character to print single '
        System.out.println(" \' ");
        

        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 20){
            System.out.println("You are an adult");
            //nested loop
            if (age == 20){
                System.out.print("Input your favorite food: ");
                String food = sc.nextLine();

                if (food.equals("pizza")){
                    System.out.println("Mine too!");
                } else {
                    System.out.println("Not mine");
                }
            }
        } else if (age >= 13){
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are younger than 13");
        }

        

        //arrays
        //int[] firstArr = new int[5];
        //declaring and populating String array
        String[] firstArr = {"hey", "hi", "hello", "goodbye", "yeah"};
        //firstArr[0] = "hello";
        String x = firstArr[0];
        System.out.println(x + "\n");

        for (String value : firstArr) {
            System.out.println(value);
        }

        int[] nums = {2,3,54,6,6};

        x = String.valueOf(nums[0]);
        System.out.println("\n" + x + "\n");

        for (int value : nums) {
            System.out.println(value);
        }

        

        //for loops

        int x = 0;

        for (int i = 0; i < 10; i++){
            System.out.println(x);
            x++;
        }

        System.out.println();
        System.out.println("x = " + x);
        System.out.println();

        for (int i = 0; i < 10; i+=2){
            for (int j = 0; j < 10; j++){   
                System.out.println("x = " + x);
                x++;
            }
        }

        System.out.println();
        System.out.println("x = " + x);

        

        int[] arr = {1,5,7,3,4,5};
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        int count = 0;

        for (int element:arr){
            System.out.println(element);
            count++;
        }

        System.out.println("List has: " + count + " ints");
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }

        for (String element:names){
            System.out.println(element);
            //break;
            if (element.equals("billus")){
                break;
            }
        }

        

        //while loops

        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: ");
        int x = sc.nextInt();

        int count = 1;
        while (x != 10) {
            System.out.println("Type 10...");
            System.out.print("Type a number: ");
            x = sc.nextInt();

            count++;
        }

        System.out.println("You tried " + count + " times");

        

        //Sets and Lists
        //import java.util.HashSet;
        //import java.util.Set;
        //import java.util.TreeSet;
        //import java.util.ArrayList;


        //how to declare a Set, must contain all unique elements
        //Set<Integer> t = new HashSet<Integer>();
        //Set<Integer> t = new LinkedHashSet<Integer>();

        //TreeSet, order matters
        Set<Integer> t = new TreeSet<Integer>();

        //how to append to Sets
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-8);

        //"contains" used to check if certain element exists in Set
        //"t.empty()"" checks if Set is empty
        if(t.contains(5)){
            System.out.println("Contains 5!");
        }

        //"remove" used to delete elements from Set
        t.remove(9);

        System.out.println(t);

        //clear used to remove all from Set
        t.clear();

        System.out.println(t);

        //List example
        //import java.util.ArrayList;
        ArrayList<Integer> u = new ArrayList<Integer>();
        //linkedlist notation
        //LinkedList<Integer> u = new LinkedList<Integer>();

        //very similar syntax to Set
        u.add(1);
        u.add(2);
        u.add(3);
        u.get(0);

        //changes element value by index value, sets index 1 to be 5
        u.set(1, 5);

        System.out.println(u);
        System.out.println(u.size());
        //subList can reference certain ranges within list index
        System.out.println(u.subList(0,2));

        

        //Maps and HashMaps
        //Map is very similar to Python dictionary, key-value pair

        //import java.util.Map;
        //import java.util.HashMap;
        //import java.util.LinkedHashMap;

        //how to declare map
        // HashMap does not keep elements in order
        //Map m = new HashMap();
        //Map m = new TreeMap(); // TreeMap doesn't like when you mix variable types for key values, orders by key values
        Map m = new LinkedHashMap(); // LinkedHashMap will order by literal order keys were set
        //populating w/ key-value pairs, keys must be unique
        m.put("bill", 5);
        m.put("joe", 6);
        m.put("chris", "x");
        //m.put(11, 999);

        //"containsValue" used to check if element/value exists in the Map
        boolean x_check = m.containsValue("x");
        //"containsKey" used to check if key exists in Map
        boolean bill_check = m.containsKey("bill");
        //"isEmpty" used to check if Map is empty
        boolean empty = m.isEmpty();

        System.out.println(m);
        //referencing by key
        System.out.println(m.get("bill"));
        //System.out.println(m.get(11));
        System.out.println(m.get("chris"));
        
        System.out.println(bill_check);
        System.out.println(x_check);
        System.out.println(empty);

        //clears out Map
        m.clear();

        System.out.println(m);

        
        //Maps example

        Map m = new HashMap();

        String str = "hello my name is billus and i am cool";

        //this loops through each char in the "str" string then sets up a map incrementing each letter with how many times it's used
        for (char x:str.toCharArray()){
            if (m.containsKey(x)) {
                int old = (int) m.get(x);
                //incrementing value if key already exists
                m.put(x, old+1);
            } else {
                //setting new keys up with value 1
                m.put(x, 1);
            }
        }
        //how to remove from Maps, below removes spaces
        m.remove(' ');

        System.out.println(m);

        

        //Maps example 2, with ints!
        //import java.util.Arrays;
        int[] x = {-99, 5,6,3,2,1,7,8,0};

        //Arrays.sort(x);
        Arrays.sort(x, 1, 7);

        //prints out each value in array, sorted from index 1 to 6
        for(int i:x){
            System.out.print(i + ",");
        }

        

        //Objects

        String h = "hello";

        //call to test method "billus"
        billus(h, 4);
        //printing out result from "add2" method
        System.out.println(add2(6));
        //printing out result from "string_example" method
        System.out.println(string_example("hey"));

    }

    //building out test method, must be outside the "main" method of the "Main" class
    public static void billus(String str, int x) {
        for (int i = 0; i < x; i++){
        System.out.println(str);
        }
    }

    //generic method/function to return whatever the int argument is +2
    public static int add2(int x) {
        return x + 2;
    }
    //generic method to return whatever string argument is sent with an "!" appended at the end
    public static String string_example(String x){
        return x + "!";
    }
    
    //Creating Classes, uses class "Dog"
    Dog bill = new Dog("billus", 4);
    bill.speak();
    Dog bob = new Dog("bob", 6);
    bob.speak();
    Dog joe = new Dog("joe", 5);
    joe.speak();
    
    //int x = bill.getAge();
    bill.setAge(10);
    System.out.println("Billus is " + bill.getAge() + " year(s) old!");

    //@@@@@@@@@@@@@@
    //Inheritance
    //using the "Cat" class extended from "Dog" to perform similar functions w/ a new class

    Cat billus = new Cat("billus", 18, 100);
    billus.speak();

    Cat bob = new Cat("bob", 7);
    bob.speak();

    Cat joe = new Cat("joe");
    joe.speak();


    //@@@@@@@@@@@@@
    //Static

    Dog bill = new Dog("bill", 9);
    Dog joe = new Dog("joe", 10);
    Dog chris = new Dog("chris", 11);

    //printing static variable counter from "Dog" class
    System.out.println(Dog.count);

 

    //@@@@@@@@@@@@@
    //Overloading Methods & Object Comparisons
    //uses the "Student" class

    //declaring Student object variables
    Student bill = new Student("Bill");
    Student billy = new Student("Bill");
    Student joe = new Student("Joe");
    Student chris = new Student("Chris");

    //true since Bill == Bill, "equals" is a method created in "Student" class
    //System.out.println(bill.equals(billy));
    //false since Joe != Bill
    //System.out.println(joe.equals(bill));

    //"compareTo" example, method created in "Student" class
    //System.out.println(bill.compareTo(chris));

    System.out.println(bill);


    //@@@@@@@@@@@@@@@
    //Inner Classes
    //uses "OuterClass"

    //declaring "OuterClass" object
    OuterClass out = new OuterClass();
    //initializing "inner" method to access the "InnerClass" from "OuterClass", required if inner class is private
    out.inner();

    System.out.println();

    //example w/ inner class as a public method
    OuterClass.InnerClass in = out.new InnerClass();
    //invoking "display" from inner class, no outerclass required with public methods
    in.display();



    //@@@@@@@@@@@@@@@
    //Interfaces
    //uses "Vehicle.java" as interface and "Car" as class

    //Car objects
    Car ford = new Car();
    ford.speedUp(10);
    ford.changeGear(2);

    ford.display();

    ford.slowDown(5);
    ford.changeGear(1);
    ford.display();

    
    //int x = Vehicle.math(5);
    //System.out.println(x);
    
    
    */
    //@@@@@@@@@@@@@@@@
    //Enums
    //Using "Level" class

    Level lvl = Level.LOW;
    System.out.println(lvl.getLvl());
    System.out.println(Level.valueOf("LOW"));
    System.out.println();

    lvl.setLvl(5);
    System.out.println(lvl.getLvl());
    
    Level[] arr = Level.values();
    String en = lvl.toString();

    //loops through all values in enum
    for (Level e : arr) {
        System.out.println(e);
    }

    System.out.println();

    if (lvl == Level.LOW){
        System.out.println(lvl);
    }else if (lvl == Level.MEDIUM){
        System.out.println(lvl);
    }else {
        System.out.println(lvl);
    }

    System.out.println();
    System.out.println(en);

    }
}
