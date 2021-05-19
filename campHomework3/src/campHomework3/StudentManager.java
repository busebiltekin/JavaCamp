package campHomework3;

public class StudentManager extends UserManager{
	
	public void join (Student student) {
		System.out.println(student.getId() +" "+ student.getTakenCourse() + " kursuna katıldı");
	}

}
