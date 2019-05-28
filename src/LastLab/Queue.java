package LastLab;

import java.util.ArrayList;
import java.util.List;

public class Queue<E> {
    public Queue() {
    }
    
    private List<E> queue = new ArrayList<>();
    
    public void enqueue(E item) {
        queue.add(item);
    }
    
    public E dequeue() {
        E e = queue.get(0);
        queue.remove(0);
        return e;
    }
    
    public boolean hasItems() {
        return !queue.isEmpty();
    }
}
