package labs.day2Lab.aMain;

import labs.day2Lab.a.GradeReport;
import labs.day2Lab.a.Student;

public class main {

	public static void main(String[] args) {
		Student student1 = new Student("Mr.A");
		GradeReport student1GradeReport = student1.getGradeReport();
		student1GradeReport.setGPA("4.5");
		
		System.out.println("Student Name "+student1.getName());
		System.out.println("Student GPA "+student1.getGradeReport().getGPA());
		
		System.out.println("GP side of Student Name "+student1GradeReport.getStudent().getName());
	}

}