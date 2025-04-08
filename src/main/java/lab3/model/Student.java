package lab3.model;

import lab3.enums.Sex;

public class Student extends Human {
    private String studentID;

    public Student(String firstName, String lastName, String patronymic, Sex sex, String studentID) {
        super(firstName, lastName, patronymic, sex);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }
}