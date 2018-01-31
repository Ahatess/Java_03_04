package com.company;

import java.util.Scanner;

public class Main {
    public static final int EXIT_CODE = 0;

    public static void main(String[] aEXIT_CODErgs) {
        Main objektas = new Main();
    }

    public Main() {
        float suma = 0;
        float skaicius = 0;
        do {
            skaicius = duokGarantuotaiSkaiciu();
            suma += skaicius;
        } while (skaicius != EXIT_CODE);
        System.out.println("Suma: " + suma);
    }

    public float duokGarantuotaiSkaiciu() {
        float rezultatas = 0;
        Scanner sc = new Scanner(System.in);
        boolean arPavyko = false;
        while (arPavyko == false) {
            System.out.println("Iveskite skaicius, kol bus 0");
            try {
                rezultatas = sc.nextFloat();
                arPavyko = true;
            } catch (Exception klaida) {
                System.out.println("Ivestas tekstas yra ne skaicius");
                sc.next();
            }
        }
        return rezultatas;
    }
}

