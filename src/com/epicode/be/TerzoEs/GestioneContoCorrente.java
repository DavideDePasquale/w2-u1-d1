package com.epicode.be.TerzoEs;

import java.util.Scanner;

public class GestioneContoCorrente {

    public static void main(String[] args) throws BancaException {

        ContoCorrente contoCorr1 = new ContoCorrente("Davide De Pasquale", 260);
        try {
            contoCorr1.preleva(50);
            System.out.println("Il tuo saldo residuo è : " + contoCorr1.restituisciSaldo());
            contoCorr1.preleva(200);
            System.out.println("Il tuo saldo residuo è : " + contoCorr1.restituisciSaldo());
            contoCorr1.preleva(40);
            System.out.println("Il tuo saldo residuo è : " + contoCorr1.restituisciSaldo());

        } catch (BancaException e) {
            System.out.println(e.getMessage());
        }


        ContoOnLine contoOn = new ContoOnLine("Tommaso Chicchirichi", 250, 100);
        try {
            contoOn.preleva(50);
            System.out.println("Il tuo saldo residuo del conto Online è : " + contoOn.restituisciSaldo());
            contoOn.preleva(100);
            System.out.println("Il tuo saldo residuo del conto Online è : " + contoOn.restituisciSaldo());
            contoOn.preleva(100);
            System.out.println("Il tuo saldo residuo del conto Online è : " + contoOn.restituisciSaldo());



        } catch (BancaException e) {
            System.out.println(e.getMessage());
        }


    }
}
