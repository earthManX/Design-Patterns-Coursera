package Creational_and_Structural.Decorator;

public class DecoratorClassTwo extends DecoratorAbstractClass{

    public DecoratorClassTwo( ComponentInterface decoratedClass ){
        super( decoratedClass);
    }

    public void baseMethod(){
        super.baseMethod();
        // Custom functionality of this decorator
    }
}