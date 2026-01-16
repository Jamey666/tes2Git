package com.jamey.bank_try;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BankTryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankTryApplication.class, args);

        System.out.println("tes");
        Account account = new Account("jamey",500);
        Account account1 = new Account("jamey2",500);
        Account account2 = new Account("jamey3",500);
        System.out.println(Account.getRan(10));
        // 在Git上補充之註解 = =
        //在MyBranch Local端新增之註解~
        // 在local新增註解 (Master Branch)
        //test2~
        // local端刪了之後的tes3
        //666
//        List<Object> list = new ArrayList<>();
//        list.add("hahaha");
//        list.add("XDD");
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

    }

}
