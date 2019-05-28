package A4;

public class Course {
    private String name;
    private int credit;
    private String grade;
    private String teacher;
    
    public Course(String name) {
        this.name = name;
    }
    
    public Course(String name, int credit, String grade, String teacher) {
        this.name = name;
        this.credit = credit;
        this.grade = grade;
        this.teacher = teacher;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getCredit() {
        return credit;
    }
    
    public void setCredit(int credit) {
        this.credit = credit;
    }
    
    public String getGrade() {
        return grade;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public String getTeacher() {
        return teacher;
    }
    
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public String getCourseLevel() {
        if (grade.equalsIgnoreCase("junior") || grade.equalsIgnoreCase("senior"))
            return "major course";
        else if (grade.equalsIgnoreCase("freshman") || grade.equalsIgnoreCase("sophomore"))
            return "common course";
        else
            return "not valid query";
    }
    
    public String getQualificationForCourse(String grade) {
        int flag;
        if (this.grade.equalsIgnoreCase("freshman") || this.grade.equalsIgnoreCase("sophomore"))
            flag = 0;
        else if (this.grade.equalsIgnoreCase("junior") || this.grade.equalsIgnoreCase("senior"))
            flag = 1;
        else
            flag = -1;
        if ((flag == 0 && (grade.equalsIgnoreCase("freshman") || grade.equalsIgnoreCase("sophomore"))) || (flag == 1 && (grade.equalsIgnoreCase("junior") || grade.equalsIgnoreCase("senior"))))
            return "You are qualified for the course";
        else if (flag != -1)
            return "You are not qualified for the course";
        else
            return "not valid query";
    }
    
    public boolean isWithLab() {
        if (credit == 3) {
            return true;
        } else
            return false;
    }
}
