package week_04.live_class;

public class MyString {

    public static void main(String[] args) {

        String name = "Inar Academy";
        int lengthOfString = name.length();
        System.out.printf("The character length of %s is %d\n",name, lengthOfString);
        int thirdLetterOfName = name.charAt(6);
        System.out.println(thirdLetterOfName);

        System.out.println(name.indexOf('c'));
        System.out.println(name.lastIndexOf('a'));

        System.out.println("Uppercase : " + name.toUpperCase());
        System.out.println("Lowercase : " + name.toLowerCase());

        String s1 = "I love ";
        String s2 = s1.concat(name);

        System.out.println("The new string is : " + s2);

        System.out.println("Original : " + name + "\n length is " + name.length());
        System.out.println("Trimmed : " + name.trim() + "\n length is " + name.trim().length());



    }
}
