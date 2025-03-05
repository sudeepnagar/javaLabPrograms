package StreamAPI_4March;

import java.util.*;
import java.util.stream.Collectors;

class Student{
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	/**
	 * @return the years_of_study
	 */
	public int getYears_of_study() {
		return years_of_study;
	}

	/**
	 * @param years_of_study the years_of_study to set
	 */
	public void setYears_of_study(int years_of_study) {
		this.years_of_study = years_of_study;
	}

	private String name;
	private String gender;
	private String department;
	private double gpa;
	private int years_of_study;
	
	public Student(String name, String gender, String department, double gpa, int years_of_study) {
		super();
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.gpa = gpa;
		this.years_of_study = years_of_study;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", department=" + department + ", gpa=" + gpa
				+ ", years_of_study=" + years_of_study + "]";
	}
	
}

class StudentManagement{
	private static List<Student> students;
	
	private static void addStudent(String name,String gender,String department,double gpa, int years_of_study) {
		students.add(new Student(name,gender,department,gpa, years_of_study));
	}
	
	private static void listAllStudents() {
		System.out.println(students);
	}
	
	private static void sortStudentByGpa() {
		System.out.println(students.stream().sorted(Comparator.comparingDouble(Student::getGpa)));
				
	}
	private static void findTopGpaByDepartment() {
		System.out.println(students.stream().max(Comparator.comparingDouble(Student::getGpa)));
	}
	
	private static void categorizedAndPrintTopGpa() {
		if(students.isEmpty()) {
			throw new NoSuchElementException("No students available to categorize.");
		}
		 Map<String, Map<String, Optional<Student>>> topStudents = students.stream()
		            .collect(Collectors.groupingBy(
		                Student::getGender,
		                Collectors.groupingBy(
		                    Student::getDepartment,
		                    Collectors.reducing((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2)
		                )
		            ));
		 topStudents.forEach((gender, departmentMap) -> {
	            departmentMap.forEach((department, studentOptional) -> {
	                studentOptional.ifPresent(student -> 
	                    System.out.println("Top GPA in " + department + " for " + gender + ": " + student.getName() + " with GPA " + student.getGpa())
	                );
	            });
	        });
	}
	
	private static void getAverageGpaByDepartment() {
		if (students.isEmpty()) {
            System.out.println("No students available to calculate average GPA.");
            return;
        }
		Map<String, Double> averageGpaByDepartment = students.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.averagingDouble(Student::getGpa)));
		
		averageGpaByDepartment.forEach((department,averageGpa)->
		          System.out.println("Average GPA in "+ department +": "+ averageGpa)
				);
	}
	
	private static void getTopNExperiencedStudetnts(int n) {
		if(n<=0||students.stream().count()>n) {
			throw new IllegalArgumentException("Invalid number..");
		}
		
	}
	
}

public class StudentInstituteManangementSystem {

	public static void main(String[] args) {
		
	}

}
