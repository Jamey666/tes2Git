package com.jamey.bank_try;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Account {
    private String name;
    private int balance;
    private static int ramNum=1000;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
        String show = "RanNum = " + ramNum;
        System.out.println(show);
        ramNum++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static String getRan(int length){
        Random rand = new Random();
        String base="asdfghjklzxcvbnmqwertyuiop789456123";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length; i++){
            sb.append(base.charAt(rand.nextInt(base.length())));
        }
//        List<Character> list = new ArrayList<>();
//        for(char c : base.toCharArray()){
//            list.add(c);
//        }
        return sb.toString();
    }
}
