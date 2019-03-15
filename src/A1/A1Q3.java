
public class A1Q3 {
    public static void main(String[] args) {
        int lecture = Integer.parseInt(args[0]);
        int lab = Integer.parseInt(args[1]);
        int assignment = Integer.parseInt(args[2]);
        int project = Integer.parseInt(args[3]);
        int exam = Integer.parseInt(args[4]);
        float score = lecture * 0.1f + lab * 0.1f + assignment * 0.3f + project * 0.2f + exam * 0.3f;
        String grade;
        if (score >= 80)
            grade = "A";
        else if (score >= 50)
            grade = "B";
        else
            grade = "C";
        System.out.printf("%.2f\n%s\n", score, grade);
    }
}
