package kiralynok;

import java.io.IOException;

public class Kiralynok {

    private Tabla tabla;

    public Kiralynok() {
        tabla  = new Tabla('#');
        megoldasok();
    }
    
    
    
    public static void main(String[] args) throws IOException {
        
        Kiralynok kir = new Kiralynok();
        kir.megoldasok();
        
    }

    private void megoldasok() {
       feladat4();
       feladat6();
       feladat9();
      
    }

    private void feladat4() {
        System.out.println("4. feadat: Öres tábla");
        tabla.megjelenit();
        
    }

    private void feladat6() {
            
        System.out.println(". feladat: Feltöltött megjelenitése");
        tabla.elhelyez(5);
        tabla.megjelenit();
    }

    private void feladat9() {
        System.out.println("9. feladat: üres sorok és oszopok száma");
        System.out.println("ures sorok: " + tabla.uresSorokSzama());
        System.out.println("ures oszlopok: " + tabla.uresOszlopokSzama());
    }

    
    
}
