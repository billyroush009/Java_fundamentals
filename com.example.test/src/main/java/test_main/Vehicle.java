package test_main;

//must declare as interface vs class
//interfaces are abstract structures, used from outside classes as a sort of blueprint
public interface Vehicle {

    //"final" required so value remains constant
    final int gears = 5;

    void changeGear(int a);
    void speedUp(int a);
    void slowDown(int a);

    /* Can't figure out how to run Java 1.8 with Maven?
    default void out() {
        System.out.println("Default Method");
    }

    static int math(int b) {
        return b+9;
    }
    */

    

}
