package com.qf;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTransactionManagerServer
public class TxManagerStarterApp {

    public static void main(String[] args) {
        SpringApplication.run(TxManagerStarterApp.class,args);
    }
}
