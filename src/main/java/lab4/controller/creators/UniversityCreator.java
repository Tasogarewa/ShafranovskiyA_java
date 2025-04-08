package lab4.controller.creators;

import lab4.model.*;
import lab4.model.enums.Sex;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {

    public static University createTypicalUniversity() {
        Human rector = new Human("Олександр", "Іваненко", "Іванович", Sex.MALE);

        List<Faculty> faculties = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            String facultyName = "Факультет " + i;
            Human dean = new Human("Декан" + i, "Петров", "Олегович", Sex.MALE);

            List<Department> departments = new ArrayList<>();
            for (int j = 1; j <= 2; j++) {
                String departmentName = "Кафедра " + i + "." + j;
                Human headOfDepartment = new Human("Завкаф" + j, "Сидоренко", "Іванівна", Sex.FEMALE);

                List<Group> groups = new ArrayList<>();
                for (int k = 1; k <= 2; k++) {
                    String groupName = "Група " + i + "." + j + "." + k;
                    Human groupHead = new Human("Староста" + k, "Литвин", "Андріївна", Sex.FEMALE);

                    groups.add(new Group(groupName, groupHead));
                }

                departments.add(new Department(departmentName, headOfDepartment));
            }

            faculties.add(new Faculty(facultyName, dean, departments));
        }

        return new University("Типовий Університет", rector, faculties);
    }

    public University createUniversity(String name, Human head, List<Faculty> faculties) {
        return new University(name, head, faculties);
    }
}