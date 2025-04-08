package lab3.controller;

import lab3.model.Faculty;
import lab3.model.Human;
import lab3.model.Department;

import java.util.List;

public class FacultyCreator {

    public Faculty createFaculty(String name, Human head, List<Department> departments) {
        return new Faculty(name, head, departments);
    }
}