package A2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class A2Q4 {
    public static void main(String[] args) {
//        double sum = 0;
//        String str="0";
////        Scanner in=new Scanner(System.in);
////        String str=in.next();
//        for (int i = 0; i < args.length; i++) {
//            str = "n";
//        }
//        double x=Double.parseDouble(a[0].trim());       
//        double y=Double.parseDouble(a[1].trim());       
//        
//        if(b[i].equals("+"))
//            sum=x+y;
//        if(b[i].equals("-"))
//            sum=x-y;
//        if(b[i].equals("*"))
//            sum=x*y;
//        if(b[i].equals("/"))
//            sum=x/y;
//        //  System.out.println(x);
//        //  System.out.println(y);
//        //  System.out.println(b[3]);
//        //  System.out.println(i);
//        System.out.printf("%.2f",sum);

//        Scanner sc = new Scanner(System.in);
//        String str = "";
        /*
        String str = args[0];
//        while (sc.hasNext()) {

//            if (str[0].equals("0")) {
//                break;
//            }

//        LinkedList<Op1> s2 = new LinkedList<Op1>(); 
//        ArrayList<Double> numbers = new ArrayList<>();
//        ArrayList<Character> operator = new ArrayList<>();
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operator = new Stack<>();
        char[] chars = str.toCharArray();
        String num = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                num += chars[i];
                continue;
            } else if (chars[i] != ' ') {
                if (!num.isEmpty()) {
                    numbers.add(Double.parseDouble(num));
                }
//                Op1 op = new Op1();
//                op.operator = c[i];
                switch (chars[i]) {
                    case '+':
                    case '-':
//                        op.priority = 1;
                        break;
                    case '*':
                    case '/':
//                        op.priority = 2;
                        break;
                    default:
                        break;
                }
                if (operator.equals("") ||)
                
                
//                if (s2.isEmpty() || op.priority > s2.getLast().priority) {
//                    s2.add(op);
            }
//                else {
//                    char yun;
//                    while (!s2.isEmpty() && op.priority <= s2.getLast().priority) {
//                        double n1 = s1.pollLast();
//                        double n2 = s1.pollLast();
//                        yun = s2.pollLast().operator;
//                        switch (yun) {
//                            case '+':
//                                s1.add(n2 + n1);    
//                                break;
//                            case '-':
//                                s1.add(n2 - n1);
//                                break;
//                            case '*':
//                                s1.add(n2 * n1);
//                                break;
//                            case '/':
//                                s1.add(n2 / n1);
//                                break;
//                            default:
//                                break;
//                        }
//                    }//while
//                    s2.add(op);
//                }
//                num = "";
//            }
//
//        }
            
//        if (!num.isEmpty()) {
//            s1.add(Double.parseDouble(num));
//        }
//        while (!s2.isEmpty()) {
//            double n1 = s1.pollLast();
//            double n2 = s1.pollLast();
//            char yun = s2.pollLast().operator;
//            switch (yun) {
//                case '+':
//                    s1.add(n2 + n1);    
//                    break;
//                case '-':
//                    s1.add(n2 - n1);
//                    break;
//                case '*':
//                    s1.add(n2 * n1);
//                    break;
//                case '/':
//                    s1.add(n2 / n1);
//                    break;
//                default:
//                    break;
//            }
//        }
//        System.out.println(String.format("%1$.2f", s1.getLast()));
//    }
//
//}


//class Op1 {
//    char operator;
//    int priority;
//
//    private Op1() {
//        super();
//
//    }
//
//    public Op1(char operator, int priority) {
//        super();
//        this.operator = operator;
//        this.priority = priority;
//    }
//
//}
        }
        */
        /*
        //if (0 == args.length) return;
        int n = args[0].length();
        double[] num = new double[3];
        char[] cal = new char[2];
        int nums = 0;
        int cals = 0;
        int j = 0;
        String strNumber = "";
        //to parse the string
        for (int i = 0; i < n; i++) { //System.out.print(args[0].charAt(i));
            if (!args[0].equals(strNumber)) {
                switch (args[0].charAt(i)) {
                    case '+':
                    case '-':
                        cal[0] = args[0].charAt(i);
                        break;
                    case '*':
                    case '/':
                        cal[1] = args[0].charAt(i);
                        cals = nums - 1;
                        break;
                    case '(': {
                        j = nums;
                        break;
//                        switch (args[0].charAt(j)) {
//                            case '+':
//                                double ni = n1 + n2;
//                                num[nums] = ni;
//                                nums++;
//                                break;
//                            case '-':
//                                ni = n1 - n2;
//                                num[nums] = ni;
//                                nums++;
//                                break;
//                            case '*':
//                            case '/':
//                                continue;
//                        }
                    }
                    case ')':
                        break;
                    case '.':
                        num[nums - 1] = Double.parseDouble(args[0].substring(i - 1, i + 2));
                        i++;
                        break;
                    default: {
                        num[nums] = Double.parseDouble(args[0].substring(i, i + 1));
                        nums++;
                    }
                } //System.out.print(nums+","+cals);
            }
        }
        //// to calculate
        double result = 0.0;
        if (j != 0) {
        
        }

        if (j == 0) {
            switch (cal[1]) {
                case '*':
                    result = num[cals] * num[cals + 1];
                    break;
                case '/':
                    result = num[cals] / num[cals + 1];
                    break;
            }
            int i;
            if (cals == 0)
                i = 2;
            else
                i = 0;
            switch (cal[0]) {
                case '+':
                    result += num[i];
                case '-':
                    result -= num[i];
            }
        } else {
            
        }
        
        // to print result
        System.out.printf("%s=%.2f", args[0], result);
        */
        int kuohao_1 = 0, kuohao_2 = 0;
        int j = 0;
        int operator_1 = -1, operator_2 = -1;
        Integer[] operators = new Integer[2];
        Double[] nums = new Double[3];
        double result = 0.0;
        String str = args[0];
        for (int i = 0; i < str.length(); i++) {
            switch (args[0].charAt(i)) {
                case '(':
                    kuohao_1 = i;
                    break;
                case ')':
                    kuohao_2 = i;
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    operators[j] = i;
                    j++;
                    break;
            }
        }
        if (kuohao_2 == 0) {
            nums[0] = Double.parseDouble(args[0].substring(0, operators[0]));
            nums[1] = Double.parseDouble(args[0].substring(operators[0] + 1, operators[1]));
            nums[2] = Double.parseDouble(args[0].substring(operators[1] + 1, str.length()));
            if (args[0].charAt(operators[0]) == '+' || args[0].charAt(operators[0]) == '-'
                    && args[0].charAt(operators[1]) == '*' || args[0].charAt(operators[1]) == '/') {
                if (args[0].charAt(operators[1]) == '*')
                    result += nums[1] * nums[2];
                else
                    result += nums[1] / nums[2];
                if (args[0].charAt(operators[0]) == '+')
                    result += nums[0];
                else
                    result -= nums[0];
            } else if (args[0].charAt(operators[0]) == '*' || args[0].charAt(operators[0]) == '/') {
                if (args[0].charAt(operators[0]) == '*')
                    result += nums[0] * nums[1];
                else if (args[0].charAt(operators[0]) == '/')
                    result += nums[0] / nums[1];
                if (args[0].charAt(operators[1]) == '*')
                    result += nums[1] * nums[2];
                else if (args[0].charAt(operators[1]) == '/')
                    result += nums[1] / nums[2];
                else if (args[0].charAt(operators[1]) == '+')
                    result += nums[2];
                else
                    result -= nums[2];
            } else {
                if (args[0].charAt(operators[0]) == '+')
                    result += nums[0] + nums[1];
                else
                    result += nums[0] - nums[1];
                if (args[0].charAt(operators[1]) == '+')
                    result += nums[2];
                else
                    result -= nums[2];
            }
        } else {
            String kuohao = args[0].substring(kuohao_1, kuohao_2);
            for (int i = 0; i < kuohao.length(); i++) {
                if (kuohao.charAt(i) == '+' || kuohao.charAt(i) == '-' || kuohao.charAt(i) == '*' || kuohao.charAt(i) == '/') {
                    if (operator_1 == -1)
                        operator_1 = i;
                    else
                        operator_2 = i;
                }
            }
            if (operator_2 == -1) {
                nums[0] = Double.parseDouble(kuohao.substring(1, operator_1));
                nums[1] = Double.parseDouble(kuohao.substring(operator_1 + 1, kuohao.length()));
                if (kuohao.charAt(operator_1) == '*')
                    result += nums[0] * nums[1];
                else if (kuohao.charAt(operator_1) == '/')
                    result += nums[0] / nums[1];
                else if (kuohao.charAt(operator_1) == '+')
                    result += nums[0] + nums[1];
                else
                    result -= nums[0] - nums[1];
                if (kuohao_2 < operators[1]) {
                    nums[2] = Double.parseDouble(args[0].substring(operators[1] + 1, str.length()));
                    if (args[0].charAt(operators[1]) == '*')
                        result *= nums[2];
                    else if (args[0].charAt(operators[1]) == '/')
                        result /= nums[2];
                    else if (args[0].charAt(operators[1]) == '+')
                        result += nums[2];
                    else
                        result -= nums[2];
                } else if (kuohao_1 > operators[0]) {
                    nums[2] = Double.parseDouble(args[0].substring(0, operators[0]));
                    if (args[0].charAt(operators[0]) == '*')
                        result *= nums[2];
                    else if (args[0].charAt(operators[0]) == '/')
                        result = nums[2] / result;
                    else if (args[0].charAt(operators[0]) == '+')
                        result += nums[2];
                    else
                        result = nums[2] - result;
                }
            } else {
                nums[0] = Double.parseDouble(args[0].substring(1, operators[0]));
                nums[1] = Double.parseDouble(args[0].substring(operators[0] + 1, operators[1]));
                nums[2] = Double.parseDouble(args[0].substring(operators[1] + 1, str.length() - 1));
                if (args[0].charAt(operators[0]) == '+' || args[0].charAt(operators[0]) == '-'
                        && args[0].charAt(operators[1]) == '*' || args[0].charAt(operators[1]) == '/') {
                    if (args[0].charAt(operators[1]) == '*')
                        result += nums[1] * nums[2];
                    else
                        result += nums[1] / nums[2];
                    if (args[0].charAt(operators[0]) == '+')
                        result += nums[0];
                    else
                        result -= nums[0];
                } else if (args[0].charAt(operators[0]) == '*' || args[0].charAt(operators[0]) == '/') {
                    if (args[0].charAt(operators[0]) == '*')
                        result += nums[0] * nums[1];
                    else if (args[0].charAt(operators[0]) == '/')
                        result += nums[0] / nums[1];
                    if (args[0].charAt(operators[1]) == '*')
                        result += nums[1] * nums[2];
                    else if (args[0].charAt(operators[1]) == '/')
                        result += nums[1] / nums[2];
                    else if (args[0].charAt(operators[1]) == '+')
                        result += nums[2];
                    else
                        result -= nums[2];
                } else {
                    if (args[0].charAt(operators[0]) == '+')
                        result += nums[0] + nums[1];
                    else
                        result += nums[0] - nums[1];
                    if (args[0].charAt(operators[1]) == '+')
                        result += nums[2];
                    else
                        result -= nums[2];
                }
            }
        }
        System.out.printf("%.2f\n",result);
    }
}

    