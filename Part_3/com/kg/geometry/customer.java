package com.kg.geometry;

public class customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "GYAN SAGAR" );
        account.depositMoney(100);
        account.withDrawMoney(200);
        System.out.println(account.withDrawMoney(200));
        account.withDrawMoney(-40);
        account.withDrawMoney(0);
    }
}
