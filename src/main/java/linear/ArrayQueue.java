package linear;

/**
 * 数组实现队列
 */
public class ArrayQueue {
    private String[] queue;
    private int capacity;
    private int head;
    private int tail;

    public ArrayQueue(int capacity) {
        queue = new String[capacity];
        this.capacity = capacity;
    }

    //入队
    public boolean enqueue(String item) {
        if (tail == capacity) {//队列满后
            for (int i = 0; i < tail - head; i++) {
                queue[i] = queue[head + i];
            }
            tail = tail - head;
            head = 0;
        }
        if (tail == capacity) return false;
        queue[tail] = item;
        tail++;
        return true;
    }

    //出队
    public String dequeue() {
        if (head == tail) return null;
        String s = queue[head];
        head++;
        return s;
    }


    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        String s1 = queue.dequeue();
        System.out.println(s1);
        queue.enqueue("java");
        queue.enqueue("C++");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue("VUE");
        queue.enqueue("REACT");
        queue.enqueue("AUGLAR");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue("HTML");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue("VUE");
        queue.enqueue("REACT");
        queue.enqueue("AUGLAR");
        queue.enqueue("REACT");
        queue.enqueue("AUGLAR");
        System.out.println(queue.dequeue());
        queue.enqueue("AUGLAR");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
