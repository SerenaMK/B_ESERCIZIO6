import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

	static ArrayList<Integer> lista = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		primaFunzione(10);
		secondaFunzione(lista);
		terzaFunzione(lista, true);
		terzaFunzione(lista, false);

	}
	
	public static void primaFunzione(int n) {
		System.out.println("- PRIMA FUNZIONE -");
		Random r = new Random();
		
		for (int i = 0; i < n; i++) {
			lista.add(r.nextInt(101));
		}
		
		System.out.println(lista);
	}
	
	public static void secondaFunzione(ArrayList<Integer> lista) {
		System.out.println("\n- SECONDA FUNZIONE -");
		System.out.println("Lista: " + lista);
		Collections.reverse(lista);
		System.out.println("Lista al contrario: " + lista);
	}
	
	public static void terzaFunzione(ArrayList<Integer> lista, boolean b) {
		ArrayList<Integer> newLista = new ArrayList<Integer>();
		
		System.out.println("\n- TERZA FUNZIONE -");
		
		if (b) {
			for (int i = 0; i < lista.size() ; i++) {
				if (i % 2 == 0) {
					newLista.add(lista.get(i));
				}
			}
		} else {
			for (int i = 0; i < lista.size() ; i++) {
				if (i % 2 != 0) {
					newLista.add(lista.get(i));
				}
			}
		}
		
		System.out.println("Lista: " + newLista);
		
	}

}
