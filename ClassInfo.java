package modules;

public class ClassInfo {
    int grade;
    char section;

    public ClassInfo(int grade, char section){
        this.grade = grade;
        this.section = section;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
}
