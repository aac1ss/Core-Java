import java.util.LinkedList;

class Meths<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enq(T item) {
        list.addLast(item);
        System.out.println("Enqueued: " + item);
    }

    public T deq() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return null;
        }
       
        T item = list.removeFirst();
        System.out.println("Successfully Removed: " + item);
        return item;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        System.out.println("Queue Items: " + list);
    }

    public int size() {
        return list.size();
    }
}