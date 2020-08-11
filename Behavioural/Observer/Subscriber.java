package Behavioural.Observer;

public class Subscriber implements Observer{
    Blog blog ;
    String state;

    public void subscribeBlog( Blog b ){
        blog = b ;
        blog.registerObservers(this);
    }

    public void update(){
        state = blog.getState();
    }
}