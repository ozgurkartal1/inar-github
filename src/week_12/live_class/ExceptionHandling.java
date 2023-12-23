package src.week_12.live_class;

public class ExceptionHandling {

    public static void main(String[] args) {

        //try
        //catch
        //throw
        //throws
        //finally


        try{
            int a = Integer.parseInt("Cats");
        }

        catch (NumberFormatException nfe){
            System.out.println("Hey ! You can't make an in out of cats");
        }
    }
}
