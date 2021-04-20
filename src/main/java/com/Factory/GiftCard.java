package com.Factory;

public class GiftCard implements Card{
    @Override
    public void create(){
        System.out.println("Authenticating Gift Card creation...");
        System.out.println("Creating Gift Card...\n");
    }
}
