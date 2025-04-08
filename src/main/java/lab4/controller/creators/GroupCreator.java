package lab4.controller.creators;

import lab4.model.Group;
import lab4.model.Human;

public class GroupCreator {

    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
}