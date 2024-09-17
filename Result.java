package modules;

public class Result {
    int marks;
    Subject subject;

    public Result(int marks, Subject subject) {
        this.marks = marks;
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
