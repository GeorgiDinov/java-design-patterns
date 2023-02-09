package com.georgidinov;

interface MyVisitor {

    void visit(Book book);

    void visit(CD cd);

    void visit(DVD dvd);

}//end of interface MyVisitor
