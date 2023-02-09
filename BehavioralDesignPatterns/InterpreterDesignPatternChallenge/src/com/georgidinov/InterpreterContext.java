package com.georgidinov;

class InterpreterContext {

    private String data;

    public InterpreterContext(String input) {
        this.data = input;
    }//enb of constructor

    public boolean getResult(String input) {
        return this.data.contains(input);
    }//end of method getResult

}//end of class InterpreterContext
