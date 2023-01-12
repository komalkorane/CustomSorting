package com.comparable;

public class Student implements Comparable{

	int roll;
	String name;
	String city;
	public Student(int roll, String name, String city) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + "]";
	}
	
	 public boolean equals(Object o) {
		 if(o == null) 
			 return false;
		 if(o instanceof Student) {
			Student s = (Student)o;
			if(roll==s.roll && name.equals(s.name) && city.equals(s.city))
				return true;
		 }
		 else
			 return false;
		 
		 return false;
	 }
	
	 public int compareTo(Object s) {
		 Student s1=(Student)s;
		 if(this.roll == s1.roll)
			 return 0;
		 else if(this.roll > s1.roll)
			 return 1;
		 else
			 return -1;
		 
		 
	 }
}
