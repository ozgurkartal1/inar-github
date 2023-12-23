package week_14.assignment.question_20;

import java.util.HashSet;
import java.util.Set;

public class Post {

    private Set<String> post;

    public Post(){
        post = new HashSet<>();
    }

    public Set<String> getPost() {
        return post;
    }

    public void setPost(Set<String> post) {
        this.post = post;
    }

    public void addATag(String s){
        post.add(s);
    }

    public void remove(String s){
        post.remove(s);
    }

    public boolean check(String s){
        return post.contains(s);
    }

    public String toString(){
       return post.toString();
    }
}
