package Basic;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("손오공", "1638");
		Student st2 = new Student("사오정", "2638");
		Student st3 = new Student("삼정오", "3638");
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for (Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		while(true) {
			System.out.println("계속 검색하고 싶으면 : y, 종료를 원하면 : n");
			String input = sc.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = sc.next();
				boolean flg = false;
				// 아래와 같이 구현하여야 할 경우 boolean을 많이 사용한다. 
				// 선언을 false로 할지 true로 할지는 경우에 따라 다르다
				
				for (Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은 ? : " + stu.getNo()); 
						flg = true;
					}
				}
				if (!flg) {
					System.out.println("헤당하는 학생 이름이 없습니다.");
				}
				
				
			}else if (input.equals("n")){
				break;
			}
			
		}
		
		System.out.println("프로그램이 종료 되었습니다.");
		
		
	}

}
