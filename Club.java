package modules;

import java.util.ArrayList;

public class Club {
    String name;
    String type;
    ArrayList<Student> students = new ArrayList<>();

    public Club(String name, String type, ArrayList<Student> students) {
        this.name = name;
        this.type = type;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
