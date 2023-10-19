package labs.day2Lab.a;

public class Student {
	private String name;
	private GradeReport gradeReport;
	
	public Student(String name) {
		this.name = name;
		this.gradeReport = new GradeReport(this);
	}
	public GradeReport getGradeReport() {
		return this.gradeReport;
	}
	public String getName() {
		return this.name;
	}
}
