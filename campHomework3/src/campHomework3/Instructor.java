package campHomework3;

public class Instructor extends User{
	
	private String givenCourse;
	private String detail;
	
	
	public Instructor(int id, String firstName, String lastName, String email, int password,
			String givenCourse, String detail){
		super (id, firstName, lastName, email, password);
		this.givenCourse = givenCourse;
		this.detail = detail;
	}
	
	
	public String getGivenCourse() {
		return givenCourse;
	}
	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}


}
