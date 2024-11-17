package Problem1;

public class Demo {
    public static void main(String[] args) {
        // Create and test Person object
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println("\nPerson: ");
        System.out.println("\t" + bob);

        // Create and test Student object
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println("\nStudent: ");
        System.out.println("\t" + lynne);

        // Create and test Teacher object
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println("\nTeacher: ");
        System.out.println( "\t" + mrJava);

        // Create and test CollegeStudent object
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println("\nCollege Student: \t");
        System.out.println("\t" + ima);

        // Optional: You can also test the getter and setter methods
        System.out.println("\nTesting getter/setter methods:");

        // Test Person methods
        bob.setName("Robert");
        System.out.println("\tUpdated name: " + bob.getName());

        // Test Student methods
        lynne.setGPA(3.8);
        System.out.println("\tUpdated GPA: " + lynne.getGPA());

        // Test Teacher methods
        mrJava.setSalary(55000);
        System.out.println("\tUpdated salary: $" + mrJava.getSalary());

        // Test CollegeStudent methods
        ima.setMajor("Computer Science");
        System.out.println("\tUpdated major: " + ima.getMajor());
    }
}