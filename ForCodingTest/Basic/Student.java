package Basic;

public class Student {
	
	private String name; // 맴버 변수는 99% 정도는 다 private로 생성하기
	private String no;
	
	
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	

}
