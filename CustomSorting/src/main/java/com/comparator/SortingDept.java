package com.comparator;

import java.util.Comparator;

public class SortingDept implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return o1.dept.compareTo(o2.dept);
	}

}
