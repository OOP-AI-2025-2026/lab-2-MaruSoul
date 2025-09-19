package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kateryna", 2);
        student.addCourse("OPP");
        student.addCourse("IoT");
        student.addCourse("Database");

        System.out.println(student.getName() + ": кількість вивчаємих дисциплін - " + student.getCourseCount());
        System.out.println(student.getName() + ": рік навчання - " + student.getYear());
        System.out.println(student.getName() + ": заплатив за навчання - " + student.getTuition());
    }
}