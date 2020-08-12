package MVC;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ModelMVC {
    // Various properties handled by Model
    private String property;

    private PropertyChangeSupport support;
    
    public ModelMVC(){
        support = new PropertyChangeSupport(this);
        property = " Property : ";
    }

    public void addPropertyListeners( PropertyChangeListener listener ){
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener( PropertyChangeListener listener ){
        support.removePropertyChangeListener(listener);
    }
    
    public void changeProperty( String newProperty ){
        // This basically launches a property change event ( setChanged() in depracated Observable)
        // It will go on notify the listeners
        support.firePropertyChange("property", this.property
            , property + " " +  newProperty);

        property = property + " " +  newProperty;

    }
    
}