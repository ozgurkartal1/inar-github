package src.week_10.live_class.example1;

public class StackOfIntegers {

    private int[] elements;
    private int size;

    public static final int CAPACITY_OF_DEFAULT = 16;

    public StackOfIntegers(){
        elements = new int[CAPACITY_OF_DEFAULT];
    }

    public StackOfIntegers(int capacity){
        if(capacity <= CAPACITY_OF_DEFAULT){
            elements = new int[capacity];
        }
    }

    public void push(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public boolean empty(){
        return  size == 0;
    }

    public int pop(){
        return elements[--size];
    }

    public int peek(){
        return elements[size - 1];
    }

    public int getSize(){
        return size;
    }

}


