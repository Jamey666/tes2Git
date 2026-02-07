package com.jamey.bank_try;

import java.util.Random;
import java.util.Scanner;

public class CreditCard {
    private String cardNumber;
    private String passWord;

    Scanner input = new Scanner(System.in);

    public CreditCard() {
        System.out.println("你的卡號是:");
        cardNumberGenerator();
        System.out.println(this.cardNumber);
        System.out.println("請設定密碼 ");
        this.passWord = input.nextLine();
        System.out.println("已設定密碼為: " + this.passWord);
    }

    private void cardNumberGenerator(){
        Random rand = new Random();
        String base = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM789456123";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<10 ; i++){
            sb.append(base.charAt(rand.nextInt(base.length())));
        }
        this.cardNumber = sb.toString();
    }

    @Override
    public String toString() {
        return "【卡號】" + this.cardNumber +  "\n【密碼】" + this.passWord ;
    }
}
