public class googoodan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1, j=2;
		int flag = 0;
		
		while(i<4)
		{
			while(j<8)
			{
				System.out.print(+j+ " * "+i+ " = " +(j*i)+ "\t");
				
				if(j%4==0)
				{
					System.out.println();
					break;
				}
				j++;
			}
			
			if(i!=3 && flag == 0)
			{
				i++;
				j=2;
			}
			
			else if(i==3 && flag == 0)
			{
				i=1;
				flag++;
				j=5;
				System.out.println();
			}
			
			else if(i!=3 && flag == 1)
			{
				i++;
				j=5;
				System.out.println();
			}
			
			else if(i==3 && flag ==1)
				break;
		}
		
		j=8;
		i=1;
		System.out.println("\n");
		
		while(i<4)
		{
			while(j<10)
			{
				System.out.print(+j+ " * "+i+ " = " +(j*i)+ "\t");
				j++;
			}
			
				i++;
				j=8;
				System.out.println();
			
		}
	}

}
