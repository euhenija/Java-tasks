package com.company.students;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class TaskWithStudentsLists {

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
        listOfStudents[10] = new Student.StudentBuilder().withStudentSurname("Black").withStudentName("Al").withYearOfBirt(1999).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[11] = new Student.StudentBuilder().withStudentSurname("Rivers").withStudentName("Al").withYearOfBirt(2000).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[12] = new Student.StudentBuilder().withStudentSurname("Grass").withStudentName("Al").withYearOfBirt(2001).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[13] = new Student.StudentBuilder().withStudentSurname("Waters").withStudentName("Al").withYearOfBirt(2003).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();
        listOfStudents[14] = new Student.StudentBuilder().withStudentSurname("Flag").withStudentName("Al").withYearOfBirt(2002).withGroupNumber(131).withCourseNumber(1).withFaculty("Historical").build();
        listOfStudents[15] = new Student.StudentBuilder().withStudentSurname("Stone").withStudentName("Al").withYearOfBirt(2000).withGroupNumber(131).withCourseNumber(2).withFaculty("Historical").build();


        Comparator<Student> facultyAndCourseComparator = Comparator.comparing(Student::getFaculty).thenComparing(Student::getCourseNumber);
        Arrays.sort(listOfStudents, facultyAndCourseComparator);
        System.out.println("List of students sorted by Faculty and Course: \n"+Arrays.toString(listOfStudents));

        System.out.println("List of students of Historical faculty \n" + getListStudentsOfFaculty(listOfStudents));

        System.out.println("List of students who was born after 2000 \n" + getListOfStudentsYoungerThenSelectedYear(listOfStudents));

        System.out.println("List of students of group 133 \n" + getListStudentsOfGroup(listOfStudents));
        //System.out.println("List of students of group 133 \n" + getStudentsListOfFaculty("Historical"));
    }


        //Getting list of Students of selected Faculty
    public static ArrayList<String> getListStudentsOfFaculty (Student[] listOfStudents) {
        int a = listOfStudents.length;
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
                listOfStudentsOfSelectedYear.add(listOfStudent.getStudentSurname() + " " + listOfStudent.getStudentName() + " " + listOfStudent.getYearOfBirth());
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
//    public static void getStudentsListOfFaculty(String faculty, int a) {
//        System.out.println("List of students of %s faculty \n" + faculty);
//
//        for (Student listOfStudents : a) {
//            if (listOfStudents.getFaculty().equals(faculty)) {
//                System.out.println(listOfStudents.toString());
//            }
//        }
//    }
}
