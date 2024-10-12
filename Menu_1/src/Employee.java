import java.util.Scanner;

public class Employee {
	
	private Name name;
	private Date date;
	private String NIC;
	
	Employee(){
		this.name=new Name();
		this.date=new Date();
		this.NIC=null;
	}
	
	Employee(Name name,Date DOB,String NIC){
		this.name=name;
		this.date=DOB;
		this.NIC=NIC;
	}
	//get
	public Name getName() {
		return name;
	}
	public Date getDate() {
		return date;
	}
	public String getNIC() {
		return NIC;
	}
	//set
	public void setName(Name newName) {
		this.name=newName;
	}
	public void setDate(Date newDate) {
		this.date=newDate;
	}
	public void setNIC(String newNIC) {
		this.NIC=newNIC;
	}

	public String toString() {
		return name.toString()+"/"+
				date.toString()+
				"/"+getNIC();
	}
}
