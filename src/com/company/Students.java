package com.company;

import java.util.Objects;

public class Students extends Group{
    private long studentsID;
    private String studentsSurname;
    private String studentsName;
    private String studentsFatherName;
    private int yearOfBirth;
    private String address;
    private long telephoneNumber;


    public Students(String faculty, int courseNumber, int groupNumber, long studentsID, String studentsSurname, String studentsName, String studentsFatherName, int yearOfBirth, String address, long telephoneNumber) {
        super(faculty, courseNumber, groupNumber);
        this.studentsID = studentsID;
        this.studentsSurname = studentsSurname;
        this.studentsName = studentsName;
        this.studentsFatherName = studentsFatherName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public long getStudentsID() {
        return studentsID;
    }

    public void setStudentsID(long studentsID) {
        this.studentsID = studentsID;
    }

    public String getStudentsSurname() {
        return studentsSurname;
    }

    public void setStudentsSurname(String studentsSurname) {
        this.studentsSurname = studentsSurname;
    }

    public String getStudentsName() {
        return studentsName;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    public String getStudentsFatherName() {
        return studentsFatherName;
    }

    public void setStudentsFatherName(String studentsFatherName) {
        this.studentsFatherName = studentsFatherName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Students students = (Students) o;
        return studentsID == students.studentsID && yearOfBirth == students.yearOfBirth && telephoneNumber == students.telephoneNumber && Objects.equals(studentsSurname, students.studentsSurname) && Objects.equals(studentsName, students.studentsName) && Objects.equals(studentsFatherName, students.studentsFatherName) && Objects.equals(address, students.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentsID, studentsSurname, studentsName, studentsFatherName, yearOfBirth, address, telephoneNumber);
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentsID=" + studentsID +
                ", studentsSurname='" + studentsSurname + '\'' +
                ", studentsName='" + studentsName + '\'' +
                ", studentsFatherName='" + studentsFatherName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                '}';
    }
}
