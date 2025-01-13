package com.epicode.be.PrimoEs;

import java.util.Random;
import java.util.Scanner;

public class PrimoEsercizio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeri = new int[5];


        for (int i = 0; i < numeri.length ; i++) {
            Random generatore = new Random();
            int number = generatore.nextInt(1,11);
            numeri[i] = number;
            System.out.println("Posizione nell'Array : " + i + " numero scelto : " + numeri[i]);
        }
        System.out.println("Vuoi aggiungere un nuovo numero nell'array?");
        String risposta = sc.nextLine();

        if(risposta.equals("si")){
            System.out.println("Quale posizione nell'Array vuoi modificare? Seleziona fra 1 e 5 per le posizioni, 0 per uccidere il terminale");
            int numeroArr = sc.nextInt();
            sc.nextLine();
            if(numeroArr >= 0 && numeroArr < numeri.length ){
                System.out.println("Che numero vuoi mettere?");
                int numeroMod = sc.nextInt();
                numeri[numeroArr] = numeroMod;

                System.out.println("Quindi l'array aggiornato è ora : ");
                for (int i = 0; i < numeri.length ; i++) {
                    System.out.println("Posizione nell'Array : " + i + " numero scelto : " + numeri[i]);

                }
            } else if (numeroArr == 0) {
                System.out.println("Hai ammazzato il terminale! ASSASSINO");

            } else {
                System.out.println("Posizione dell'array non valida!");
            }

        } else {
            System.out.println("Non vuoi modificare l'array");
        }




    }

}
