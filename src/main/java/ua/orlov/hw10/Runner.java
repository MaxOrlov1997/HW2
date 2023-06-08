package ua.orlov.hw10;

public class Runner {

    public static void main(String... args) {
        Student student = new Student();
        System.out.println("Scholarship student = " + student.getScholarship());
        Aspirant aspirant = new Aspirant();
        System.out.println("Scientific work - " + aspirant.getScientificWork());
        System.out.println("Scholarship aspirant = " + aspirant.getScholarship());
        Student[] students = new Student[3];
        students[0] = new Student("Ira", "Frolova", "Onl 6 java", 4.5);
        students[1] = new Student("Vova", "Sova", "Onl 6 java", 4.8);
        students[2] = new Aspirant("Igor", "Ova", "Onl 6 java", 5.0, "Google Maps");
        System.out.println(students[0].firstName + " " + students[0].lastName +
                " " + students[0].group + " " + students[0].getScholarship());
        System.out.println(students[1].firstName + " " + students[1].lastName + " " +
                students[1].group + " " + students[1].getScholarship());
        System.out.println(students[2].firstName + " " + students[2].lastName + " " + students[2].group
               + " " + students[2].getScholarship());
    }
}
