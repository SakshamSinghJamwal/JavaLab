package oops;

abstract class A{
	abstract void logic();
	abstract void logic2();
	//void login2() = 0 ->abstract method in c++
	void fun() {
		System.out.println("This is fun method");
	}
}

public class abstractop extends A{
	void logic() {
		System.out.println("Logic method");
	}
	void logic2() {
		System.out.println("Logic2 method");
	}
	public static void main(String[] args) {
		//A a = new A(); ->cannot make object of abstract class
		
	}
}
