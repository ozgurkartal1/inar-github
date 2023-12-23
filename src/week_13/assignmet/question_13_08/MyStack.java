package week_13.assignmet.question_13_08;

import java.util.ArrayList;

public class MyStack implements Cloneable{

    private ArrayList<Object> list = new ArrayList<>();

    MyStack(){

    }

    public ArrayList<Object> getList() {
        return list;
    }

    public void setList(ArrayList<Object> list) {
        this.list = list;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    public Object pop(){
        if(isEmpty()){
            return null;
        }
        Object o = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return o;
    }

    public void push(Object o){
        list.add(o);
    }

    public String toString(){
        return "stack : " + list.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       MyStack myStackClone = (MyStack)super.clone();
       myStackClone.setList((ArrayList<Object>)(list.clone()));
       return myStackClone;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
