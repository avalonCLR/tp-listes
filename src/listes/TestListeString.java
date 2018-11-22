package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class TestListeString {

	public static void main(String[] args) {

		
		//creates an ArrayList with Strings
		ArrayList<String> list = new ArrayList<String>();
		String[] villes = {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};

		list.addAll(Arrays.asList(villes));
		System.out.println(list.toString());
		
		//get city in the list with biggest number of char
		String max = Collections.max(list, Comparator.comparing(s -> s.length()));
		System.out.println(max);
	
		
		//put the list to uppercase
		list.replaceAll(String::toUpperCase);
		System.out.println(list.toString());
		
		//remove cities starting with N
		//calling the ListIterator
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()) {
			String myVille = it.next();
			if(myVille.startsWith("N")) {
				it.remove();
			}	
		}
		System.out.println(list);
		
		
		
	}

}
