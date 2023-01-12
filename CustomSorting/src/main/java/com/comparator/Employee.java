package com.comparator;

import java.util.Objects;

public class Employee {

	Integer id;
	String name;
	String dept;

	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			if (id == e.id && name.equals(e.name) && dept.equals(e.dept))
				return true;
		} else
			return false;

		return false;
	}

	public int hashCode() {
		return Objects.hash(id, name, dept);
	}

}
