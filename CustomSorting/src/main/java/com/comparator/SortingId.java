package com.comparator;

import java.util.Comparator;

public class SortingId implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		
		return o1.id.compareTo(o2.id);
	}

	
	
}
