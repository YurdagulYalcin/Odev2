package odev2;

public class InstructorManager {
	public void createCourse(Course course) {
		System.out.println(course.getCourseName()+"adl� kurs ba�ar�yla olu�turuldu");
		
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.getCourseName()+"adl� kurs ba�ar�yla silindi");
		 
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.getCourseName()+"adl� kurs ba�ar�yla g�ncellendi");
		
		 
	}
	 
	
	
	
}
