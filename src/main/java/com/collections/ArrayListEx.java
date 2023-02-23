package com.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import com.designPattern.dto.Student;
public class ArrayListEx {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Hari");
		names.add("Lucy");
		names.add(null);
		names.add("Hari");
		names.add("peter");
		names.add(2, "new data");
		/*
		 * for(int i=0;i<names.size();i++) { System.out.println(names.get(i)); }
		 */
		for(String temp:names) {
			System.out.println(temp);
		}
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(100);
		ll.add(101);
		System.out.println(ll.get(0));
		List<Student> students = new Vector<Student>();
		Student s1 = new Student();
		s1.setName("Hari");
		Student s2 = new Student();
		s2.setName("Peter");
		Student s3 = new Student();
		s3.setName("Ana");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		for(Student temp:students) {
			System.out.println(temp);
		}
	}

}
