package com.georgidinov;

public class PasswordReminder {
    private DBConnectIonInterface dbConnection;

    public PasswordReminder(DBConnectIonInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}
