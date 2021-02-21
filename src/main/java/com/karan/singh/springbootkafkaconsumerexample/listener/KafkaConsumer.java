package com.karan.singh.springbootkafkaconsumerexample.listener;

import com.karan.singh.springbootkafkaconsumerexample.model.Account;
import com.karan.singh.springbootkafkaconsumerexample.model.Transactions;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KafkaConsumer {

    List<Account> accounts = new ArrayList<>();
    List<Transactions> transactions = new ArrayList<>();

   /* @KafkaListener(topics = "account", group = "json",
            containerFactory = "accountKafkaListenerFactory")
    public void consumeJson(Account account) {
        accounts.add(account);
        System.out.println("Consumed JSON Message: " + account);
    }
*/
/*    @KafkaListener(topics = "transaction", group = "json",
            containerFactory ="transactionKafkaListenerFactory" )
    public void consumeJson(Transactions transaction) {
        this.transactions.add(transaction);
        System.out.println("Consumed JSON Message: " + transactions);
    }*/

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }
}
