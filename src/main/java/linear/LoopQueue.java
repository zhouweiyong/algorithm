package linear;

/**
 * 数组实现循环队列
 */
public class LoopQueue {
    private String[] queue;
    private int head;
    private int tail;
    private int capacity;

    public LoopQueue(int capacity) {
        queue = new String[capacity];
        this.capacity = capacity;
    }

    public boolean enqueue(String item) {
        if (tail - head == capacity - 1) return false;
        queue[tail % capacity] = item;
        tail++;
        return true;
    }

    public String dequeue() {
        if (head == tail) return null;
        String s = queue[head % capacity];
        head++;
        return s;
    }

    public static void main(String[] args) {
        LoopQueue queue = new LoopQueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.enqueue("content1"));
        System.out.println(queue.enqueue("content2"));
        System.out.println(queue.enqueue("content3"));
        System.out.println(queue.enqueue("content4"));
        System.out.println(queue.enqueue("content5"));
        System.out.println(queue.enqueue("content6"));
        System.out.println("------------------------------------------");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("------------------------------------------");

        System.out.println(queue.enqueue("content1"));
        System.out.println(queue.enqueue("content2"));
        System.out.println(queue.enqueue("content3"));
        System.out.println(queue.enqueue("content4"));
        System.out.println(queue.enqueue("content5"));
        System.out.println(queue.enqueue("content6"));
        System.out.println("------------------------------------------");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
