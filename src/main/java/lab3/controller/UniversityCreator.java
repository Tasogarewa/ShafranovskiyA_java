package lab3.controller;

import lab3.model.University;
import lab3.model.Human;
import lab3.model.Faculty;

import java.util.List;

public class UniversityCreator {

    public University createUniversity(String name, Human head, List<Faculty> faculties) {
        return new University(name, head, faculties);
    }
}