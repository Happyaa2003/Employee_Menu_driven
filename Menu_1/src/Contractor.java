import java.util.Scanner;

public class Contractor extends Employee{
	private double HourlyRate;
	
	public Contractor() {
		super();
		this.HourlyRate=0.0;
	}
	public Contractor(Name name,Date DOB,String NIC,double HourlyRate) {
		super(name,DOB,NIC);
		this.HourlyRate=HourlyRate;
	}
	//get
			public double getHourlyRate() {
			return HourlyRate;
		}
	//set
			public void setHourlyRate(double newHourlyRate) {
			this.HourlyRate=newHourlyRate;
		}
	public String toString() {
		return super.toString()+"/"+getHourlyRate();
	}
	
}
