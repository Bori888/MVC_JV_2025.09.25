
package main;

import modell.Modell;
import vezerlo.KonzolVezerlo;
import nezet.KonzolNezet;

public class MVC01Konzol {

  
    public static void main(String[] args) {
        KonzolNezet  nezet = new KonzolNezet();
        String adat = nezet.bekerAdat("Mi lesz az adat értéke? ");
        Modell modell =new Modell(adat);
        KonzolVezerlo vezerlo =new KonzolVezerlo( modell,nezet);
        
    }
    
}
