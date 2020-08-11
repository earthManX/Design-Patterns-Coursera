package Behavioural.Command;

public class Invoker {
    
    public CommandManager cM = CommandManager.getInstance();
    
    // Invoker will receive commands and their details. It will create the command objects
    // based on that and create the actual command.
    // Then based on some condition being true, it'll execute it using the command manager.
    Command command = new SomeCOmmand();

    public void invokeMethods(){
        cM.invokeCommand(command);
    }
    
    
}