package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {

		//Créer une liste
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] a = { -1, 5, 7, 3, -2, 4, 8, 5 };
		//foreach
		for (Integer number : a) {
			list.add(number);
		}

		//Affichez tous les éléments de la liste
		System.out.println(list.toString());

		//Recherchez le plus grand élément de la liste
		System.out.println(Collections.max(list));

		
		//Supprimez le plus petit élément de la liste
		Collections.sort(list); //tri en ordre croissant 
		list.remove(0); //suppression de la position 0 car list en tri croissant 
		System.out.println(list.toString());
		
		//changer les valeurs négatives en positives et afficher le résultat
		for(int i =0; i<list.size(); i++) {
			System.out.print(Math.abs(list.get(i))+" ");
			
		}

	}

}
