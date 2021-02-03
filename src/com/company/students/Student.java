package com.company.students;

import java.util.Comparator;
import java.util.Objects;

public class Student {
    private long studentID;
    private String studentSurname;
    private String studentName;
    private String studentFatherName;
    private int yearOfBirth;
    private String address;
    private long telephoneNumber;
    private int groupNumber;
    private int courseNumber;
    private String faculty;


    public long getStudentID() {
        return studentID;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentFatherName() {
        return studentFatherName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }


    public int getGroupNumber() {
        return groupNumber;
    }


    public int getCourseNumber() {
        return courseNumber;
    }


    public String getFaculty() {
        return faculty;
    }

    public static class StudentBuilder {
        private Student newStudent;

        public StudentBuilder() {
          newStudent = new Student();
        }

        public StudentBuilder withStudentID(long studentID) {
            newStudent.studentID = studentID;
            return this;
        }

        public StudentBuilder withStudentName(String studentName) {
            newStudent.studentName = studentName;
            return this;
        }

        public StudentBuilder withStudentSurname(String studentSurname) {
            newStudent.studentSurname = studentSurname;
            return this;
        }

        public StudentBuilder withStudentFatherName(String studentFatherName) {
            newStudent.studentFatherName = studentFatherName;
            return this;
        }

        public StudentBuilder withYearOfBirt(int yearOfBirt) {
            newStudent.yearOfBirth = yearOfBirt;
            return this;
        }

        public StudentBuilder withAddress(String address) {
            newStudent.address = address;
            return this;
        }

        public StudentBuilder withTelephoneNumber(long telephoneNumber) {
            newStudent.telephoneNumber = telephoneNumber;
            return this;
        }

        public StudentBuilder withCourseNumber(int courseNumber) {
            newStudent.courseNumber = courseNumber;
            return this;
        }

        public StudentBuilder withGroupNumber(int groupNumber) {
            newStudent.groupNumber = groupNumber;
            return this;
        }

        public StudentBuilder withFaculty(String faculty) {
            newStudent.faculty = faculty;
            return this;
        }

        public Student build () {
            return newStudent;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID && yearOfBirth == student.yearOfBirth && telephoneNumber == student.telephoneNumber && groupNumber == student.groupNumber && courseNumber == student.courseNumber && Objects.equals(studentSurname, student.studentSurname) && Objects.equals(studentName, student.studentName) && Objects.equals(studentFatherName, student.studentFatherName) && Objects.equals(address, student.address) && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, studentSurname, studentName, studentFatherName, yearOfBirth, address, telephoneNumber, groupNumber, courseNumber, faculty);
    }

    @Override
    public String toString() {
        return
                "studentSurname: " + studentSurname +
                ", studentName: " + studentName +
                ", yearOfBirth: " + yearOfBirth +
                ", groupNumber: " + groupNumber +
                ", courseNumber: " + courseNumber +
                ", faculty: " + faculty + "\n";
    }

}
