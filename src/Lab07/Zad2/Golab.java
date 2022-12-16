package Lab07.Zad2;

public class Golab extends Zwierze implements iLatanie {
    @Override
    public void leci() {
        System.out.println("Golab leci");
    }

    @Override
    public void wyladuj() {
        System.out.println("Golab laduje");
    }

    @Override
    public void PrintName() {
        System.out.println("Nazwa: Golab");
    }
}
