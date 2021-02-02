package com.company.students;

import java.util.ArrayList;
import java.util.List;

class ListsOfStudents {
    private final List<Student> studentsList = new ArrayList<>();

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void getListStudentsOfFaculty(String faculty) {
        System.out.println("List of students of " + faculty + " faculty");
        for (Student numberOfStudents : studentsList) {
            if (numberOfStudents.getFaculty().equals(faculty)) {
                System.out.print(numberOfStudents.toString());
            }
        }
    }

    public void getListOfStudentsYoungerThenSelectedYear(int yearOfBirth) {
        System.out.println("List of students who was born after " + yearOfBirth + " year");
        for (Student numberOfStudents : studentsList) {
            if (numberOfStudents.getYearOfBirth() > yearOfBirth) {
                System.out.print(numberOfStudents.toString());
            }
        }
    }

    public void getListStudentsOfGroup(int group) {
        System.out.println("List of students of group  " + group);
        for (Student numberOfStudents : studentsList) {
            if (numberOfStudents.getGroupNumber() == group) {
                System.out.print(numberOfStudents.toString());
            }
        }
    }
}
