package com.karan.singh.springbootkafkaconsumerexample.listener;

import com.karan.singh.springbootkafkaconsumerexample.model.Account;
import com.karan.singh.springbootkafkaconsumerexample.model.Transactions;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {



    @KafkaListener(topics = "account", group = "json",
            containerFactory = "accountKafkaListenerFactory")
    public void consumeJson(Account account) {
        System.out.println("Consumed JSON Message: " + account);
    }



/*    @KafkaListener(topics = "transaction", group = "json",
            containerFactory ="transactionKafkaListenerFactory" )
    public void consumeJson(Transactions transactions) {
        System.out.println("Consumed JSON Message: " + transactions);
    }*/

}
