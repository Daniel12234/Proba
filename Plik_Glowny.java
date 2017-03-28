
public class Glowna {

	public static void main(String args[]){
		
		Punktm punkt=new Punktm(); // utworzenie obiektu punkt
		Punktm punkt2=new Punktm(5); // utworzenie obiektu punkt2
		
		punkt.napis(); //wywo³anie metody gdzie znajduje siê napis dla obiektu punkt
		System.out.println("Masa punktu materialnego to " + punkt.getmasa()); //wypisanie masy obiektu punkt (masa jest sta³a)
		punkt.momentgl();  // wywo³anie metody do wyœwietlenia wartoœæi g³ownego momentu bezw³adnoœci
		System.out.println("Moment bezw³adnoœci z Twierdzenia Steinera wynosi " + punkt.momentST(10)); // wywo³anie metody do wyœwietlenia wartoœæi 
		//momentu bezw³adnoœci z tw. Steinera oraz wypisanie jej
		System.out.println(); //wstawienie nowego wiersza

		punkt2.napis(); //wywo³anie metody gdzie znajduje siê napis dla obiektu punkt2
		System.out.println("Masa punktu materialnego to " + punkt2.getmasa()); //wypisanie masy obiektu punkt2 (masa jest sta³a)
		punkt2.momentgl(); // wywo³anie metody do wyœwietlenia wartoœæi g³ownego momentu bezw³adnoœci
		System.out.println("Moment bezw³adnoœci z Twierdzenia Steinera wynosi " + punkt2.momentST(10));// wywo³anie metody do wyœwietlenia wartoœæi 
		//momentu bezw³adnoœci z tw. Steinera oraz wypisanie jej
		System.out.println(); //wstawienie nowego wiersza

		
		punkt.setmasa(25); //zmiana masy przy u¿yciu settera dla obiektu punkt
		punkt.napis(); // dzia³anie analogiczne jak w poprzednio
		System.out.println("Masa punktu materialnego to " + punkt.getmasa());
		punkt.momentgl();
		System.out.println("Moment bezw³adnoœci z Twierdzenia Steinera wynosi " + punkt.momentST(10));
		System.out.println();

		
		Punktm tablica_pkt[] = new Punktm[10]; //utworzenie tablicy mog¹cej przechowywaæ 10 obiektów klasy Punktm

		for(int i=0;i<tablica_pkt.length;i++){  ////pêtla która tworzy te obiekty 
			tablica_pkt[i]=new Punktm(i);
		}
		
		System.out.println();
		System.out.println("Dla obiektów z utworzonej tablicy mamy:"); 
		//Wyœwietlanie informacji dla kolejnych obiektów o ró¿nej masie:
		for(int i=0;i<tablica_pkt.length;i++){ //pêtla która "przejdzie przez wszystkie punkty
			System.out.println(); 
			tablica_pkt[i].setmasa(i); // na danym obiekcie wynujemy metode mutatora aby ustawiæ okreœlon¹ mase
			System.out.println("Masa punktu materialnego to " + tablica_pkt[i].getmasa()); // wypisanie masy dla danego obiektu
			tablica_pkt[i].momentgl(); //wywo³anie metody do wyœwietlenia wartoœæi g³ownego momentu bezw³adnoœci dla i-tego obiektu
			System.out.println("Moment bezw³adnoœci z Twierdzenia Steinera wynosi " + tablica_pkt[i].momentST(10));//wywo³anie metody do wyœwietlenia wartoœæi 
			//momentu bezw³adnoœci z tw. Steinera oraz wypisanie jej
		}
			
	}
}
