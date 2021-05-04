package odev2;

public class Student extends User {
	
	public Student() {}
	
	private double courseCompletePercentage;
	private String takenOfCourses;
	
	public Student(double courseCompletePercentage, String takenOfCourses) {
		super();
		this.courseCompletePercentage = courseCompletePercentage;
		this.takenOfCourses = takenOfCourses;
	}

	public String getTakenOfCourses() {
		return takenOfCourses;
	}

	public void setTakenOfCourses(String takenOfCourses) {
		this.takenOfCourses = takenOfCourses;
	}

	public double getCourseCompletePercentage() {
		return courseCompletePercentage;
	}
	
	public double setCourseCompletePercentage(double CourseCompletePercentage ) {
		return courseCompletePercentage;
	}

	 
		 
		
	 

}
