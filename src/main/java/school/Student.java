package school;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private static int nextId;
    private int id;
    private String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Student other = (Student) obj;
        if (this.id != other.id) return false;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                id + ',' + name +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return id - o.id;
    }
}

