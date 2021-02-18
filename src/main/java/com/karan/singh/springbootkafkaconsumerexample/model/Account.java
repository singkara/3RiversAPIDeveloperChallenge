package com.karan.singh.springbootkafkaconsumerexample.model;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    String accountNumber;
    Timestamp lastUpdateTimestamp;
    Double balance;

    public Account() {

    }

    public Account(String accountNumber, String lastUpdateTimestamp, Double balance) {
        this.accountNumber = accountNumber;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        Date parsedDate = null;
        try {
            parsedDate = dateFormat.parse(lastUpdateTimestamp);
            Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
            this.lastUpdateTimestamp = timestamp;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.balance = balance;
    }

    public Timestamp getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", lastUpdateTimestamp=" + lastUpdateTimestamp +
                ", balance=" + balance +
                '}';
    }
}
