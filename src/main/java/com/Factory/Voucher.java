package com.Factory;

public class Voucher implements Card{
    @Override
    public void create(){
        System.out.println("Authenticating Voucher creation...");
        System.out.println("Creating Voucher...\n");
    }
}
