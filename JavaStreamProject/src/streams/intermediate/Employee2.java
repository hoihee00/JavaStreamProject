package streams.intermediate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

enum Gender {
	MALE, FEMALE; // 열거형
}

public class Employee2 {
	String name;
	Gender gender;
	LocalDate dateOfBirth;
	double income;
	
	public Employee2(String name, Gender gender, LocalDate dateOfBirth, double income) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	
	public boolean isMale() {
		return this.gender == Gender.MALE;
	}
	
	public boolean isFemale() {
		return this.gender == Gender.FEMALE;
	}

	@Override
	public String toString() {
		String str = String.format("(%s, %s, %s, %.2f)", name, gender, dateOfBirth, income);
		return str;
	}
	
	public static List<Employee2> employees(){
		Employee2 e1 = new Employee2("Hong", Gender.MALE, LocalDate.of(1991, Month.JANUARY, 1), 2343.0);
		Employee2 e2 = new Employee2("Kim", Gender.FEMALE, LocalDate.of(1992, Month.AUGUST, 13), 7100.0);
		Employee2 e3 = new Employee2("Han", Gender.MALE, LocalDate.of(1993, Month.APRIL, 16), 1300.0);
		Employee2 e4 = new Employee2("Choi", Gender.MALE, LocalDate.of(1994, Month.FEBRUARY, 3), 5555.0);
		Employee2 e5 = new Employee2("Lee", Gender.FEMALE, LocalDate.of(1995, Month.OCTOBER, 22), 2750.0);
		Employee2 e6 = new Employee2("Jeong", Gender.FEMALE, LocalDate.of(1996, Month.NOVEMBER, 23), 3402.0);
		List<Employee2> employees = Arrays.asList(e1, e2, e3, e4, e5, e6);
		return employees;
	}
	
	
	
}
