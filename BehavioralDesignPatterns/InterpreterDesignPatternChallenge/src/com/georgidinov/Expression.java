package com.georgidinov;

interface Expression {
    boolean interpret(InterpreterContext context);
}//end of interface Expression


class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }//end of constructor


    @Override
    public boolean interpret(InterpreterContext context) {
        return context.getResult(data);
    }//end of method interpret

}//end of class TerminalExpression


class ANDNonTerminalExpression implements Expression {

    private Expression expressionOne;
    private Expression expressionTwo;

    public ANDNonTerminalExpression(Expression expressionOne,
                                    Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }//end of constructor

    @Override
    public boolean interpret(InterpreterContext context) {
        return expressionOne.interpret(context) && expressionTwo.interpret(context);
    }//end of method  interpret

}//end of class ANDNonTerminalExpression


class ORNonTerminalExpression implements Expression {
    private Expression expressionOne;
    private Expression expressionTwo;

    public ORNonTerminalExpression(Expression expressionOne,
                                   Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }//end of constructor

    @Override
    public boolean interpret(InterpreterContext context) {
        return expressionOne.interpret(context) || expressionTwo.interpret(context);
    }//end of method interpret

}//end of class ORNonTerminalExpression






