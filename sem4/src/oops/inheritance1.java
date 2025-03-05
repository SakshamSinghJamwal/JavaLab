package oops;

class A{
	A(){  //constructor, gets called when object of class created
		System.out.println("class A");
	}
	A(int a){ 
		System.out.println("class A one parameterized constructor");
	}
	void funA() {
		System.out.println("A class method !!");
	}
}

class B extends A{
	B(){
		// super() , number of parameters calls the desired constructor of A when defined accordingly
		System.out.println("B Class !!");
	}
	void funB() {
		System.out.println("B class method !!");
	}
}

public class inheritance1 {
	public static void main(String[] args) {
		A obj = new B();
	}
}

//we can only call parent class method using parent class reference variable.
//parent class reference variable can hold reference of child class object.
// B obj = new A() is incorrect but A obj = new B() is correct;