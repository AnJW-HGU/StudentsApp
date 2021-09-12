package com.example.lab2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		// Create arraylist of user-defined class objects
		List<Student> al = new ArrayList<Student>();
		
		System.out.println("Student List (ordered by name)");
		
		Student s1 = new Student(101, "Kim", 23);
		al.add(s1); // adding Student class object
		Student s2 = new Student(102, "Lee", 21);
		al.add(s2); // adding Student class object
		al.add(new Student(103, "An", 25));
		al.add(new Student(104, "Bae", 20));
		al.add(new Student(105, "Jung", 24));
		al.add(new Student(106, "Han", 28));
		al.add(new Student(107, "Choi", 21));
		al.add(new Student(108, "Kang", 29));
		al.add(new Student(109, "Jang", 26));
		al.add(new Student(110, "Yang", 27));
		
		Collections.sort(al);
		//Traverse elements of arraylist (method #1)
		for (Student s : al) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		//Traverse elements of arraylist (method #2)
		for (int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
