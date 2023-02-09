package com.georgidinov;

interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();

}//end of interface FileSystemReceiver


class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening up a file on a Unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file on a Unix OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing up a file on a Unix OS");
    }

}//end of class UnixFileSystemReceiver

class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening up a file on a Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file on a Windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing up a file on a Windows OS");
    }

}//end of class WindowsFileSystemReceiver