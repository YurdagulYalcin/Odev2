package odev2;

public class InstructorManager {
	public void createCourse(Course course) {
		System.out.println(course.getCourseName()+"adlı kurs başarıyla oluşturuldu");
		
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.getCourseName()+"adlı kurs başarıyla silindi");
		 
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.getCourseName()+"adlı kurs başarıyla güncellendi");
		
		 
	}
	 
	
	
	
}
