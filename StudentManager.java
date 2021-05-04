package odev2;

public class StudentManager {
	public void addMultiple(Course[] course) {
		for(Course cr: course) {
			add(cr.getCourseName()+"kurs eklendi");
		}
		
		
	}

	private void add(String string) {
		 
		
	}
	
	public void delete(Course course) {
		delete(course.getCourseName()+"adlý kursunuz silinmiþtir.");
		
	}

	private void delete(String string) {
		 
		
	}
	
}
