package com.georgidinov;

public class Client {

    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();
        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set Of Data: \nMyra\nLucy\n");

        System.out.println(fileWriter+"\n\n");

        //lets save the file
        caretaker.save(fileWriter);

        //now we can write something else
        fileWriter.write("Second Set Of Data: \nJason\n");

        //checking file content
        System.out.println(fileWriter+"\n\n");

        //lets undo to the last state
        caretaker.undo(fileWriter);
        System.out.println(fileWriter+"\n\n");

    }//end of main method

}//end of class Client
