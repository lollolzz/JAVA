
public class AuthApp3 {

	public static void main(String[] args) {
		
		// 3명의 데이터를 가지고 있는 배열 생성
		String [] users = {"egoing", "jinhuck", "youbin"};
		String inputId = args[0];
		
		boolean isLogined = false;
		for(int i =0; i<users.length; i++) {
			String currentUserId = users[i];
			if(currentUserId.equals(inputId)) {
				isLogined = true;
				break;
			}
		}
		
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master!!");
		}else {
			System.out.println("Who are you?");
		}
		
		

	}

}
