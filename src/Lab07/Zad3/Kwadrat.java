package Lab07.Zad3;

public class Kwadrat extends Prostokat implements iFigury{
	public Kwadrat(int bok,String kolor){
		super(bok,bok,kolor);
	}

	@Override
	public String opis(){
		return "Kwadrat o boku: "+szer;
	}

	@Override
	public void skaluj(float skala) {
		super.skaluj(skala);
	}

	@Override
	public float getPowierzchnia() {
		return this.wys * this.szer;
	}

	@Override
	public boolean wPolu(Punkt p) {
		var horizontalMin = this.punkt.x;
		var horizontalMax = this.punkt.x + this.szer;

		var verticalMin = this.punkt.y;
		var verticalMax = this.punkt.x + this.wys;
		return p.x >= horizontalMin && p.x <= horizontalMax
				&& p.y >= verticalMin && p.y <= verticalMax;
	}
}