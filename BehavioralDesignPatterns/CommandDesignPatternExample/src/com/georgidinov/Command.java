package com.georgidinov;

interface Command {
    void execute();
    //could add undo or redo methods for undo/redo previous commands
}//end of interface Command


class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;
    //store previous state for undo, String someState

    public OpenFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }//end of constructor

    @Override
    public void execute() {
        //save previous state in case undo/redo is called
        this.fileSystem.openFile();
    }//end of method execute

    public void undo() {
        //restore previous state
        //memberVariable = previousState;
    }//end of method undo

}//end of class OpenFileCommand

class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;
    //store previous state for undo, String someState

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }//end of constructor

    @Override
    public void execute() {
        //save previous state in case undo/redo is called
        this.fileSystem.closeFile();
    }//end of method execute

    public void undo() {
        //restore previous state
        //memberVariable = previousState;
    }//end of method undo

}//end of class CloseFileCommand


class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystem;
    //store previous state for undo, String someState

    public WriteFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }//end of constructor

    @Override
    public void execute() {
        //save previous state in case undo/redo is called
        this.fileSystem.writeFile();
    }//end of method execute

    public void undo() {
        //restore previous state
        //memberVariable = previousState;
    }//end of method undo

}//end of class WriteFileCommand