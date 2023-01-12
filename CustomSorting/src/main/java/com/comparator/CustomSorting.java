package com.comparator;

import java.util.TreeSet;

public class CustomSorting {

	public static void main(String[] args) {

		Employee e1=new Employee(10,"Komal","Stat");
		Employee e2=new Employee(20,"Aarti","Maths");
		Employee e3=new Employee(30,"Jyoti","English");
		Employee e4=new Employee(40,"Priyanka","Electrical");
		
		SortingId si=new SortingId();
		SortingDept sd=new SortingDept();
		SortingName sn=new SortingName();
		
		TreeSet set=new TreeSet(sd);
		set.add(e1);
		set.add(e4);
		set.add(e3);
		set.add(e2);
		
		System.out.println(set);
	}

}
