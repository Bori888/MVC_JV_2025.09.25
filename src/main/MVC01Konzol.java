
package main;

import modell.Modell;
import vezerlo.KonzolVezerlo;
import nezet.KonzolNezet;

public class MVC01Konzol {

  
    public static void main(String[] args) {
        KonzolNezet  nezet = new KonzolNezet();
        Modell modell =new Modell("Hello Mvc DI vel");
        KonzolVezerlo vezerlo =new KonzolVezerlo( modell,nezet);
        
    }
    
}
