package com.company.students;

import java.util.*;

class ListsOfStudents {

    Student[] arrayListOfStudents = new Student[]{
            new Student.StudentBuilder().withStudentSurname("Grey").withStudentName("Al").withYearOfBirt(2000).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build(),
            new Student.StudentBuilder().withStudentSurname("Brown").withStudentName("Al").withYearOfBirt(2003).withGroupNumber(131).withCourseNumber(2).withFaculty("Economical").build(),
            new Student.StudentBuilder().withStudentSurname("Red").withStudentName("Al").withYearOfBirt(1999).withGroupNumber(133).withCourseNumber(1).withFaculty("Historical").build(),
            new Student.StudentBuilder().withStudentSurname("Blue").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build(),
            new Student.StudentBuilder().withStudentSurname("Summer").withStudentName("Al").withYearOfBirt(2004).withGroupNumber(131).withCourseNumber(1).withFaculty("Economical").build(),
            new Student.StudentBuilder().withStudentSurname("Winter").withStudentName("Al").withYearOfBirt(2002).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build(),
            new Student.StudentBuilder().withStudentSurname("Spring").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(1).withFaculty("Economical").build(),
            new Student.StudentBuilder().withStudentSurname("Autumn").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build(),
            new Student.StudentBuilder().withStudentSurname("Grey").withStudentName("Al").withYearOfBirt(1998).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build(),
            new Student.StudentBuilder().withStudentSurname("White").withStudentName("Al").withYearOfBirt(2002).withGroupNumber(133).withCourseNumber(2).withFaculty("Historical").build(),
            new Student.StudentBuilder().withStudentSurname("Black").withStudentName("Al").withYearOfBirt(1999).withGroupNumber(131).withCourseNumber(1).withFaculty("Economical").build(),
            new Student.StudentBuilder().withStudentSurname("Rivers").withStudentName("Al").withYearOfBirt(2000).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build(),
            new Student.StudentBuilder().withStudentSurname("Grass").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build(),
            new Student.StudentBuilder().withStudentSurname("Waters").withStudentName("Al").withYearOfBirt(2003).withGroupNumber(131).withCourseNumber(2).withFaculty("Economical").build(),
            new Student.StudentBuilder().withStudentSurname("Flag").withStudentName("Al").withYearOfBirt(2002).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build(),
            new Student.StudentBuilder().withStudentSurname("Stone").withStudentName("Al").withYearOfBirt(2000).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build()
    };


    public void getListStudentsOfFaculty(String faculty) {
        System.out.println("List of students of " + faculty + " faculty");
        for (Student numberOfStudents : arrayListOfStudents) {
            if (numberOfStudents.getFaculty().equals(faculty)) {
                System.out.print(numberOfStudents.toString());
            }
        }
    }

    public void getListOfStudentsYoungerThenSelectedYear(int yearOfBirth) {
        System.out.println("List of students who was born after " + yearOfBirth + " year");
        for (Student numberOfStudents : arrayListOfStudents) {
            if (numberOfStudents.getYearOfBirth() > yearOfBirth) {
                System.out.print(numberOfStudents.toString());
            }
        }
    }

    public void getListStudentsOfGroup(int group) {
        System.out.println("List of students of group  " + group);
        for (Student numberOfStudents : arrayListOfStudents) {
            if (numberOfStudents.getGroupNumber() == group) {
                System.out.print(numberOfStudents.toString());
            }
        }
    }

    public void getListOfStudentsOfALLFacultiesAndCourses() {
        Comparator<Student> comparatorByFacultyAndGroup = new FacultyComparator().thenComparing(new GroupComparator());
        Arrays.sort(arrayListOfStudents, comparatorByFacultyAndGroup);
        System.out.println("List of students sorted by Faculty and Course: \n" + Arrays.toString(arrayListOfStudents));
    }
}
