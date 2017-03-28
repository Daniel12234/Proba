
public class Glowna {

	public static void main(String args[]){
		
		Punktm punkt=new Punktm(); // utworzenie obiektu punkt
		Punktm punkt2=new Punktm(5); // utworzenie obiektu punkt2
		
		punkt.napis(); //wywo�anie metody gdzie znajduje si� napis dla obiektu punkt
		System.out.println("Masa punktu materialnego to " + punkt.getmasa()); //wypisanie masy obiektu punkt (masa jest sta�a)
		punkt.momentgl();  // wywo�anie metody do wy�wietlenia warto��i g�ownego momentu bezw�adno�ci
		System.out.println("Moment bezw�adno�ci z Twierdzenia Steinera wynosi " + punkt.momentST(10)); // wywo�anie metody do wy�wietlenia warto��i 
		//momentu bezw�adno�ci z tw. Steinera oraz wypisanie jej
		System.out.println(); //wstawienie nowego wiersza

		punkt2.napis(); //wywo�anie metody gdzie znajduje si� napis dla obiektu punkt2
		System.out.println("Masa punktu materialnego to " + punkt2.getmasa()); //wypisanie masy obiektu punkt2 (masa jest sta�a)
		punkt2.momentgl(); // wywo�anie metody do wy�wietlenia warto��i g�ownego momentu bezw�adno�ci
		System.out.println("Moment bezw�adno�ci z Twierdzenia Steinera wynosi " + punkt2.momentST(10));// wywo�anie metody do wy�wietlenia warto��i 
		//momentu bezw�adno�ci z tw. Steinera oraz wypisanie jej
		System.out.println(); //wstawienie nowego wiersza

		
		punkt.setmasa(25); //zmiana masy przy u�yciu settera dla obiektu punkt
		punkt.napis(); // dzia�anie analogiczne jak w poprzednio
		System.out.println("Masa punktu materialnego to " + punkt.getmasa());
		punkt.momentgl();
		System.out.println("Moment bezw�adno�ci z Twierdzenia Steinera wynosi " + punkt.momentST(10));
		System.out.println();

		
		Punktm tablica_pkt[] = new Punktm[10]; //utworzenie tablicy mog�cej przechowywa� 10 obiekt�w klasy Punktm

		for(int i=0;i<tablica_pkt.length;i++){  ////p�tla kt�ra tworzy te obiekty 
			tablica_pkt[i]=new Punktm(i);
		}
		
		System.out.println();
		System.out.println("Dla obiekt�w z utworzonej tablicy mamy:"); 
		//Wy�wietlanie informacji dla kolejnych obiekt�w o r�nej masie:
		for(int i=0;i<tablica_pkt.length;i++){ //p�tla kt�ra "przejdzie przez wszystkie punkty
			System.out.println(); 
			tablica_pkt[i].setmasa(i); // na danym obiekcie wynujemy metode mutatora aby ustawi� okre�lon� mase
			System.out.println("Masa punktu materialnego to " + tablica_pkt[i].getmasa()); // wypisanie masy dla danego obiektu
			tablica_pkt[i].momentgl(); //wywo�anie metody do wy�wietlenia warto��i g�ownego momentu bezw�adno�ci dla i-tego obiektu
			System.out.println("Moment bezw�adno�ci z Twierdzenia Steinera wynosi " + tablica_pkt[i].momentST(10));//wywo�anie metody do wy�wietlenia warto��i 
			//momentu bezw�adno�ci z tw. Steinera oraz wypisanie jej
		}
			
	}
}
