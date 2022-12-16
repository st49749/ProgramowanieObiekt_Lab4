package Lab07.Zad3;

public class Prostokat extends Figura implements iFigury {
	int wys=0;
	int szer=0;
	
	public Prostokat(int wys, int szer, String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}

	@Override
	public String opis(){
		return "Prostokat o wymairach: "+szer+" x "+wys;
	}

	@Override
	public void skaluj(float skala) {
		this.wys = (int) ((float)this.wys * skala);
		this.szer = (int) ((float)this.szer * skala);
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