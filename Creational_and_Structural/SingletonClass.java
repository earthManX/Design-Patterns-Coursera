package Creational_and_Structural;

public class SingletonClass{

    private static SingletonClass singletonClass = null ;

    // Make the constructor private so that no one can instantiate new instance form outside
    private SingletonClass(){
        //blah
    }

// Lazy creation - Object is not created unitl it is really required
    public static SingletonClass getInstance(){
        if( singletonClass == null ){
            singletonClass = new SingletonClass();
        }

        return singletonClass;
    }
}