package modules;

import java.util.ArrayList;

public class Student {
    String name;
    int studentId;
    ClassInfo classInfo;
    ArrayList<Subject> subjects = new ArrayList<>();
    ArrayList<Result> results = new ArrayList<>();
    ArrayList<Club> clubs = new ArrayList<>();
    ArrayList<Bill> bills = new ArrayList<>();

    public Student(String name, int studentId, ClassInfo classInfo, ArrayList<Subject> subjects, ArrayList<Result> results, ArrayList<Club> clubs, ArrayList<Bill> bills) {
        this.name = name;
        this.studentId = studentId;
        this.classInfo = classInfo;
        this.subjects = subjects;
        this.results = results;
        this.clubs = clubs;
        this.bills = bills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public ArrayList<Club> getClubs() {
        return clubs;
    }

    public void setClubs(ArrayList<Club> clubs) {
        this.clubs = clubs;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }
}