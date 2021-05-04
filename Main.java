package odev2;

 

public class Main {

	public static void main(String[] args) {
		
		
		Course course1=new Course(1,"C#","Engin Demiroğ",47);
		Course course2=new Course(2,"Java&React","Engin Demiroğ",56);
		Course course3=new Course(3,"programlama temelleri","Engin Demiroğ",17);
		 
		 
		 Course[] course= {course1,course2,course3};
		 for(Course c: course) {
			 System.out.println(c.getCourseName());
		 }

		 InstructorManager ınstructorManager= new InstructorManager();
		 ınstructorManager.createCourse(course1);
		 ınstructorManager.createCourse(course2);
		 ınstructorManager.createCourse(course3);
		 
		 ınstructorManager.deleteCourse(course3);
		 ınstructorManager.updateCourse(course1);
		 
		 
		 Student student1 =new Student();
		 student1.setId(1);
		 student1.setName("yurda");
		 student1.setEmail("yrdglnzlcn@gmail.com");
		 student1.setPhoneNumber("555487");
		 student1.setTakenOfCourses("nitelikli yazılım geliştirici kampı");
		 student1.setCourseCompletePercentage(10);
		 
		 
		 Student student2=new Student();
		 student2.setId(2);
		 student2.setName("gül");
		 student2.setEmail("yrdglksd..com");
		 student2.setPhoneNumber("46516");
		 student2.setTakenOfCourses("nitelikli yazılım geliştirici kampı");
		 student2.setCourseCompletePercentage(10);
		 
		 Student[] stude= {student1,student2};
		 for(Student sd: stude) {
			 System.out.println(sd.getName());
		 }
		 
		 
	}

}
