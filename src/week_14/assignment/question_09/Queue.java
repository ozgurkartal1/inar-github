package week_14.assignment.question_09;

import java.util.Stack;

public class Queue {

    private Stack<Integer> list;
    private Stack<Integer> temp;

    Queue(){
        list = new Stack<>();
        temp = new Stack<>();
    }

    public Stack<Integer> getList() {
        return list;
    }

    public void setList(Stack<Integer> list) {
        this.list = list;
    }

    public Stack<Integer> getTemp() {
        return temp;
    }

    public void setTemp(Stack<Integer> temp) {
        this.temp = temp;
    }

    public void push(int x){
        list.push(x);
    }

    public int pop(){
        while (list.size() != 1){
            temp.add(list.pop());
        }

        int number = list.pop();

        while (!temp.isEmpty()){
            list.add(temp.pop());
        }

        return number;
    }

    public int peek(){
        while (list.size() != 1){
            temp.add(list.pop());
        }

        int number = list.peek();

        while (!temp.isEmpty()){
            list.add(temp.pop());
        }

        return number;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
