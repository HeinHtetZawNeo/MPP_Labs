package labs.day2Lab.a;

public class GradeReport {
	private Student student;
	private String gpa;
	
	GradeReport(Student std) {
		this.student = std;
	}
	public String getGPA() {
		return this.gpa;
	}
	
	public void setGPA(String gpa) {
		this.gpa = gpa;
	}
	public Student getStudent() {
		return this.student;
	}
}
