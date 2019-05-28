package LastLab;

public class Student {
    private String name;
    private String gender;
    Student(String name,String gender){
        this.name = name;
        this.gender=gender;
    }
    
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", gender='" + gender + '\'' ;
    }
}
