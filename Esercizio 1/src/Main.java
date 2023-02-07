import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		esercizio();

	}
	
	public static void esercizio() {
		Set<String> parole = new HashSet<String>();
		Set<String> paroleDuplicate = new HashSet<String>();
		
		System.out.println("Specificare un numero intero:");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Specificare " + n + " parole.");
		
		for (int i = 0; i < n; i++) {
			String parola = sc.nextLine();
			if (parole.contains(parola)) {
				paroleDuplicate.add(parola);
			}
			parole.add(parola);
		}
		
		System.out.println("Parole distinte: " + parole);
		System.out.println("Numero parole distinte: " + parole.size());
		System.out.println("Parole duplicate: " + paroleDuplicate);
		
	}

}
