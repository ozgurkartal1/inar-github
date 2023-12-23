package week_14.assignment.question_20;

public class Question_20 {

    public static void main(String[] args) {

        Post post1 = new Post();
        Post post2 = new Post();

        post1.addATag("Java");
        post1.addATag("Coding");
        post1.addATag("Programming");

        post2.addATag("Java");
        post2.addATag("Technology");
        post2.addATag("Coding");

        System.out.println("Tags for post1 : " + post1);
        System.out.println("Tags for post2 : " + post2);

        System.out.println("Does post1 have the tag 'Java' ? " +
                post1.check("Java"));

        System.out.println("Does post1 have the tag 'Technology' ? " +
                post2.check("Technology"));

        post1.remove("Programming");

        System.out.println("Tags for post1 : " + post1);

    }
}
