package Creational_and_Structural.Factory;

public abstract class Creator {
    
    protected void generalMethod(){
        // Some method common to all subclasses
    }

    // This method is to be defined by all subclasses
    // Object creation (factory) will happen in this method
    protected abstract Product factoryMethod();

}