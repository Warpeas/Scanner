package LastLab;

public class Test {
    public static void main(String[] args) {
        Queue<Student>studentQueue = new Queue<>();
        studentQueue.enqueue(new Student("Harry Potter","MALE"));
        studentQueue.enqueue(new Student("Ron Weasley","MALE"));
        studentQueue.enqueue(new Student("Hermione Granger","FEMALE"));
        while (studentQueue.hasItems()){
            System.out.println(studentQueue.dequeue());
        }
        Stack<Student>studentStack = new Stack<>();
        studentStack.push(new Student("Harry Potter","MALE"));
        studentStack.push(new Student("Ron Weasley","MALE"));
        studentStack.push(new Student("Hermione Granger","FEMALE"));
        while (studentStack.hasItems()){
            System.out.println(studentStack.pop());
        }
    }
}
