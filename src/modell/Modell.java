
package modell;

public class Modell {
    private String adat;

   

    public Modell(String adat) {
        this.adat = adat;
    }
     public String getAdat() {
        return adat;
    }

    public void setAdat(String adat) {
        if (adat == null) {
            throw new IllegalArgumentException("hibas adat!");
            
        }
        this.adat = adat;
    }
    
}
