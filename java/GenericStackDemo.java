import java.util.ArrayList;

class stack<T> {
    private ArrayList<T> stackList = new ArrayList<>();

    public void push(T element) {
        stackList.add(element);
        System.out.println(element + " pushed to stack");
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;
        }
        return stackList.remove(stackList.size() - 1);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public void display() {
        System.out.println("Stack elements: " + stackList);
    }
}
public class GenericStackDemo {
    public static void main(String[] args) {
        stack<Integer> intStack = new stack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.display();
        System.out.println("Popped element: " + intStack.pop());
        intStack.display();

        stack<String> stringStack = new stack<>();
        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.display();
        System.out.println("Popped element: " + stringStack.pop());
        stringStack.display();
    }
}
