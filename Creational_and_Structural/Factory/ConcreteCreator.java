package Creational_and_Structural.Factory;

// There can be many ConcreteCreators classes depending on number of subProducts we have.
// These classes create SubProduct objects.
public class ConcreteCreator extends Creator {

    protected Product factoryMethod() {
        Product subProduct = new SubProduct();
        return subProduct;
    }
    
}