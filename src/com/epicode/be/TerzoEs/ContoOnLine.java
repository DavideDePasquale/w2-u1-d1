package com.epicode.be.TerzoEs;

public class ContoOnLine extends ContoCorrente {
       private double maxPrelievo;
    public ContoOnLine(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }
   public void stampaSaldo(){
       System.out.println("Titolare: " + titolare + " = Saldo :" + saldo + " = Numero Movimenti : " + nMovimenti + " = Massimo Prelievo : " + maxMovimenti + " = Massimo Prelievo possibile :" + maxPrelievo);
   }

    public void preleva(double x) throws BancaException {
        if(x <= maxPrelievo){
          super.preleva(x);
        }
        if ( x > maxPrelievo){
            throw new BancaException("Il prelievo non è disponibile");
        }
    }
}
