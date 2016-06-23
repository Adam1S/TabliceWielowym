package com.company;

public class Main {

    public static void main(String[] args) {

        String[] firstNames={"Adam", "Filip", "Piotr"};
        String[] lastNames={"Jackowski", "Krychowiak", "Żmłudziński"};

        String[][] firstLast={firstNames, lastNames}; //połączono obie tablice

        System.out.println(firstLast[0][0]+" "+firstLast[1][0]);
    }
}
