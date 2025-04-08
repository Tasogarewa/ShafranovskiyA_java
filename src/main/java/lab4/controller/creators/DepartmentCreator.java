package lab4.controller.creators;

import lab4.model.Department;
import lab4.model.Human;

public class DepartmentCreator {

    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}