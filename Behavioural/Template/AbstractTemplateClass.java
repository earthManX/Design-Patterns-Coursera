package Behavioural.Template;

public abstract class AbstractTemplateClass{
    
    // Algorithm method
    public final void tempalteMethod(){

        commonMethod();
        // More commomn  methods
        specialisedMethodAlpha();
        specialisedMethodBeta();
    }

    public void commonMethod(){
        System.out.println("This method is used in general algorithm");
    }

    protected abstract void specialisedMethodAlpha();
    protected abstract void specialisedMethodBeta();
}