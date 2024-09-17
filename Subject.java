package modules;

public class Subject {
    int subjectId;
    String name;
    int passMarks;
    int fullMarks;
    String teacher;

    public Subject(int subjectId, String name, int passMarks, int fullMarks, String teacher) {
        this.subjectId = subjectId;
        this.name = name;
        this.passMarks = passMarks;
        this.fullMarks = fullMarks;
        this.teacher = teacher;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassMarks() {
        return passMarks;
    }

    public void setPassMarks(int passMarks) {
        this.passMarks = passMarks;
    }

    public int getFullMarks() {
        return fullMarks;
    }

    public void setFullMarks(int fullMarks) {
        this.fullMarks = fullMarks;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
