package lab4.controller.creators;


import lab4.model.enums.Sex;
import lab4.model.Student;

public class StudentCreator {

    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex, String studentID) {
        return new Student(firstName, lastName, patronymic, sex, studentID);
    }
}