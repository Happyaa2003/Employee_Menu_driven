import java.util.Scanner;
public class Name {
	
	private String Fname,Mname,Lname;
	int i=0;
	
	public Name() {
		this.Fname=null;
		this.Mname=null;
		this.Lname=null;
	}
	public Name(String Fname,String Mname,String Lname) {
		this.Fname=Fname;
		this.Mname=Mname;
		this.Lname=Lname;
	}
	public Name(Name N) {
		this.Fname=N.Fname;
		this.Mname=N.Mname;
		this.Lname=N.Lname;
	}
	//set
	public void setFname(String newF) {
		this.Fname=newF;
	}
	public void setLname(String newL) {
		this.Fname=newL;
	}
	public void setMname(String newM) {
		this.Fname=newM;
	}
	//get
	public String getFname() {
		return this.Fname;
	}
	public String getMname() {
		return this.Mname;
	}
	public String getLname() {
		return this.Lname;
	}
	

	public String toString() {
		i++;
		return i+"). "+getFname()+"/"+getMname()+"/"+getLname();
	}

}
