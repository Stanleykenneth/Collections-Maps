package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<Integer, String> meses = new HashMap<>();

		meses.put(1, "Janeiro");
		meses.put(2, "Fevereiro");
		meses.put(3, "Mar�o");
		meses.put(12, "Dezembro");

		System.out.println(meses);

		String m1 = meses.get(12);
		System.out.println(m1);

		Set<Integer> numeros = meses.keySet();// Retorna os n�meros dos meses.
		System.out.println(numeros);

		Collection<String> nomes = meses.values();// Retorna os nomes dos meses.
		System.out.println(nomes);

		// Representa o n�meros de pares de chaves e valor
		Set<Map.Entry<Integer, String>> entries = meses.entrySet();

		for (Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
