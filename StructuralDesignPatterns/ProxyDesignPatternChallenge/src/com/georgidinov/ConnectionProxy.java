package com.georgidinov;

class ConnectionProxy implements InternetConnection {

    private RealConnection realConnection;

    String[] connections = {
            "abv.bg",
            "gmail.com",
            "google.bg",
            "dir.bg"
    };

    @Override
    public void connect(String url) throws Exception {
        if (isLegit(url)) {
            this.realConnection = new RealConnection();
            realConnection.connect(url);
        } else {
            throw new Exception("Access Denied");
        }
    }//end of method connect

    private boolean isLegit(String url) {
        for (String connection : this.connections) {
            if (url.equals(connection)) {
                return true;
            }
        }
        return false;
    }//end of method isLegit

}//end of class ConnectionProxy
