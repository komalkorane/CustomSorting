package com.comparator;

import java.util.Comparator;

public class SortingName implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}

}
