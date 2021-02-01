package com.company.students;

import java.util.Comparator;

public class SortByFaculty implements Comparator <Student> {
    public int compare (Student stud1, Student stud2) {
        return stud1.getFaculty().compareTo(stud2.getFaculty());
    }
}
