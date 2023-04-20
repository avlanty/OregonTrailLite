package org.yup.oregontrail;

import java.sql.SQLOutput;

public class OregonTrailApp {

    public static void main(String[] args){
        Traveler anthony = new Traveler("Anthony", 100, 100);
        System.out.println("Before hunting food: " + anthony.getFood());
        System.out.println(anthony.hunt());
        System.out.println("After hunting food: " + anthony.getFood());
        System.out.println(anthony.eat());
        System.out.println(anthony.eat());
        System.out.println(anthony.eat());
        System.out.println(anthony.eat());
        System.out.println(anthony.getFood());
    }

}
