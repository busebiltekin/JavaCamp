package campHomework3;

public class InstructorManager extends UserManager{
	
	public void assign(Instructor instructor) {
		System.out.println(instructor.getLastName() +" "+ instructor.getGivenCourse() + " kursuna atandý");
		
	}

}
