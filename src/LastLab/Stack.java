package LastLab;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    List<T>stack = new ArrayList<>();
    public void push(T t){
        stack.add(t);
    }
    public T pop(){
        T t = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return t;
    }
    public boolean hasItems(){
        return !stack.isEmpty();
    }
}
