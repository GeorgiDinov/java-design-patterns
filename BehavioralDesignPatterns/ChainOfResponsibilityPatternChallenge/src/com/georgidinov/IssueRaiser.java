package com.georgidinov;

class IssueRaiser {

    private MyErrorHandler errorHandler;

    public IssueRaiser(MyErrorHandler handler) {
        this.errorHandler = handler;
    }//end of constructor

    public void raiseMessage(Message message) {
        if (this.errorHandler != null) {
            this.errorHandler.processMessage(message);
        }
    }//end of method raiseMessage

}//end fo class IssueRaiser
