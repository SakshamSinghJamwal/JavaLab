package oops;

class Student{
	private int id;
	private String name;
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}

public class abstractopp {
	Student s = new Student(108, "Ram");
	s.display();
}
