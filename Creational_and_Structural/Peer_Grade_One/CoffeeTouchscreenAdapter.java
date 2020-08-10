package Creational_and_Structural.Peer_Grade_One;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    OldCoffeeMachine ocm; 

    public CoffeeTouchscreenAdapter( OldCoffeeMachine old ){
        this.ocm = old;
    }

    @Override 
    public void chooseFirstSelection(){
        ocm.selectA();
    }

    @Override 
    public void chooseSecondSelection(){
        ocm.selectB();
    }
}