package com.test;

public class BankingSystem implements Interest{
    String name;
    float interest;
    private float balance;
    String CustomerType;
    public BankingSystem() {
    }
    public float getBalance() {
        return (balance+interest);
    }

    public BankingSystem(String name, float balance, String customerType) {
        this.name = name;
        this.balance = balance;
        CustomerType = customerType;
        this.CalcInterest();
    }
    public void CalcInterest() {
        //CustomerType=this.CustomerType;
        if(CustomerType=="CEO") {
            interest=balance*.4f;
        } else if(CustomerType=="Senior")
            interest=balance*.2f;

    }

    void withdraw(float withdrawed){
        if(withdrawed>balance)
            System.out.println("No Enough money");
        else if(withdrawed<=0)
            System.out.println("Error");
        else
           balance-=withdrawed;
    }
    void deposit(float deposited){
        if(deposited<=0)
            System.out.println("Error");
        else
            balance+=deposited;
    }
}
