package linear;

/**
 * 带头单向链表
 */
public class SingleLink {
    private Node head;
    private Node first;
    private Node last;
    private int length = 1;

    public SingleLink() {
        head = last = new Node(-1);

    }

    //添加节点
    public void addNode(Node node) {
        if (first == null)
            first = node;

        last.next = node;
        last = node;
        length++;
    }

    //插入节点
    public void insertNode(int index, Node node) {
        int i = 0;
        Node p = head;
        for (Node nd = head.next; nd != null; nd = nd.next) {
            if (i == index) {
                break;
            }
            p = nd;
            ++i;
        }
        node.next = p.next;
        p.next = node;
        if (i == length - 1) last = node;
    }

    //删除节点
    public void removeNode() {
        int i = 0;

        for (Node nd = head.next; nd != null; nd = nd.next) {
            if (i == length - 2) {
                nd.next = null;
                break;
            }
            i++;
        }
        length--;
    }

    //根据索引删除节点
    public void removeNode(int index) {
        int i = 0;
        Node p = head;
        for (Node nd = head.next; nd != null; nd = nd.next) {
            if (i == index) {
                p.next = nd.next;
                break;
            }
            p = nd;
            i++;
        }
        length--;
    }

    public Node getFirst() {
        return head.next;
    }

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
