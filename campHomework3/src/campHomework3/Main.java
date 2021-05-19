package campHomework3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1,"Engin", "Demiroğ", "engindemirog@gmail.com",123456,"Java","Certificates: MCT,PMP,ITIL");
		Instructor instructur2 = new Instructor(2,"Ayşe","Esenoğlu","ayşea@gmail.com",45678,"Python","Intern");
		Student student1 = new Student(20211,"Buse","Biltekin","busebiltekin@gmail.com",1234567,"Java");
		Student student2 = new Student(20212,"Ali","Ay","alia@gmail.com",56789,"C#");
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student1) ;
		studentManager.join(student2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.assign(instructur2);
	}

}
