package com.company;

public class BankAccount {

    private double purse;

    public BankAccount(double purse) {
        this.purse = purse;
    }
    public BankAccount(){}



    public double getAmount(){
        return purse;

    }
    public double deposit (double money){
         purse = purse + money;
        System.out.println(" на счету " + purse);


        return money;
    }
    public void withDraw (double money) throws LimitException {
        if(money > purse){
            throw new LimitException (" отсутствуют деньги ", getAmount());

        }


            purse = purse - money;
        System.out.println(" изъято " + money);
    }


}
