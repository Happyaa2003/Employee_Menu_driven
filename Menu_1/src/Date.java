import java.util.*;

public class Date {
	
	private int day,month,year;
	
	public Date() {
		this.day=0;
		this.month=0;
		this.year=0;
	}
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public Date(Date d) {
		this.day=d.day;
		this.month=d.month;
		this.year=d.year;
	}
	//set
	public void setDay(int newDay) {
		this.day=newDay;
	}
	public void setMonth(int newMonth) {
		this.month=newMonth;
	}
	public void setYear(int newYear) {
		this.year=newYear;
	}
	//get
	public int getDay(){
		return this.day;
	}
	public int getMonth(){
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	

	public String toString () {
		return getDay()+"/"+getMonth()+"/"+getYear() ;
	}
	

}
