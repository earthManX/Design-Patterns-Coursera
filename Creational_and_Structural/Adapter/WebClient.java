package Creational_and_Structural.Adapter;

public class WebClient {
    private TargetInterface tar ;

    public WebClient( TargetInterface inter ){
        this.tar = inter;
    }
    
    public String clientMethod( int integ ){

        String answer = tar.processRequest( integ );
        return answer;
    }
}