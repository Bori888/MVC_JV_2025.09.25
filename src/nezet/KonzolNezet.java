package nezet;

import java.util.Scanner;

public class KonzolNezet {Scanner scanner = new Scanner(System.in);


    public void mutatAdat(String uzenet) {
        System.out.println(uzenet);
    }

    public String bekerAdat() {
        
       
    return bekerAdat("Adat bekérése: ");
    
    }
    public String bekerAdat(String kerdes) {
        mutatAdat(kerdes);
        return scanner.nextLine();
    }

}
