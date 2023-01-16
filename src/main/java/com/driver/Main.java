package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly a=new RWOnly("ram");
        a.RWOnly("ganesh");
        //Cannot resolve method 'RWOnly' in 'RWOnly'
        a.setName("ganesh");
        a.getName();
    }
}