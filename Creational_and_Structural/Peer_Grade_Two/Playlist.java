package Creational_and_Structural.Peer_Grade_Two;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IComponent {

private List<IComponent> playlist ;
private String playListName;

    // Constructor 
    public Playlist( String name ){
        playlist = new ArrayList<>();
        playListName = name ; 
    }

    @Override
    public void play() {
        // Some code 
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        // Some code 
    }

    @Override
    public String getName() {
        return playListName;
    }

    public void add( IComponent component ){
        // Check if the component is type Song or not 
        if( component instanceof Song){
            playlist.add( component );
        }
    }

    public void remove( IComponent component){
        if( playlist.contains(component)){
            playlist.remove(component);
        }
    }
    
}