package com.company;

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

//    public Student(String faculty, int courseNumber, int groupNumber, long studentsID, String studentsSurname, String studentsName, String studentsFatherName, int yearOfBirth, String address, long telephoneNumber) {
//        super(faculty, courseNumber, groupNumber);
//        this.studentID = studentsID;
//        this.studentSurname = studentsSurname;
//        this.studentName = studentsName;
//        this.studentFatherName = studentsFatherName;
//        this.yearOfBirth = yearOfBirth;
//        this.address = address;
//        this.telephoneNumber = telephoneNumber;
//    }

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

    public static class Builder {
        private Student newStudent;

        public Builder() {
          newStudent = new Student();
        }

        public Builder withStudentID(long studentID) {
            newStudent.studentID = studentID;
            return this;
        }

        public Builder withStudentName(String studentName) {
            newStudent.studentName = studentName;
            return this;
        }

        public Builder withStudentSurname(String studentSurname) {
            newStudent.studentSurname = studentSurname;
            return this;
        }

        public Builder withStudentFatherName(String studentFatherName) {
            newStudent.studentFatherName = studentFatherName;
            return this;
        }

        public Builder withYearOfBirt(int yearOfBirt) {
            newStudent.yearOfBirth = yearOfBirt;
            return this;
        }

        public Builder withAddress(String address) {
            newStudent.address = address;
            return this;
        }

        public Builder withTelephoneNumber(long telephoneNumber) {
            newStudent.telephoneNumber = telephoneNumber;
            return this;
        }

        public Builder withCourseNumber(int courseNumber) {
            newStudent.courseNumber = courseNumber;
            return this;
        }

        public Builder withGroupNumber(int groupNumber) {
            newStudent.groupNumber = groupNumber;
            return this;
        }

        public Builder withFaculty(String faculty) {
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
        return "Student{" +
                "studentID=" + studentID +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentFatherName='" + studentFatherName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", groupNumber=" + groupNumber +
                ", courseNumber=" + courseNumber +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
