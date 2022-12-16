package Lab07.Zad2;

public class Wieloryb extends Ryba implements iPlywanie {
    @Override
    public void jedz() {
        System.out.println("Wieloryb je");
    }

    @Override
    public void wydalaj() {
        System.out.println("Wieloryb wydala");
    }

    @Override
    public void PrintName() {
        System.out.println("Nazwa: Wieloryb");
    }

    @Override
    public void plyn() {
        System.out.println("Wieloryb plynie");
    }

    @Override
    public void wynurz() {
        System.out.println("Wieloryb sie wynurza");
    }

    @Override
    public void zanurz() {
        System.out.println("Wieloryb sie zanurza");
    }
}
