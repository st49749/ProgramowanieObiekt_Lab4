package Lab07.Zad3;

import java.awt.*;

public class Trojkat extends Figura implements iFigury {
	int wys=0;
	int podst=0;
	public Trojkat(int wys, int podst, String kolor){
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}

	@Override
	public String opis(){
		return "Trojkat o wymairach: "+wys+"  "+podst;
	}

	@Override
	public void skaluj(float skala) {
		this.wys = (int) ((float)this.wys * skala);
		this.podst = (int) ((float)this.podst * skala);
	}

	@Override
	public float getPowierzchnia() {
		return 0.5f * this.wys * this.podst;
	}

	@Override
	public boolean wPolu(Punkt s) {
		// https://stackoverflow.com/a/9755252
		Point a = new Point(this.punkt.x, this.punkt.y);
		Point b = new Point(this.punkt.x + this.podst, this.punkt.y);
		Point c = new Point((int)((this.punkt.x + this.podst) * 0.5), this.punkt.y + this.wys);

		int as_x = s.x - a.x;
		int as_y = s.y - a.y;

		boolean s_ab = (b.x - a.x) * as_y - (b.y - a.y) * as_x > 0;

		if ((c.x - a.x) * as_y - (c.y - a.y) * as_x > 0 == s_ab)
			return false;
		if ((c.x - b.x) * (s.y - b.y) - (c.y - b.y)*(s.x - b.x) > 0 != s_ab)
			return false;

		return true;
	}
}