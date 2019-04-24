package linear;

public class Main {

    public static void main(String[] args) {

        SingleLink singleLink = new SingleLink();
        SingleLink.Node n1 = new SingleLink.Node(2);
        singleLink.addNode(n1);
        SingleLink.Node n2 = new SingleLink.Node(5);
        singleLink.addNode(n2);
        SingleLink.Node n3 = new SingleLink.Node(3);
        singleLink.addNode(n3);
        SingleLink.Node n4 = new SingleLink.Node(8);
        singleLink.addNode(n4);

        singleLink.insertNode(5,new SingleLink.Node(12));
//        singleLink.addNode(new SingleLink.Node(10));

        SingleLink.Node first = singleLink.getFirst();
        for (SingleLink.Node node = first; node != null; node = node.next) {
            System.out.println(node.data);
        }
        System.out.println("-----------------------------");
        singleLink.removeNode(4);
        for (SingleLink.Node node = singleLink.getFirst(); node != null; node = node.next) {
            System.out.println(node.data);
        }

    }
}
