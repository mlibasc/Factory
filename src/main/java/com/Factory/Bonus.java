package com.Factory;

public class Bonus implements Card{

    @Override
    public void create(){
        System.out.println("Authenticating Bonus creation...");
        System.out.println("Creating Bonus Card...\n");
    }
}
