package Creational_and_Structural.Adapter;

public class AdapterClass implements TargetInterface {
    
    ExternalAdaptee adaptee;

    public AdapterClass( ExternalAdaptee asap ){
        this.adaptee = asap;
    }

    @Override
    public String processRequest( int abc ){

        Long def = Integer.toUnsignedLong(abc);
        String str  = adaptee.processStuff( def );
        return str;

    }
}