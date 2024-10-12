import java.util.Scanner;

public class Manager extends FullTimeEmployee{
	
	private String CompanyCar;
	private int phone;
	
	Manager(){
		super();
		this.CompanyCar=null;
		this.phone=0;
	}
	Manager(Name name,Date DOB,String NIC,double salary,String CompanyCar,int phone){
		super(name,DOB,NIC,salary);
		this.CompanyCar=CompanyCar;
		this.phone=phone;
	}
	
	//get
		public String getCompanyCar() {
			return CompanyCar;
		}
		public int getPhone() {
			return phone;
		}
	//set
		public void setPhone(int newPhone) {
			this.phone=newPhone;
		}
		public void setCompanyCar(String newCompanyCar) {
			this.CompanyCar=newCompanyCar;
		}
		
	public String toString() {
		return super.toString()+"/"+getCompanyCar()+"/"+getPhone();
	}

}
