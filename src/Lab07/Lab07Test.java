package Lab07;

import Lab07.Zad1.Samolot;
import Lab07.Zad1.Statek;
import Lab07.Zad1.iLata;
import Lab07.Zad1.iPlywa;
import Lab07.Zad2.*;

public class Lab07Test {
    public static void TestZad1() {
        iLata latajacy = new Samolot();
        iPlywa plywa = new Statek();

        latajacy.Lec();
        plywa.Plyn();
    }

    public static void TestZad2() {
        Zwierze wieloryb = new Wieloryb();
        wieloryb.PrintName();

        var ryba = (Ryba)wieloryb;
        ryba.wydalaj();
        ryba.jedz();
        ryba.wydalaj();

        Zwierze golab = new Golab();
        golab.PrintName();

        var latajacy = (iLatanie)golab;
        latajacy.leci();
        latajacy.wyladuj();
    }
}
