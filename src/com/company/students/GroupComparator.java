package com.company.students;

import java.util.Comparator;

public class GroupComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getCourseNumber() - (o2.getCourseNumber());
    }
}
