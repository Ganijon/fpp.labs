package lesson03.lab31;

import java.util.*;

public class Employee {

	public Employee(String name, String nickName, double salary, 
			int year, int month, int day) {
		
		this.name = name;
		this.nickName = nickName;
		this.salary = salary;
		hireDay = new GregorianCalendar(year, month - 1, day).getTime();
	}

	public String getName() {
		return name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String aNickName) {
		nickName = aNickName;
	}

	public double getSalary() {
		return salary;
	}

	// needs to be improved
	public Date getHireDay() {
		return (Date)hireDay.clone();
	}

	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private Date hireDay;

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	private String format = "name = %s, salary = %.2f, hireDay = %s";

	public String toString() {
		return String.format(format, name, salary, Util.dateAsString(hireDay));
	}
}