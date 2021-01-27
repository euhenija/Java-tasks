package com.company;

import java.util.Objects;

public class Course extends Faculty {

    private int courseNumber;

    public Course() {
        super();
    }
    public Course( int courseNumber){
            this.courseNumber = courseNumber;
        }

    public Course(String faculty, int courseNumber){
            super(faculty);
            this.courseNumber = courseNumber;
        }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Course course = (Course) o;
        return courseNumber == course.courseNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), courseNumber);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseNumber=" + courseNumber +
                '}';
    }
}

