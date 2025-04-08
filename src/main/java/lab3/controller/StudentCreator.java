package lab3.controller;


import lab3.model.Student;
import lab3.enums.Sex;

public class StudentCreator {

    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex, String studentID) {
        return new Student(firstName, lastName, patronymic, sex, studentID);
    }
}