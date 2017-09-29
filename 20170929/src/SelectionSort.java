
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {20, 30, 40, 50, 10};
		int i, j, temp, least;
		System.out.println("정렬 전");
		for(i=0; i<test.length;i++)
			System.out.println((i+1)+"번째 데이터" + test[i]);
		
		System.out.println("=============================");
		System.out.println("=============================");
		
		for(i=0;i<test.length-1;i++) {
			least = test[i];
			for(j=i+1;j<test.length;j++) {
				if(least>test[j])
				{
					least = test[j];
					temp = test[j];
					test[j] = test[i];
					test[i] = temp;
				}
			}
		}
		
		System.out.println("정렬 후");
		for(i=0; i<test.length;i++)
			System.out.println((i+1)+"번째 데이터" + test[i]);
	}

}
