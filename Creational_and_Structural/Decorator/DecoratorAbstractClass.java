package Creational_and_Structural.Decorator;


public abstract class DecoratorAbstractClass implements ComponentInterface{
    
    //We will stack decorators on this
    protected ComponentInterface componentInterface ;

    //Constructor
    // Using this we will be stacking behaviour
    // First one should be base class
    public DecoratorAbstractClass( ComponentInterface comInt ){
        this.componentInterface = comInt;
    }

    public void baseMethod(){
        this.componentInterface.baseMethod();
    }
}