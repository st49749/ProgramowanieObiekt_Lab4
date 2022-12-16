import Lab07.Lab07Test;
import Lab07.Zad3.*;

public class Main {
    public static void main(String[] args) {
        Lab07Test.TestZad1();
        Lab07Test.TestZad2();

        // Lab07 Zad 3.2
        var pros = new Prostokat(10, 10, "niebieski");
        var troj = new Trojkat(10, 10, "fioletowy");
        var kwad = new Kwadrat(4, "zielony");
        var punkt = new Punkt(5,6);
        System.out.println(pros.opis());
        System.out.println(troj.getKolor());
        System.out.println(kwad.opis());
        System.out.println();

        var tablicaFigur = new Figura[10];
        tablicaFigur[0] = pros;
        tablicaFigur[1] = troj;
        tablicaFigur[2] = kwad;
        tablicaFigur[3] = new Kwadrat(3,"czerwony");
        tablicaFigur[4] = new Kwadrat(4,"niebieski");
        tablicaFigur[5] = new Kwadrat(5,"zielony");
        tablicaFigur[6] = new Trojkat(12, 13, "niebieski");
        tablicaFigur[7] = new Trojkat(14, 15, "fioletowy");
        tablicaFigur[8] = new Prostokat(16, 17, "niebieski");
        tablicaFigur[9] = new Prostokat(18, 19, "zielony");

        for (var fig: tablicaFigur) {
            System.out.println(fig.opis());
        }
        System.out.println();

        // Lab07 Zad 3.11
        var tablicaiFigur = new iFigury[10];
        tablicaiFigur[0] = pros;
        tablicaiFigur[1] = troj;
        tablicaiFigur[2] = kwad;
        tablicaiFigur[3] = new Kwadrat(3,"czerwony");
        tablicaiFigur[4] = new Kwadrat(4,"niebieski");
        tablicaiFigur[5] = new Kwadrat(5,"zielony");
        tablicaiFigur[6] = new Trojkat(12, 13, "niebieski");
        tablicaiFigur[7] = new Trojkat(14, 15, "fioletowy");
        tablicaiFigur[8] = new Prostokat(16, 17, "niebieski");
        tablicaiFigur[9] = new Prostokat(18, 19, "zielony");

        for (var fig: tablicaiFigur) {
            System.out.println(fig.getPowierzchnia());
            System.out.println(fig.wPolu(punkt));
        }

        // Lab07 Zad 3.Okrag
        var okrag = new Okrag(new Punkt(2,3), 10);
        System.out.println(okrag.opis());
        okrag.skaluj(10);
        okrag.przesun(3, 4);
    }
}