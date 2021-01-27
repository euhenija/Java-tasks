package com.company;

import java.util.Objects;

public class Group extends Course{
    private int groupNumber;

    public Group() {
        super();
    }

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Group(int courseNumber, int groupNumber) {
        super(courseNumber);
        this.groupNumber = groupNumber;
    }

    public Group(String faculty, int courseNumber, int groupNumber) {
        super(faculty, courseNumber);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Group group = (Group) o;
        return groupNumber == group.groupNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), groupNumber);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber=" + groupNumber +
                '}';
    }
}
