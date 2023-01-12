package com.comparable;

import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {

		Student s1 = new Student(10, "Shree", "Kolhapur");
		Student s2 = new Student(20, "Komal", "Mumbai");
		Student s3 = new Student(30, "Arati", "Pune");
		Student s4 = new Student(90, "Sayli", "Nagpur");
		Student s5 = new Student(46, "Jyoti", "Gargoti");
		
		TreeSet t = new TreeSet();
		t.add(s3);
		t.add(s1);
		t.add(s4);
		t.add(s2);
		t.add(s5);
		
		System.out.println(t);
		
	}

}
