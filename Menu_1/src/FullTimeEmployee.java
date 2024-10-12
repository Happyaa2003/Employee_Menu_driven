import java.util.*;
public class FullTimeEmployee extends Employee{
	private double salary;
	
	public FullTimeEmployee() {
		super();
		this.salary=0.0;
	}
	public FullTimeEmployee(Name name,Date DOB,String NIC,double salary) {
		super(name,DOB,NIC);
		this.salary=salary;
	}
	//get
		public double getSalary() {
		return salary;
	}
	//set
		public void setSalary(double newSalary) {
		this.salary=salary;
	}
	public String toString() {
		return super.toString()+"/"+getSalary();
	}

	
}
