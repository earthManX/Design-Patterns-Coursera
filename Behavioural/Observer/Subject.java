package Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    
    private List<Observer> observers = new ArrayList<>();

    public void registerObservers( Observer obv ){
        observers.add(obv);
    }

    public void unRegisterObservers( Observer obv ){
        if( observers.contains(obv)){
            observers.remove( obv );
        }
    }

    public void notifyObservers(){

        for( Observer obs : observers){
            obs.update();
        }
    }


}