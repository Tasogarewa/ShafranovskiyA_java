package lab3.controller;

import lab3.model.Department;
import lab3.model.Human;

public class DepartmentCreator {

    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}