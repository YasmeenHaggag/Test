package com.test;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BankingSystem customer1=new BankingSystem("Yasmin",100,"CEO");
        //customer1.withdraw(200);
        //customer1.deposit(100);
        //customer1.withdraw(200);
        //customer1.getBalance();
        //customer1.CalcInterest("CEO");
        //customer1.CustomerType="CEO";
        System.out.println(customer1.getBalance());
    }



}