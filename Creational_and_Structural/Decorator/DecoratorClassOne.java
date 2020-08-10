package Creational_and_Structural.Decorator;

public class DecoratorClassOne extends DecoratorAbstractClass{

    // This constructor is what is stacking the decorator objects
    // Basically these decorators constructors are using the constructors of abstract super class
    public DecoratorClassOne( ComponentInterface decoratedClass ){
        super( decoratedClass);
    }

    // This methods goes all the way to baseclass for executing
    // Links the calls all the ay to the bottom
    public void baseMethod(){
        super.baseMethod();
        // Custom functionality of this decorator
    }
}