package MVC;

public class Controller {
    
    ModelMVC model;
    View view;

    public Controller( ModelMVC mvc , View vi ){
        this.model = mvc;
        this.view = vi;
    }

    // Making changes to model 
    public void  changeModelProperty( String property ){
        model.changeProperty(property);
    }
}