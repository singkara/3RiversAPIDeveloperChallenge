package com.karan.singh.springbootkafkaconsumerexample.model;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transactions {
    String accountNumber;
    Timestamp transactionTs;
    String type;
    double amount;

    public Transactions() {

    }

    public Transactions(String accountNumber, String transactionTs, String type, double amount) {
        this.accountNumber = accountNumber;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        Date parsedDate = null;
        try {
            parsedDate = dateFormat.parse(transactionTs);
            System.out.println(transactionTs);
            this.transactionTs = new Timestamp(parsedDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.type = type;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Timestamp getTransactionTs() {
        return transactionTs;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTransactionTs(Timestamp transactionTs) {
        this.transactionTs = transactionTs;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "accountNumber='" + accountNumber + '\'' +
                ", timestampTs=" + transactionTs +
                ", type=" + type +
                ", amount=" + amount +
                '}';
    }
}
