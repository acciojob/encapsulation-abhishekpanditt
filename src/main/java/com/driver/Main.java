package com.driver;

public class Main {

    public static void Main(String [] args){

        RWOnly obj = new RWOnly();

        obj.setName("Abhi");

        String ans = obj.getName();
        System.out.println(ans);
    }
  
}