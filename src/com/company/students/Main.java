package com.company.students;

public class Main {

    public static void main(String[] args) {


        ListsOfStudents selectedList = new ListsOfStudents();

        selectedList.getListStudentsOfFaculty("Historical");
        selectedList.getListOfStudentsYoungerThenSelectedYear(2000);
        selectedList.getListStudentsOfGroup(131);
        selectedList.getListOfStudentsOfALLFacultiesAndCourses();

    }
}
