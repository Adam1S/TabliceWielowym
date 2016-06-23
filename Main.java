package com.company;

public class Main {

    public static void main(String[] args) {

        String[] firstNames={"Adam", "Filip", "Piotr"};
        String[] lastNames={"Jackowski", "Krychowiak", "Żmłudziński"};

        String[][] firstLast={firstNames, lastNames}; //połączono obie tablice

        System.out.println(firstLast[0][0]+" "+firstLast[1][0]);

        int[] longTab=new int[1000];
        longTab[99]=100;

        int[] midTab=new int[100];
        int[] smallTab=new int[10];

        int[][] hugeTab=new int[3][];


        hugeTab[0]=longTab;
        hugeTab[1]=midTab;
        hugeTab[2]=smallTab;

        System.out.println("Długości tablic: ");
        System.out.println(hugeTab[0].length+";"+hugeTab[1].length+";"+hugeTab[2].length);
        System.out.println("Setny element tablicy longtab to: "+longTab[99]);
        System.out.println("Wielkosc tablicy hugetab: "+hugeTab.length);


    }
}
