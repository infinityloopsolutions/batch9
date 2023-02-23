package com.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapEx {
	public static void main(String[] args) {
		Map<Integer,String> student = new HashMap<Integer,String>();
		student.put(101, "Karthi");
		student.put(102, "Abraham");
		student.put(101, "Brindha");
		student.put(103, "Abraham");
		student.put(null, null);
		student.put(104, "Jai");
		Set<Integer> rollno = student.keySet();
		for(Integer temp:rollno) {
			System.out.println(student.get(temp));
			}
		}
}
