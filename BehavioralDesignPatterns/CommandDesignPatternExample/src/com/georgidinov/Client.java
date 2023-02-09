package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        //create the receiver
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //create the command with the associate receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //creating the invoker and associate with the command
        FileInvoker file = new FileInvoker(openFileCommand);

        //perform action on the invoker object
        file.execute();

        //write file command
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        //close file command
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();


    }//end of main method

}//end of class Client
