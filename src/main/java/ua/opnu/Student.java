package ua.opnu;

public class Student {

    private final String name;
    private static final int ANNUAL_COST = 20000;

    private final int year;

    private String[] courses = new String[20];
    private int courseCount;

    public Student(String name, int year) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        if (year < 1 || year > 4) {
            throw new IllegalArgumentException("Year must be between 1 and 4");
        }

        this.name = name;
        this.year = year;
    }

    public void addCourse(String course) {
        if (course == null || course.isBlank()) {
            throw new IllegalArgumentException("Course name cannot be null or empty");
        }

        if (courseCount >= courses.length) {
            throw new IllegalStateException("No more space for courses");
        }

        courses[courseCount++] = course;
    }

    public void dropAll() {
        courses = new String[20];
        courseCount = 0;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public String getName() {
        return name;
    }

    public int getTuition() {
        return year * ANNUAL_COST;
    }

    public int getYear() {
        return year;
    }
}
