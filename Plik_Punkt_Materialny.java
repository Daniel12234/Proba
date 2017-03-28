
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

public Punktm(){ //konstruktor domyœlny ustawiaj¹cy mase na wartoœæ 0
	
}	

public Punktm(double podaj_mase){ //konstruktor z parametrem
	masa=podaj_mase;
}	

public void momentgl (){ // //metoda dla g³ównego momentu bezw³adonœci, który z warunków zadania domyœlnie wynosi 0
		int moment_glowny=0;
		System.out.println("Glowny moment bezwladnosci wynosi " + moment_glowny);
	}
	
		public double  momentST (double d){ //metoda do liczenia momentu bezw³adonœci z twierdzenia Steinera
		double ST=0+masa*d*d;
		return ST;
	}
	
}
