

public class A2Q3 {
    public static void main(String[] args) {
        int  credit, i = 1, total_credit = 0;
        float grade, final_grade = 0,percentage;
        while (i < args.length) {
            percentage = Float.parseFloat(args[i - 1]);
            credit = Integer.parseInt(args[i]);
            i+=2;
            int score =(int)percentage;
            switch (score) {
                case 100:
                case 99:
                case 98:
                case 97:
                    grade = 4.00f;
                    break;
                
                case 96:
                case 95:
                case 94:
                case 93:
                    grade = 3.94f;
                    break;
                
                case 92:
                case 91:
                case 90:
                    grade = 3.85f;
                    break;
                
                case 89:
                case 88:
                case 87:
                    grade = 3.73f;
                    break;
                
                case 86:
                case 85:
                case 84:
                case 83:
                    grade = 3.55f;
                    break;
                
                case 82:
                case 81:
                case 80:
                    grade = 3.32f;
                    break;
                
                case 79:
                case 78:
                case 77:
                    grade = 3.09f;
                    break;
                
                case 76:
                case 75:
                case 74:
                case 73:
                    grade = 2.78f;
                    break;
                
                case 72:
                case 71:
                case 70:
                    grade = 2.42f;
                    break;
                
                case 69:
                case 68:
                case 67:
                    grade = 2.08f;
                    break;
                
                case 66:
                case 65:
                case 64:
                case 63:
                    grade = 1.63f;
                    break;
                
                case 62:
                case 61:
                case 60:
                    grade = 1.15f;
                    break;
                
                default:
                    grade = 0.00f;
                    break;
            }
            final_grade += grade*credit;
            total_credit += credit;
        }
        System.out.printf("%.2f",final_grade/(float)total_credit);
        
    }
}
