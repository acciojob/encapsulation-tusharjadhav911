package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly a=new RWOnly();
        //Cannot resolve method 'RWOnly' in 'RWOnly'
        a.setName("ganesh");
        a.getName();
    }
}