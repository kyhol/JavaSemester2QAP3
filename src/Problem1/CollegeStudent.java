package Problem1;

public class CollegeStudent extends Student {
    // Private instance variables specific to CollegeStudent
    private String major;
    private int year;

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum,
                          double gpa, int year, String major) {
        // Call Student constructor to handle name, age, gender, idNum, and gpa
        super(name, age, gender, idNum, gpa);
        // Initialize CollegeStudent-specific fields
        this.year = year;
        this.major = major;
    }

    // Getter methods
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Override toString() to include CollegeStudent-specific information
    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}