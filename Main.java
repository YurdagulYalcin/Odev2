package odev2;

 

public class Main {

	public static void main(String[] args) {
		
		
		Course course1=new Course(1,"C#","Engin Demiro�",47);
		Course course2=new Course(2,"Java&React","Engin Demiro�",56);
		Course course3=new Course(3,"programlama temelleri","Engin Demiro�",17);
		 
		 
		 Course[] course= {course1,course2,course3};
		 for(Course c: course) {
			 System.out.println(c.getCourseName());
		 }

		 InstructorManager �nstructorManager= new InstructorManager();
		 �nstructorManager.createCourse(course1);
		 �nstructorManager.createCourse(course2);
		 �nstructorManager.createCourse(course3);
		 
		 �nstructorManager.deleteCourse(course3);
		 �nstructorManager.updateCourse(course1);
		 
		 
		 Student student1 =new Student();
		 student1.setId(1);
		 student1.setName("yurda");
		 student1.setEmail("yrdglnzlcn@gmail.com");
		 student1.setPhoneNumber("555487");
		 student1.setTakenOfCourses("nitelikli yaz�l�m geli�tirici kamp�");
		 student1.setCourseCompletePercentage(10);
		 
		 
		 Student student2=new Student();
		 student2.setId(2);
		 student2.setName("g�l");
		 student2.setEmail("yrdglksd..com");
		 student2.setPhoneNumber("46516");
		 student2.setTakenOfCourses("nitelikli yaz�l�m geli�tirici kamp�");
		 student2.setCourseCompletePercentage(10);
		 
		 Student[] stude= {student1,student2};
		 for(Student sd: stude) {
			 System.out.println(sd.getName());
		 }
		 
		 
	}

}
