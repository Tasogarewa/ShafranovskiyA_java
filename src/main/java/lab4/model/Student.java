package lab4.model;

import lab4.model.enums.Sex;

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