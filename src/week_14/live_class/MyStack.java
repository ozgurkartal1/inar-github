package week_14.live_class;

import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();

        myStack.add(12);
        myStack.add(45);
        myStack.add(54);
        myStack.add(49);
        myStack.add(55);
        myStack.add(0);

        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());


        System.out.println(myStack.empty());

    }
}
