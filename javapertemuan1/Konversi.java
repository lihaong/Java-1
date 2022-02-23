/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapertemuan1;


/**
 *
 * @author mfaja
 */
public class Konversi {
    double dataSuhu;
    public Konversi(double dataGlobal){
        this.dataSuhu = dataGlobal;       
    }
    
    void konversiSuhu(){
        double fahrenheit = (9 * this.dataSuhu)/5 + 32;
        double reamur = (4 * this.dataSuhu)/5;
        double kelvin = this.dataSuhu + 273.15; 
        System.out.println("\nSuhu dalam Celcius  : " + this.dataSuhu + "°C");
        System.out.println("Dalam Fahrenheit    : " + fahrenheit + "°F");
        System.out.println("Dalam Reamur        : " + reamur + "°R");
        System.out.println("Dalam Kelvin        : " + kelvin + "K");
        if (this.dataSuhu <= 0){
            System.out.println("Kondisi Air Beku");
        } else if (this.dataSuhu >= 100){
            System.out.println("Kondisi Air Mendidih");
        } else {
            System.out.println("Kondisi Air Normal");
        }
    }
}
