package com.company;

import java.util.Objects;

class Faculty1 {
    private String faculty1;

    public Faculty1() {
        super();
    }

    public Faculty1(String faculty) {
        this.faculty1 = faculty;
    }

    public String getFaculty1() {
        return faculty1;
    }

    public void setFaculty(String faculty) {
        this.faculty1 = faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty1 faculty1 = (Faculty1) o;
        return Objects.equals(faculty1, faculty1.faculty1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty1);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "faculty='" + faculty1 + '\'' +
                '}';
    }
}
