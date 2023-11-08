package homework;

public class AccessModifierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
class Student{
	//접근제어자 : public, private, protected, default
	public int studentID;
	private String studentName;
	int score;
	protected String majorCode;
	
	public String getStudentName() {
		return studentName
	}
				public void setStudentName(String studnetName) {
					if(studentName.length( >50)  {
						this.studentName = studentName;
						
			
		}else {
			System.out.println("50글자 넘게 설정할 수 없습니다.");
		}
	}
	
	
}
public class AccessModifierTest {
	public static void main (String[]args) {
		Student kim = new Student ();
		kim.studentID= 1001;
		kim.setStudentName= ("김유신");
		
		System.out.println(kim.getStudentName());
		kim.score = 100;
		System.out.println(kim.score);
		
	}
}
	}

}
