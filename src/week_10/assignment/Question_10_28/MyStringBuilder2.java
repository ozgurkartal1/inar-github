package src.week_10.assignment.Question_10_28;

import src.week_10.assignment.Question_10_27.MyStringBuilder;

import java.util.Arrays;

public class MyStringBuilder2 {

    private char[] chars;
    private String s;

    public MyStringBuilder2(){

    }

    public MyStringBuilder2(char[] chars){
      this.chars = chars;
    }

    public MyStringBuilder2(String s){
        this.s = s;
    }

    public char[] getChars() {
        return chars;
    }

    public String getS() {
        return s;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public void setS(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){


        this.chars = copyArray(s, offset);

        String k = "";

        for (int i = 0; i < chars.length; i++) {
            k += chars[i];
        }

        s.setS(k);

        return new MyStringBuilder2(s.getS());
    }

    private char[] copyArray(MyStringBuilder2 s, int offset) {
        String k = s.getS();

        char[] array1 = getCharArray(this.s);
        char[] array2 = getCharArray(k);

        System.arraycopy(array2, 0, array1, offset, k.length());

        return array1;
    }

    private char[] getCharArray(String l) {
        char[] result = new char[100];
        for (int i = 0; i < l.length(); i++) {
            result[i] = l.charAt(i);
        }

        return result;
    }

}
