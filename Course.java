package odev2;

public class Course {
	private double percentageOfCompletion;
	private String courseName;
	
public Course(int id,String courseName,String trainersName ,double percentageOfCompletion ) {
		
		this.courseName=courseName;
		this.id=id;
		this.percentageOfCompletion=percentageOfCompletion;
		this.trainersName=trainersName;
		
	}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getPercentageOfCompletion() {
	return percentageOfCompletion;
}

public String getCourseName() {
	return courseName;
}

public String getTrainersName() {
	return trainersName;
}

int id;
private String trainersName;

}
