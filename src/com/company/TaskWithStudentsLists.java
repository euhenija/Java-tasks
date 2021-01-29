package com.company;

import java.util.ArrayList;


public class TaskWithStudentsLists {

    public static void main(String[] args) {
        Student[] listOfStudents = new Student[16];
        listOfStudents[0] = new Student.Builder().withStudentSurname("Grey").withStudentName("Al").withYearOfBirt(2000).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[1] = new Student.Builder().withStudentSurname("Brown").withStudentName("Al").withYearOfBirt(2003).withGroupNumber(131).withCourseNumber(2).withFaculty("Economical").build();
        listOfStudents[2] = new Student.Builder().withStudentSurname("Red").withStudentName("Al").withYearOfBirt(1999).withGroupNumber(133).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[3] = new Student.Builder().withStudentSurname("Blue").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[4] = new Student.Builder().withStudentSurname("Summer").withStudentName("Al").withYearOfBirt(2004).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[5] = new Student.Builder().withStudentSurname("Winter").withStudentName("Al").withYearOfBirt(2002).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[6] = new Student.Builder().withStudentSurname("Spring").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[7] = new Student.Builder().withStudentSurname("Autumn").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[8] = new Student.Builder().withStudentSurname("Grey").withStudentName("Al").withYearOfBirt(1998).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[9] = new Student.Builder().withStudentSurname("White").withStudentName("Al").withYearOfBirt(2002).withGroupNumber(133).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[10] = new Student.Builder().withStudentSurname("Black").withStudentName("Al").withYearOfBirt(1999).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[11] = new Student.Builder().withStudentSurname("Rivers").withStudentName("Al").withYearOfBirt(2000).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[12] = new Student.Builder().withStudentSurname("Grass").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[13] = new Student.Builder().withStudentSurname("Waters").withStudentName("Al").withYearOfBirt(2003).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[14] = new Student.Builder().withStudentSurname("Flag").withStudentName("Al").withYearOfBirt(2002).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[15] = new Student.Builder().withStudentSurname("Stone").withStudentName("Al").withYearOfBirt(2000).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();


        System.out.println("List of students of Historical faculty \n" + getListStudentsOfFaculty(listOfStudents));

        System.out.println("List of students who was born after 2000 \n" + getListOfStudentsYoungerThenSelectedYear(listOfStudents));

        System.out.println("List of students of group 133 \n" + getListStudentsOfGroup(listOfStudents));


    }

    //    //Getting list of Students of selected Faculty
    public static ArrayList<String> getListStudentsOfFaculty(Student[] listOfStudents) {
        ArrayList<String> listOfFacultyStudents = new ArrayList<>();
        for (Student listOfStudent : listOfStudents) {
            if (listOfStudent.getFaculty().equals("Economical")) {
                listOfFacultyStudents.add(listOfStudent.getStudentSurname() + " " + listOfStudent.getStudentName());
            }
        }
        return listOfFacultyStudents;
    }

    //Getting list of Students with year of birth after selected
    public static ArrayList<String> getListOfStudentsYoungerThenSelectedYear(Student[] listOfStudents) {
        ArrayList<String> listOfStudentsOfSelectedYear = new ArrayList<>();
        for (Student listOfStudent : listOfStudents) {
            if (listOfStudent.getYearOfBirth() > 2000) {
                listOfStudentsOfSelectedYear.add(listOfStudent.getStudentSurname() + " " + listOfStudent.getStudentName() + " " + listOfStudent.getStudentFatherName() + " " + listOfStudent.getYearOfBirth());
            }
        }
        return listOfStudentsOfSelectedYear;
    }


    //Getting list of Students of selected Group
    public static ArrayList<String> getListStudentsOfGroup(Student[] listOfStudents) {
        ArrayList<String> listStudentsOfGroup = new ArrayList<>();
        for (Student listOfStudent : listOfStudents) {
            if (listOfStudent.getGroupNumber() == 133) {
                listStudentsOfGroup.add(listOfStudent.getStudentSurname() + " " + listOfStudent.getStudentName() + " " + listOfStudent.getStudentFatherName());
            }
        }
        return listStudentsOfGroup;
    }
}
