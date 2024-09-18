package Projects.tests;

import Projects.domain.Lutador;
import Projects.domain.Luta;

public class LutadorTest01 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[3];

        l[0] = new Lutador("Breno", "Brasil", 18, 1.78, 59.75, 6, 3, 1);
        l[1] = new Lutador("Luan", "Itália", 17, 1.75, 70, 8, 1, 1);
        l[2] = new Lutador("Diego", "México", 18, 1.59, 54, 3, 6, 1);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[2]);
        UEC01.lutar();

        l[0].status();
        l[2].status();
    }
}
