package Behavioural.Peer_Grade;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    
    private String channelName;
    private String status;
    private List<Observer> obsList = new ArrayList<>(); 
    private String update = "Update";

    public Channel( String chName , String initialStatus ){
        this.channelName = chName;
        this.status = initialStatus;
    }

    public void registerObserver( Observer obs){
        obsList.add(obs);
    
    }

    public void unregisterObserver( Observer obs ){
        if( obsList.contains(obs)){
            obsList.remove(obs);
        }
    }

    public void notifyObservers( ){
        for( Observer b : obsList ){
            b.update( update );
        }
    }

    public String getStatus(){
        return status;
    }

    public void setStatus( String newStatus){
        status = newStatus;
    }
}