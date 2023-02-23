package com.collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetEx {
	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();
		names.add("Hari");
		names.add("Lucy");
		names.add("Hari");
		names.add(null);
		names.add("peter");
		names.add("Abraham");		
		for(String name:names) {
			System.out.println(name);
		}

	}
}
