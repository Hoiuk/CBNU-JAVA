import java.util.*;
public class gogodan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		num = scanner.nextInt();
		if(num <0 || num>9)
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		else
			break;
		}	
		System.out.println(+num+" ���Դϴ�.");
		
		for(int i =1;i<=9;i++)
			System.out.println(+num+ " * " +i+ " = " +num*i);
	}

}
