package com.java.q;

class Training {
	
	String studentName;
	String trainerName;

	public Training(String studentName, String trainerName) {
		this.studentName = studentName;
		this.trainerName = trainerName;
	}

	@Override
	public String toString() {
		return "Training [studentName=" + studentName + ", trainerName=" + trainerName + "]";
	}
	
}

class SqlTraining extends Training {

	public SqlTraining(String studentName, String trainerName) {
		super(studentName, trainerName);
		// TODO Auto-generated constructor stub
	}
	
}
class TestingTraining extends Training {

	public TestingTraining(String studentName, String trainerName) {
		super(studentName, trainerName);
		// TODO Auto-generated constructor stub
	}
	
}
class JavaTraining extends Training {

	public JavaTraining(String studentName, String trainerName) {
		super(studentName, trainerName);
	}

}
public class Quiz2 {

	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new JavaTraining("Srinivas", "Prasanna"),
			new SqlTraining("Mahesh", "Nupur"),
			new TestingTraining("Madhu", "Shalini"),
			new JavaTraining("Ammar", "Prasanna"),
			new SqlTraining("Sanjana", "Nupur"),
			new TestingTraining("Neha", "Shalini"),
			new JavaTraining("Padma", "Prasanna"),
			new SqlTraining("Dhaval", "Nupur"),
			new TestingTraining("Alekhya", "Shalini"),
			new JavaTraining("Bhaveen", "Prasanna"),
			new SqlTraining("Srikar", "Nupur"),
			new TestingTraining("Madhu Keerthi", "Shalini"),
			new JavaTraining("Harshitha", "Prasanna"),
			
		};
		
		for (Training training : arr) {
			if (training instanceof JavaTraining) {
				System.out.println(training);
			}
		}
	}
}
