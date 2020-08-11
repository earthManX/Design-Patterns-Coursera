package MVC;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class View implements PropertyChangeListener {

    private String someProperty;
    private Controller controller ; 
    
    // Constructor
    public View( String initialProperty , Controller cltr){
        this.someProperty = initialProperty;
        controller = cltr;
    }
    
    // This sets the observer behaviour
    public void propertyChange(PropertyChangeEvent event ) {
        this.setSomeProperty( (String) event.getNewValue());
    }

    public void setSomeProperty( String set ){
        someProperty = set;
    }
    
    // Making changes in model through UI( View )
    public void someViewAction(){
        controller.
    }
}