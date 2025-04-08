package lab4.controller.creators;

import lab4.model.Department;
import lab4.model.Faculty;
import lab4.model.Human;

import java.util.List;

public class FacultyCreator {

    public Faculty createFaculty(String name, Human head, List<Department> departments) {
        return new Faculty(name, head, departments);
    }
}