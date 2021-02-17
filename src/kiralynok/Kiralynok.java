package kiralynok;

import java.io.IOException;

public class Kiralynok {

    public static void main(String[] args) throws IOException {
        Tabla tabla = new Tabla('#');
        System.out.println("4. feadat: Öres tábla");
        tabla.megjelenit();
        
        System.out.println(". feladat: Feltöltött megjelenitése");
        tabla.elhelyez(5);
        tabla.megjelenit();
        
    }

}
