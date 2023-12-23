package week_14.assignment.question_08;



import java.util.*;

public class Test {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(7);
        myStack.push(10);

        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.top());
        System.out.println(myStack);
        System.out.println(myStack.isEmpty());
    }
}
