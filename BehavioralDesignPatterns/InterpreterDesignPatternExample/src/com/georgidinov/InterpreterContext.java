package com.georgidinov;

class InterpreterContext {

    public String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimal(int i) {
        return Integer.toHexString(i);
    }


}//end of class InterpreterContext
