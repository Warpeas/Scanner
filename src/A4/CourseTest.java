package A4;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Course> satisfyCourse = new ArrayList<>();
        System.out.println("Would you like to create some courses: yes of no ?");
        String yn = in.nextLine().trim();
        String name, grade, teacher;
        int credit = 0, No = 0, flag = 0, index = -1;
        
        while (yn.equalsIgnoreCase("yes")) {
            
            System.out.println("Please input the course name:");
            name = in.nextLine();
            
            System.out.println("Please input the course credit:");
            while (in.hasNextLine()) {
                if (in.hasNextInt()) {
                    if ((credit = in.nextInt()) >= 0) {
                        in.nextLine();
                        break;
                    } else
                        System.out.println("Not valid input, please input again:");
                } else {
                    System.out.println("Not valid input, please input again:");
                }
                in.nextLine();
            }
            
            System.out.println("Please input the course grade:");
            grade = in.nextLine().trim();
            
            System.out.println("Please input the course teacher:");
            teacher = in.nextLine();
            
            courses.add(new Course(name, credit, grade, teacher));
            System.out.println("Would you like to create some courses: yes or no ?");
            yn = in.nextLine().trim();
        }
        if (courses.size() == 0) {
            System.out.println("There is no course in the system, system close.");
            System.exit(0);
        }
        System.out.println("Would you like to obtain course information: yes or no?");
        yn = in.nextLine().trim();
        
        while (yn.equalsIgnoreCase("yes")) {
            
            if (courses.size() == 1) {
                System.out.println("There is only 1 course in the system, you have no right to pick.");
                No = 0;
            } else {
                System.out.printf("There are %d courses in the system, please pick No.", courses.size());
                while (in.hasNextLine()) {
                    if (in.hasNextInt()) {
                        if ((No = in.nextInt()) >= 0 && No < courses.size()) {
                            in.nextLine();
                            break;
                        } else
                            System.out.printf("Not valid input, please input again:\nThere are %d courses in the system, please pick No.", courses.size());
                    } else {
                        System.out.printf("Not valid input, please input again:\nThere are %d courses in the system, please pick No.", courses.size());
                    }
                    in.nextLine();
                }
            }
            
            System.out.printf("The course level is: %s\nIs this course wit lab? %b\n", courses.get(No).getCourseLevel(), courses.get(No).isWithLab());
            
            System.out.println("Please enter your grade:");
            grade = in.nextLine().trim();
            
            System.out.printf("The result for your qualification to enroll in the course is: %s\n", courses.get(No).getQualificationForCourse(grade));
            
            System.out.println("Input a course credit:");
            while (in.hasNextLine()) {
                if (in.hasNextInt()) {
                    credit = in.nextInt();
                    if (credit >= 0) {
                        in.nextLine();
                        break;
                    } else
                        System.out.println("Not valid input, please input again:");
                } else {
                    System.out.println("Not valid input, please input again:");
                }
                in.nextLine();
            }
            
            for (int i = 0; i < courses.size(); i++) {
                if (courses.get(i).getCredit() == credit)
                    flag++;
            }
            
            if (flag >= 1) {
                if (credit == 1) {
                    if (flag == 1)
                        System.out.printf("The course with %d credit is ", credit);
                    else
                        System.out.printf("The courses with %d credit are ", credit);
                } else if (credit > 1) {
                    if (flag == 1)
                        System.out.printf("The course with %d credits is ", credit);
                    else
                        System.out.printf("The courses with %d credits are ", credit);
                }
                for (int i = 0; i < courses.size(); i++) {
                    if (courses.get(i).getCredit() == credit)
                        satisfyCourse.add(courses.get(i));
                }
                System.out.println(satisfyCourse);
            } else if (credit == 1)
                System.out.printf("There is no course with %d credit\n", credit);
            else
                System.out.printf("There is no course with %d credits\n", credit);
            
            System.out.println("Input a teacher's name:");
            teacher = in.nextLine();
            satisfyCourse.clear();
            
            for (int i = 0; i < courses.size(); i++) {
                if (courses.get(i).getTeacher().toLowerCase().contains(teacher.toLowerCase()))
                    satisfyCourse.add(courses.get(i));
            }
            if (satisfyCourse.size() == 0)
                System.out.printf("There is no course taught by %s in the system\n", teacher);
            else
                System.out.printf("The courses taught by %s are %s\n", teacher, satisfyCourse);
            
            System.out.println("Would you like to obtain course information: yes or no?");
            yn = in.nextLine().trim();
        }
        
        System.out.println("Would you like to obtain course information after removing certain courses: yes or no ?");
        yn = in.nextLine().trim();
        
        while (yn.equalsIgnoreCase("yes")) {
            if (courses.size() == 1) {
                System.out.println("There have just one course in the system, you have no right to pick.\nThere is no remaining course");
                break;
            } else {
                System.out.println("Please pick the index of the course you want to remove:");
                while (in.hasNextLine()) {
                    if (in.hasNextInt()) {
                        if ((index = in.nextInt()) >= 0 && index < courses.size()) {
                            in.nextLine();
                            break;
                        } else
                            System.out.println("Not valid input, please input again:");
                    } else {
                        System.out.println("Not valid input, please input again:");
                    }
                    in.nextLine();
                }
//            if (index >= 0 && index < courses.size())
                courses.remove(index);
//            else
//                System.out.println("The index you input is not valid");
//                if (courses.size() == 0) {
//                    System.out.println("There is no remaining course");
//                    break;
//                } else
                System.out.printf("The remaining courses are %s\n", courses);
                System.out.println("Would you like to obtain course information after removing certain courses: yes or no ?");
                yn = in.nextLine().trim();
            }
        }
    }
}
