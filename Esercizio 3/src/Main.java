import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	static Map<String, String> rubrica = new HashMap<String, String>();
	
	public static void main(String[] args) {
		addContact("Mario Rossi", "3281316070");
		addContact("Aldo Bianchi", "3471316780");
		addContact("Anna Verdi", "3286065095");
		addContact("Giovanni Verdi", "3285565099");

		printRubrica();
		
		deleteContact("Giovanni Verdi");
		
		printRubrica();
		
		searchByName("Mario Rossi");
		searchByNumber("3286065095");
	}
	
	public static void addContact (String nome, String numero) {
		rubrica.put(nome, numero);
		System.out.println("\n> " + nome + " è stat* aggiunt* alla rubrica.");
	}
	
	public static void deleteContact(String nome) {
		rubrica.remove(nome);
		System.out.println("\n> " + nome + " è stat* rimoss* dalla rubrica.");
	}
	
	public static void searchByNumber(String numero) {
		
		System.out.println( "\n- SEARCH BY NUMBER -" );
		
		if (rubrica.containsValue(numero)) {
			for (Entry<String, String> entry: rubrica.entrySet()) {
				if (entry.getValue().equals(numero)) {
					System.out.println( entry.getKey() + " --- tel: " + numero );
				}
			}
		} else {
			System.out.println("Il numero indicato non è presente.");
		}
		
	}
	
	public static void searchByName(String nome) {
		System.out.println( "\n- SEARCH BY NAME -" );
		
		if (rubrica.get(nome) != null) {
			System.out.println( nome + " --- tel: " + rubrica.get(nome) );
		} else {
			System.out.println("Il nome indicato non è presente.");
		}
	}
	
	public static void printRubrica() {
		System.out.println("\n- RUBRICA - ");
		
		for (Entry<String, String> entry: rubrica.entrySet()) {
			System.out.println( entry.getKey() + " --- tel: " + entry.getValue());
		}
	}

}
