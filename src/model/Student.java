package model;

import java.util.Objects;

public class Student {

    private String name;
    private int roll_no;
    private String section;

    public Student(String name, int roll_no, String section) {
        this.name = name;
        this.roll_no = roll_no;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRoll_no() == student.getRoll_no() && getName().equals(student.getName()) && getSection().equals(student.getSection());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRoll_no(), getSection());
    }
}
