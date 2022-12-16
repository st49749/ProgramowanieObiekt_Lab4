package Lab07.Zad3;

public abstract class Figura{
		Punkt punkt;
		String kolor = "bialy";

		public Figura(){
			punkt = new Punkt(0,0);
		}
		public Figura(String kolor){
			this.kolor=kolor;
		}
		public Figura(Punkt punkt){
			this.punkt=punkt;
		}

		public String getKolor(){
			return kolor;
		}

	public abstract String opis();

	public abstract void skaluj(float skala);
}

