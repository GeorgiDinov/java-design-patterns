package com.georgidinov;


interface Expression {

    String interpret(InterpreterContext ic);

}//end of interface Expression

class IntToBinaryExpression implements Expression {
    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(i);
    }

}//end of class IntToBinaryExpression

class IntToHexExpression implements Expression {
    private int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimal(i);
    }

}//end of class IntToHexExpression