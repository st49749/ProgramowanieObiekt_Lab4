package Lab07.Zad3;

public class Okrag extends Figura implements iRuchFigury {

    public Okrag(int promien) {
        this.promien = promien;
    }

    public Okrag(String kolor, int promien) {
        super(kolor);
        this.promien = promien;
    }

    public Okrag(Punkt punkt, int promien) {
        super(punkt);
        this.promien = promien;
    }

    int promien=0;
    @Override
    public String opis() {
        return "Okrag";
    }

    @Override
    public void skaluj(float skala) {
        this.promien = (int) (this.promien * skala);
    }

    @Override
    public void przesun(int x, int y) {
        this.punkt.x =this.punkt.x + x;
        this.punkt.y =this.punkt.y + y;
    }
}
