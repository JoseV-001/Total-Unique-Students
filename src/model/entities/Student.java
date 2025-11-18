package model.entities;

import java.util.Objects;

public class Student {

    private Integer Code;

    public Student(Integer code) {
        Code = code;
    }

    public Integer getCode() {
        return Code;
    }

    public void Integer(Integer code) {
        Code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(Code, student.Code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Code);
    }
}
