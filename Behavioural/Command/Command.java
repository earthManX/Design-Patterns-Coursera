package Behavioural.Command;

public interface Command {
    public void execute();
    public void unExecute();
    public boolean isReversible();
}