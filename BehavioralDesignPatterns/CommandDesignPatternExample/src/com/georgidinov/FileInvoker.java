package com.georgidinov;

class FileInvoker {
    private Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }//end of constructor

    public void execute() {
        this.command.execute();
    }//end of method execute

    public Command getCommand() {
        return command;
    }//end of method getCommand

}//end of class FileInvoker
