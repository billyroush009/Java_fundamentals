package test_main;

public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }
    
    //method to check two objects against each other and see if their names are identical
    public boolean equals(Student other) {
        if (this.name == other.name) {
            return true;
        } else {
            return false;
        }
    }

    //method to compare two Student objects
    public int compareTo(Student other){
        //returns how far apart first letter of both names are, case sensitive
        return this.name.compareTo(other.name);
    }

    //Java somehow knows to use this when trying to print out a class object
    public String toString() {
        return "Student(" + this.name + ")";
    }
}
