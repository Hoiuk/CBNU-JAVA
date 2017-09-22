import java.util.*;
public class gogodan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.print("숫자를 입력하시오 : ");
		num = scanner.nextInt();
		if(num <0 || num>9)
			System.out.println("잘못 입력하셨습니다.");
		else
			break;
		}	
		System.out.println(+num+" 단입니다.");
		
		for(int i =1;i<=9;i++)
			System.out.println(+num+ " * " +i+ " = " +num*i);
	}

}
