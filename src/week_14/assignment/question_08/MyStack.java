package week_14.assignment.question_08;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> list;

    private Queue<Integer> temp;

    MyStack(){
        list = new LinkedList<>();
        temp = new LinkedList<>();
    }

    public Queue<Integer> getList() {
        return list;
    }

    public void setList(Queue<Integer> list) {
        this.list = list;
    }

    public Queue<Integer> getTemp() {
        return temp;
    }

    public void setTemp(Queue<Integer> temp) {
        this.temp = temp;
    }

    public void push(int x){
        list.add(x);
    }

    public int pop(){
        while (list.size() != 1){
            temp.add(list.remove());
        }

        int number = list.peek();
        list.remove();

        while (!temp.isEmpty()){
            list.add(temp.remove());
        }

        return number;
    }

    public int top(){
        while (list.size() != 1){
            temp.add(list.remove());
        }

        int number = list.peek();
        temp.add(list.remove());

        while (!temp.isEmpty()){
            list.add(temp.remove());
        }

        return number;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for(Integer i : list){
            s.append(i).append(" ");
        }

        return s.toString();
    }




}
