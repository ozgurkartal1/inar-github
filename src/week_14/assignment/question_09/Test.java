package week_14.assignment.question_09;


import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.push(2);
        queue.push(6);
        queue.push(7);
        queue.push(12);
        queue.push(24);
        queue.push(45);

        System.out.println(queue.getList());
        System.out.println(queue.pop());
        System.out.println(queue.getList());
        System.out.println(queue.peek());
        System.out.println(queue.getList());
        System.out.println(queue.isEmpty());

        while (!queue.isEmpty()){
            System.out.println(queue.pop());
        }

        System.out.println(queue.isEmpty());

    }
}
