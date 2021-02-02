package com.company.students;

import java.util.Comparator;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Student[] listOfStudents = new Student[16];
        listOfStudents[0] = new Student.StudentBuilder().withStudentSurname("Grey").withStudentName("Al").withYearOfBirt(2000).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[1] = new Student.StudentBuilder().withStudentSurname("Brown").withStudentName("Al").withYearOfBirt(2003).withGroupNumber(131).withCourseNumber(2).withFaculty("Economical").build();
        listOfStudents[2] = new Student.StudentBuilder().withStudentSurname("Red").withStudentName("Al").withYearOfBirt(1999).withGroupNumber(133).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[3] = new Student.StudentBuilder().withStudentSurname("Blue").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[4] = new Student.StudentBuilder().withStudentSurname("Summer").withStudentName("Al").withYearOfBirt(2004).withGroupNumber(131).withCourseNumber(1).withFaculty("Economical").build();
        listOfStudents[5] = new Student.StudentBuilder().withStudentSurname("Winter").withStudentName("Al").withYearOfBirt(2002).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[6] = new Student.StudentBuilder().withStudentSurname("Spring").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(1).withFaculty("Economical").build();
        listOfStudents[7] = new Student.StudentBuilder().withStudentSurname("Autumn").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[8] = new Student.StudentBuilder().withStudentSurname("Grey").withStudentName("Al").withYearOfBirt(1998).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[9] = new Student.StudentBuilder().withStudentSurname("White").withStudentName("Al").withYearOfBirt(2002).withGroupNumber(133).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[10] = new Student.StudentBuilder().withStudentSurname("Black").withStudentName("Al").withYearOfBirt(1999).withGroupNumber(131).withCourseNumber(1).withFaculty("Economical").build();
        listOfStudents[11] = new Student.StudentBuilder().withStudentSurname("Rivers").withStudentName("Al").withYearOfBirt(2000).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[12] = new Student.StudentBuilder().withStudentSurname("Grass").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[13] = new Student.StudentBuilder().withStudentSurname("Waters").withStudentName("Al").withYearOfBirt(2003).withGroupNumber(131).withCourseNumber(2).withFaculty("Economical").build();
        listOfStudents[14] = new Student.StudentBuilder().withStudentSurname("Flag").withStudentName("Al").withYearOfBirt(2002).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[15] = new Student.StudentBuilder().withStudentSurname("Stone").withStudentName("Al").withYearOfBirt(2000).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();

        ListsOfStudents selectedList = new ListsOfStudents();
        for (Student listOfStudent : listOfStudents) {
            selectedList.addStudent(listOfStudent);
        }


        selectedList.getListStudentsOfFaculty("Economical");
        selectedList.getListOfStudentsYoungerThenSelectedYear(2000);
        selectedList.getListStudentsOfGroup(131);

        Comparator<Student> comparatorByFacultyAndGroup = new FacultyComporator().thenComparing(new GroupComparator());
        Arrays.sort(listOfStudents, comparatorByFacultyAndGroup);
        System.out.println("List of students sorted by Faculty and Course: \n" + Arrays.toString(listOfStudents));

    }
}
