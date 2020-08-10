package Creational_and_Structural.Peer_Grade_Two;

public class Song implements IComponent{
    private String songName ;
    private String artist;
    private float speed = 1.0f; 

    public Song( String name , String art ){
        this.artist = art;
        this.songName = name ; 
    }

    @Override
    public void play() {
       // SOme code
    }

    @Override
    public void setPlaybackSpeed(float sp) {
       speed = sp;
    }

    @Override
    public String getName() {
        return songName;
    }
    
    public String getArtist(){
        return artist;
    }

    public float getSpeed(){
        return speed;
    }
}