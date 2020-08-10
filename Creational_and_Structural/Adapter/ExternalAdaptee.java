package Creational_and_Structural.Adapter;

public class ExternalAdaptee {
    
    public String processStuff( Long def ){
       
        String abc = Long.toString(def);
        return abc;
        
    }
}