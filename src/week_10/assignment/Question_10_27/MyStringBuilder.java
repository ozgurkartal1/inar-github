package src.week_10.assignment.Question_10_27;

public class MyStringBuilder {
    private String s;

    public MyStringBuilder(String s){
        this.s = s;
    }

    public MyStringBuilder append(MyStringBuilder s){
        return new MyStringBuilder(this.s + s);
    }

    public MyStringBuilder append(int i){
        return new MyStringBuilder(s + i);
    }

    public int length(){
        return s.length();
    }

    public char charAt(int index){
        return s.charAt(index);
    }

    public MyStringBuilder toLowerCase(){
        char[] chars = getCharArray();
        String s = "";

        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i])){
                chars[i] = (char) (chars[i] + 32);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }

        return new MyStringBuilder(s);
    }

    private char[] getCharArray() {
        char[] result = new char[s.length()];

        for (int i = 0; i < result.length; i++) {
            result[i] = s.charAt(i);
        }

        return result;
    }

    public MyStringBuilder substring(int begin, int end){
        String s = "";

        for (int i = begin; i < end; i++) {
            s += this.s.charAt(i);
        }

        return new MyStringBuilder(s);
    }

    public String toString(){
        return s;
    }
}
