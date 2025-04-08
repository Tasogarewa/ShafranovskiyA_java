package lab3.controller;

import lab3.model.Group;
import lab3.model.Human;

public class GroupCreator {

    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
}