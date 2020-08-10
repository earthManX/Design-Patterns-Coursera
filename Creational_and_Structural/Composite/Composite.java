package Creational_and_Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements ComponentInterface {

    // This is a composite class, so it can have more composite or leaf classes.
    private List<ComponentInterface> list;

    public Composite(){
        list = new ArrayList<>();
    }
    
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
        return list;
    }

    public void addComponent( ComponentInterface component ){
        list.add(component);
    }
    
}