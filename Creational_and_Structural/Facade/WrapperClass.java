package Creational_and_Structural.Facade;

// Client only interacts with this Facade wrapper class 

public class WrapperClass{

    InterfaceClass inf = null;

    // Client interaction
    public void clientMethod( int param ){
        if( param == 1 ){
            inf = new SubSystemClassOne();
            inf.methodOne();
        }else if( param == 2 ){
            inf = new SubSystemClassTwo();
            inf.methodTwo();

        }
    }
    
}