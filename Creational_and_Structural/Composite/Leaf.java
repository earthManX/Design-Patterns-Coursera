package Creational_and_Structural.Composite;

import java.util.List;

public class Leaf implements ComponentInterface {

    // THis is a leaf class. It does not contain any nested leaf or composite classes.
    @Override
    public void sharedMethodOne() {
        // TODO Auto-generated method stub

    }

    @Override
    public String sharedMethodTwo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ComponentInterface> sharedThree() {
        // TODO Auto-generated method stub
        return null;
    }

}