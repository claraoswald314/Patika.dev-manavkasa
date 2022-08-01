package com.org.nyp;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        float armut =0;
        float elma=0;
        float domates=0;
        float muz=0;
        float patlican=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç kilo armut aldığınızı yazınız : " + armut);
        armut= scanner.nextFloat();
        System.out.println("kaç kilo elma aldığınızı yazınız : " + elma);
        elma= scanner.nextFloat();
        System.out.println("kaç kilo domates aldığınızı yazınız : " + domates);
        domates = scanner.nextFloat();
        System.out.println("kaç kilo muz aldığınızı yazınız : " + muz);
        muz = scanner.nextFloat();
        System.out.println("kaç kilo patlıcan aldığınızı yazınız : " + patlican);
        patlican= scanner.nextFloat();

        float toplam = (float) ((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5));
        System.out.println("ödemeniz gereken tutar : "+ toplam+" TL ");

    }
}
