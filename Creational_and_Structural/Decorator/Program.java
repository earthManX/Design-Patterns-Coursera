package Creational_and_Structural.Decorator;

public class Program {
    
    public static void main( String args[]){

        ComponentInterface componentInterface = new BaseConcreteClass();

        // Add decorators
        componentInterface = new DecoratorClassOne(componentInterface);
        componentInterface = new DecoratorClassTwo(componentInterface);

        componentInterface.baseMethod();
    }
}