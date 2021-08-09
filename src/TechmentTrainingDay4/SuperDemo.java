package TechmentTrainingDay4;

class Parent{
	int a=10;
}

class Child extends Parent{
	int b=20;
	int a =30;
	void sum() {
		int a=5;
		int c = a+a;
		int d = super.a+this.a+a;
		System.out.println("sum" + c);
		System.out.println("sum" + d);
	}
}




public class SuperDemo {
	public static void main(String[] args) {
		Child  num = new Child();
		num.sum();
}
}