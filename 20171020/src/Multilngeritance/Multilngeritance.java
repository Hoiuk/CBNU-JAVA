package Multilngeritance;

interface Inter1
{
	public int a = 100;
	public abstract void method1();
}

interface Inter2
{
	public int b = 100;
	public abstract void method2();
}

public class Multilngeritance implements Inter1, Inter2{

	public void method1() {
		System.out.println("Inter1�� �޼ҵ�");
	}
	
	public void method2() {
		System.out.println("Inter2�� �޼ҵ�");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilngeritance obj = new Multilngeritance();
		System.out.println("Inter1�� a=" + Multilngeritance.a);
		System.out.println("Inter2�� b=" + Multilngeritance.b);
		obj.method1();
		obj.method2();


	}

}
