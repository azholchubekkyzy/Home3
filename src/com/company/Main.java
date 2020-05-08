package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);


        for (int i = 0; ; i++) {
            try {
                bankAccount.withDraw(6000);


            } catch (LimitException d) {

                System.out.println(" на счету имеется остаток " + bankAccount.getAmount());
                bankAccount.withDraw((int) bankAccount.getAmount());

                System.out.println(d.getMessage());
                System.out.println(" на счету имеется остаток " + bankAccount.getAmount() + " До свидания!");


                break;


            }


        }

    }}