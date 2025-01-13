package com.epicode.be.SecondoEs;

import java.util.Scanner;

public class SecondoEs {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        try {
            calcoloKmLitro();
        } catch (Exception e) {
            System.out.println("I litri non possono essere 0!");
        } finally {
            System.out.println(" FINE ");
        }

        try {
            calcoloKmLitroDouble();
        } catch (Exception e) {
            System.out.println("ERRORE! " + e.getMessage());
        } finally {
            System.out.println(" FINE ");
        }

    }
    public static void calcoloKmLitro(){
        System.out.println("Inserisci i Km percorsi");
        int kmPercorsi = sc.nextInt();
        System.out.println("Inserisci ora i litri massimi della tua auto ");
        int carburanteConsumato = sc.nextInt();
        int kmalLitro = kmPercorsi / carburanteConsumato;
        System.out.println("La tua auto consuma : " + kmalLitro + "km/litro");

    }
    public static void calcoloKmLitroDouble() throws Exception {
        System.out.println("Inserisci i km percorsi (metodo double)");
        double kmPercorsi = sc.nextDouble();
        System.out.println("Inserisci ora i litri massimi della tua auto (metodo double) ");
        double carburanteConsumato = sc.nextDouble();
        if(carburanteConsumato == 0) {
          throw new Exception("Valore non ammesso!");
        }
        double kmalLitro = kmPercorsi / carburanteConsumato;
        System.out.println("La tua auto consuma : " + kmalLitro + "km/litro");
     //con il double come tipo, esce infinity come valore...
    }






}
