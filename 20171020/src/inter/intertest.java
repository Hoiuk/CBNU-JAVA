package inter;

interface Inter
{
	public int a = 100;
	public final int b = 100;
	public abstract void method1();
	public void method2();
}

class Inter_t implements Inter
{
	public void method1()
	{
		System.out.println("�߻�޼ҵ�");
	}
	
	public void method2()
	{
		System.out.println("�߻�޼ҵ�");
	}
}

public class intertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter_t obj = new Inter_t();
		obj.method1();
		System.out.println("�������̽������� final�� ������� �ʾƵ� ������ final");
		System.out.println("�������̽������� final�� ������� �ʾƵ� �޼ҵ�� abstract");

	}

}
