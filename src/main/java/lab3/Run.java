package lab3;

import lab3.controller.*;
import lab3.enums.Sex;
import lab3.model.*;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        Human universityHead = new Human("Ivan", "Ivanov", "Ivanovich", Sex.MALE);
        Human facultyHead = new Human("Olga", "Petrova", "Petrovna", Sex.FEMALE);
        Human departmentHead = new Human("Sergey", "Kovalev", "Sergeevich", Sex.MALE);
        Human groupHead = new Human("Maria", "Sidorova", "Sidorovna", Sex.FEMALE);

        StudentCreator studentCreator = new StudentCreator();
        Student student = studentCreator.createStudent("Alex", "Smirnov", "Alexandrovich", Sex.MALE, "12345");

        GroupCreator groupCreator = new GroupCreator();
        Group group = groupCreator.createGroup("Group 1", groupHead);

        DepartmentCreator departmentCreator = new DepartmentCreator();
        Department department = departmentCreator.createDepartment("Computer Science", departmentHead);

        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty = facultyCreator.createFaculty("Faculty of IT", facultyHead, Arrays.asList(department));

        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversity("Tech University", universityHead, Arrays.asList(faculty));

        System.out.println("University: " + university.getName());
        System.out.println("Head: " + university.getHead().getFirstName() + " " + university.getHead().getLastName());
        System.out.println("Faculty: " + faculty.getName());
        System.out.println("Department: " + department.getName());
        System.out.println("Group: " + group.getName());
        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
    }
}