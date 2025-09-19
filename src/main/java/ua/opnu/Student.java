package ua.opnu;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private static final int ANNUAL_COST = 20000;

    private final int year;

    private final List<String> courses = new ArrayList<>();

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

        courses.add(course);
    }

    public void dropAll() {
        courses.clear();
    }

    public int getCourseCount() {
        return courses.size();
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
