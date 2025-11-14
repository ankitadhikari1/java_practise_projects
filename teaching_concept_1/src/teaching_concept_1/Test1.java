package teaching_concept_1;


class A{
	public void func() {
		System.out.println("this is a coffee");
	}
}

class B extends A{
	public void func() {
		System.out.println("this is a coffee B");
	}
}


class C extends A{
	public void func() {
		System.out.println("this is a coffee C");
	}
}


class D extends A{
	public void func() {
		System.out.println("this is a coffee D");
	}
}


class Order{
	
	private A obj ;
	
	
	public void makeCoffee(A obj1) {
		obj = obj1;
		obj.func();
	}
}


public class Test1 {
	public static void main(String Args[]) {
		Order obj = new Order();
		obj.makeCoffee(new D());
		
		
	}
}
