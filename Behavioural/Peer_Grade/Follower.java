package Behavioural.Peer_Grade;

public class Follower implements Observer {

    private String followerName;
    private String status;
    
    Channel channel; 
    
    public Follower(String name ){
        this.followerName = name ;
    }

    public void update(String up) {
        status = channel.getStatus();
    }

    public void play(){
        // Some implementation
    }
    
    public void subscribeToChannel( Channel ch ){
        channel = ch;
        channel.registerObserver( this );
    }
}