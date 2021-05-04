package odev2;

public class Instructor extends User {
	
	public Instructor() {
		
	}
	
	private String instructorNum;

	public String getInstructorNum() {
		return instructorNum;
	}

	public void setInstructorNum(String instructorNum) {
		this.instructorNum = instructorNum;
	}

	public Instructor(String instructorNum) {
		super();
		this.instructorNum = instructorNum;
	}
	
}
