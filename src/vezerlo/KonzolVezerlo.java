package vezerlo;

import modell.Modell;
import nezet.KonzolNezet;

public class KonzolVezerlo {

    private Modell modell;
    private KonzolNezet nezet;

    /*Dependency Injections*/
 /* Fügöség befecskedezése
            Id inncs Di vezérlo pédányositja a pédányt*/
    public KonzolVezerlo(Modell modell, KonzolNezet nezet) {
        this.nezet = nezet;
        this.modell = new Modell("Hello MVC!");

        nezet.mutat(modell.getAdat());

    }

}
