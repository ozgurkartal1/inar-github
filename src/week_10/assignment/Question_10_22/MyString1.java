package src.week_10.assignment.Question_10_22;

public class MyString1 {

    public char[] chars;
    public String s = "";

    public MyString1(char[] chars){
       this.chars = chars;

        for (char aChar : chars) {
            s += aChar;
        }

    }

    public String toString(){
        return s;
    }

    public char charAt(int index){
        return chars[index];
    }

    public int length(){
        return chars.length;
    }

    private char[] createCharArray(int length){
        return new char[length];
    }

    public MyString1 substring(int begin, int end){
        char[] tempChars = createCharArray(end - begin + 1);

        for (int i = 0; i < tempChars.length; i++) {
            tempChars[i] = chars[begin + i];
        }

        return new MyString1(tempChars);
    }

    public MyString1 toLowerCase(){
        char[] tempChar = createCharArray(chars.length);

        for (int i = 0; i < tempChar.length; i++) {
            tempChar[i] = (char)((int)chars[i] + 32);
        }

        return new MyString1(tempChar);
    }

    public boolean equals(MyString1 s){
        if(s.length() != chars.length){
            return false;
        }

        s = s.toLowerCase();
        this.s = this.s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != this.s.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public MyString1 valueOf(int i){
        int digits = calculateDigitsOfInteger(i);
        char[] temp = createCharArray(digits);

        for (int j = temp.length - 1; j >= 0; j--) {
            temp[j] = (char)('0' + (i % 10));
            i /= 10;
        }

        return new MyString1(temp);
    }

    private int calculateDigitsOfInteger(int i) {
        if(i == 0){
            return 1;
        }

        int result = 0;
        while (i != 0){
            i /= 10;
            result++;
        }

        return result;
    }


}
