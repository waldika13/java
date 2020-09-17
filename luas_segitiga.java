package com.pbo;

public class Segitiga {
    /**
     * Program menghitung luas segitiga dengan :
     * alas dan tinggi diinput melalui kode program
     * tampilan output :
     * Program Segitiga
     * alas = 10
     * tinggi = 20
     * luas = 100
     */

    public static void main(String[] args) {
        int alas = 10;
        int tinggi = 20;
        int luas = ((alas * tinggi) / 2);

        System.out.println("Program Segitiga");
        System.out.println("alas = " + alas);
        System.out.println("tinggi = " + tinggi);
        System.out.println("Luas = " + luas);
    }
}
