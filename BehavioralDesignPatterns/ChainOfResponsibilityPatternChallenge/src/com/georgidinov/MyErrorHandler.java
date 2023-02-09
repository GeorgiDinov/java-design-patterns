package com.georgidinov;

interface MyErrorHandler {

    void setNextInChain(MyErrorHandler errorHandler);

    boolean processMessage(Message message);

}//end of interface MyErrorHandler


class EmailErrorHandler implements MyErrorHandler {
    private MyErrorHandler errorHandler;

    @Override
    public void setNextInChain(MyErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }//end of method setNextInChain

    @Override
    public boolean processMessage(Message message) {
        if (message.getText().contains("Email")) {
            System.out.println(this.getClass().getSimpleName() +
                    " processed " + message.getErrorPriority() + " issue: " +
                    message.getText());
            return true;
        } else {
            if (this.errorHandler != null) {
                return this.errorHandler.processMessage(message);
            }
        }
        return false;
    }//end of method processMessage

}//end of class EmailErrorHandler


//first in the chain
class FaxErrorHandler implements MyErrorHandler {

    private MyErrorHandler errorHandler;

    @Override
    public void setNextInChain(MyErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }//end of method setNextInChain

    @Override
    public boolean processMessage(Message message) {
        if (message.getText().contains("Fax")) {
            System.out.println(this.getClass().getSimpleName() +
                    " processed " + message.getErrorPriority() + " issue: " +
                    message.getText());
            return true;
        } else if (errorHandler != null) {
            return this.errorHandler.processMessage(message);
        }
        return false;
    }//end of method processMessage

}//end of class FaxErrorHandler