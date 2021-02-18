package com.karan.singh.springbootkafkaconsumerexample.restcontroller;

import com.karan.singh.springbootkafkaconsumerexample.model.Transactions;
import org.apache.kafka.streams.KafkaStreams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {


    @GetMapping("/getLatestBalance")
    public String getLatestBalance(@RequestParam(value = "accountNumber", defaultValue = "Invalid") String accountNumber) {

        return accountNumber;
    }

    @GetMapping("/getTransactions")
    public String getTransactionsInRange(@RequestParam(value = "t1", defaultValue = "Invalid") String t1, @RequestParam(value = "t1", defaultValue = "Invalid") String t2) {
        List<Transactions> transactions = new ArrayList<>();
        return t1+t2;
    }
}
