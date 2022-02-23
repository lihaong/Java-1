/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapertemuan1;

import java.util.Scanner;

/**
 *
 * @author mfaja
 */
public class Main {
    
    static int nilaiSuhu(){
        Scanner myData = new Scanner(System.in);
        int dataSuhu;
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius  : ");
        dataSuhu = myData.nextInt();
        return dataSuhu;
    }
    
    static void menuUtama(){
        Scanner myOpsi = new Scanner(System.in);
        int opsiMenu = 0;
        double temp = 0;
        Konversi konv = new Konversi(temp);
        if (opsiMenu == 0){
            temp = nilaiSuhu();
            konv = new Konversi(temp);
        }
        while(opsiMenu != 3){
            System.out.println("\nOpsi\n----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            opsiMenu = myOpsi.nextInt();
            switch(opsiMenu){
                case 1:
                    konv.konversiSuhu();
                    break;
                case 2:
                    temp = nilaiSuhu();
                    konv = new Konversi(temp);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }            
        }
        
       
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("+-------------------------+");
        System.out.println("|PROGRAM KONVERSI SUHU AIR|");
        System.out.println("+-------------------------+");
        menuUtama();
        
    }
    
}
