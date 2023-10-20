package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gün sayısı giriniz : ");
        int day = input.nextInt();
/*
        if (day == 1){
            System.out.println("Bugün pazartesi");
        }else if (day == 2){
            System.out.println("Bugün salı");
        }else if (day == 3){
            System.out.println("Bugün carsamba");
        }else if (day == 4){
            System.out.println("Bugün perşembe");
        }else if (day == 5){
            System.out.println("Bugün cuma");
        }else if (day == 6){
            System.out.println("Bugün cumartesi");
        }else if (day == 7){
            System.out.println("Bugün pazar");
        }else{
            System.out.println("Geçersiz gün sayısı girdiniz");
        }

*/
        switch (day){
            case 1:
                System.out.println("Bugün Pazaresi");
                break;
            case 2:
                System.out.println("Bugün Sali");
                break;
            case 3:
                System.out.println("Bugün çarşamba");
                break;
            case 4:
                System.out.println("Bugün perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Geçersiz gün girdiniz");
        }
    }
}
