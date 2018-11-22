package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class TestVille extends Ville {

	public TestVille(String nom, int nbHabitants) {
		super(nom, nbHabitants);
	}

	
	public static void main(String[] args) {
		
		//create ArrayList of objects
		Ville[] villes = new Ville[8];
		
		ArrayList<Ville> list = new ArrayList<Ville>();
		list.add(new Ville("Nice", 343000));
		list.add(new Ville("Carcassonne", 47800));
		list.add(new Ville("Narbonne", 53400));
		list.add(new Ville("Lyon", 484000));
		list.add(new Ville("Foix", 9700));
		list.add(new Ville("Pau", 77200));
		list.add(new Ville("Marseille", 850700));
		list.add(new Ville("Tarbes", 40600));
	
		System.out.println(list.toString());
		
		
		//find most populated city
		Ville max = Collections.max(list, Comparator.comparing(s->s.getNbHabitants()));
		System.out.println(max);
		
		//find less populated city
		Ville min = Collections.min(list, Comparator.comparing(s->s.getNbHabitants()));
		System.out.println(min);
		
		
		//sort ArrayList of objects by values of int in objects
		Collections.sort(list,new Comparator<Ville>() {
			@Override
			public int compare(Ville o1, Ville o2) {
				return Integer.compare(o1.getNbHabitants(), o2.getNbHabitants());
			}
		});
		
		//remove object at index 0 (lower value)
		list.remove(0);
		System.out.println(list.toString());
		
		//change string to uppercase if int >100 000 in object from ArrayList
		for (Ville v : list) {
			if(v.getNbHabitants()>100000) {
				v.setNom(v.getNom().toUpperCase());
			}
		}
		System.out.println(list.toString());
		
		
	}

	
	
	
}
