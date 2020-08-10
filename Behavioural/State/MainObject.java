package Behavioural.State;

// This main object class is also called as COntext class. THis 
// is the class which has all these states.
public class MainObject{

    State idle;
    State active;
    
    State currentState ;

    public MainObject( int condition ){
        idle = new IdleState();
        active = new ActiveState();

        //Based on some condition, assign currentState
        currentState = idle;
    }

    public void setState( State state ){
        currentState = state;
    }

    public void actionA(){
        currentState.actionA( this );
    }

    public void actionB(){
        currentState.actionB( this );
    }


}