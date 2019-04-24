package linear;

/**
 * 数组实现栈
 */
public class ArrayStack {
    private String[] stack;
    private int stackLength;
    private int count;

    public ArrayStack(int n) {
        stack = new String[n];
        this.stackLength = n;
    }

    public boolean push(String item) {
        if (count == stackLength) return false;
        stack[count] = item;
        count++;
        return true;
    }

    public boolean pop() {
        if (count <= 0) return false;
        --count;
        return true;
    }

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < count; i++) {
            s = s+stack[i]+",";
        }
        s = s+"]";
        return s;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        System.out.println(stack.toString());
        stack.push("a1");
        stack.push("a2");
        stack.push("a3");
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
    }
}
