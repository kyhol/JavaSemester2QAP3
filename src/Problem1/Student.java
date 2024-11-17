package Problem1;

public class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    // Constructor that uses super to call Person constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);  // Calls Person constructor
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter methods
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setter methods
    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}