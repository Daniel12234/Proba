
public class Punktm {
private double masa;

public double getmasa(){ // akcesor (inaczej getter)
return masa;
}

public void setmasa (double m){  // mutator (inaczej setter)
masa=m;
}
	
public void napis() { // metoda do tworzenia napisu
System.out.println("Punkt materialny");
}

public Punktm(){ //konstruktor domy�lny ustawiaj�cy mase na warto�� 0
	
}	

public Punktm(double podaj_mase){ //konstruktor z parametrem
	masa=podaj_mase;
}	

public void momentgl (){ // //metoda dla g��wnego momentu bezw�adon�ci, kt�ry z warunk�w zadania domy�lnie wynosi 0
		int moment_glowny=0;
		System.out.println("Glowny moment bezwladnosci wynosi " + moment_glowny);
	}
	
		public double  momentST (double d){ //metoda do liczenia momentu bezw�adon�ci z twierdzenia Steinera
		double ST=0+masa*d*d;
		return ST;
	}
	
}
