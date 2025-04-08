package lab4.model;


import java.util.Objects;

public class Department {
    private String name;
    private Human head;

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department department = (Department) o;
        return Objects.equals(name, department.name) &&
                Objects.equals(head, department.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head);
    }
}