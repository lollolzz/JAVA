package Basic;

public class Fibonaccinumbers {

	public static void main(String[] args) {
		
		
		// 피보나치 수열 배열을 사용한 경우 
		
		int arr[] = new int[100];
		
		// An = An-1 + An-2; n>=3(시작 조건) 
		// a1 = 1, a2= 1로 초기화 시켜두고 진행 ! 
		
		arr[1] = 1;
		arr[2] = 1;
		
		 for(int i =3; i<100; i++) {
			 arr[i] = arr[i-1] + arr[i-2];
		 }
		 
		 for (int i = 1; i <= 10; i++) {
			 System.out.print(arr[i]+" ");	 
		 }
		 
		 
		 // 피보나치 수열 
		// An = An-1 + An-2; n>=3(시작 조건) 
		// a1 = 1, a2= 1로 초기화 시켜두고 진행 !
		 
		System.out.println();
		
		int prevPrevNum = 1;
		int prevNum = 1;
		System.out.print(prevPrevNum + " ");
		System.out.print(prevNum + " ");
		
		for (int i = 3; i<=10; i++) {
			int nNum = prevPrevNum + prevNum;
			System.out.print(nNum + " ");
			
			prevPrevNum = prevNum;
			prevNum = nNum;
			
			
		}
		  
		
		

	}

}
