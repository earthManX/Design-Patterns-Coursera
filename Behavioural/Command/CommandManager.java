package Behavioural.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    
    private static CommandManager manager = new CommandManager();
    
    private List<Command> commandHistoryList = new ArrayList<>();
    private List<Command> commandRedoList = new ArrayList<>();

    public void invokeCommand( Command com ){
        commandHistoryList.add(com);
    }

    public void undoCommand( ){
        commandRedoList.add( commandHistoryList.get( commandHistoryList.size() - 1 ));
    }

    public static CommandManager getInstance(){
        return manager;
    }
}