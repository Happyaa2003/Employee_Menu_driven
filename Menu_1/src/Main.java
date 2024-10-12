import java.util.*;
public class Main {
	
	static Scanner scan =new Scanner(System.in);
	
	private static ArrayList<Employee> emps=new ArrayList<>();
	
	public static void main(String[] args) {
		//complete
		while(true) {
			mainMenu();
			int op=getMenuOption();
			switch(op) {
				case 1:chooseEmpType();break;
				case 2:AllprintEmp();break;
				case 3:GivenprintEmp();break;
				case 4:
					System.out.println("Exiting...");
					System.exit(0);break;
				default:
					System.out.println("Invalid Option.ReTry");
						
			}
			System.out.println("################################\n\n");
		}
	}
	
	public static void mainMenu() {
		//complete
		System.out.println("Employee Application\n\n"+
							"[1]. Add New Employee\n"+
							"[2]. Print All\n"+
							"[3]. Print Given Employee\n"+
							"[4]. Exit\n");
	}
	
	public static int getMenuOption() {
		//complete
		System.out.println("Input Option  :   ");
		
		int option=scan.nextInt();
		return option;
	}
	
	public static void AllprintEmp() {
		if(emps.isEmpty()) {
			System.out.println("No Record Inserted");
		}else {
			System.out.println("All Inserted Employees");
			for(Employee emp:emps) {
				System.out.println(emp.toString());
			}
		}
	}
	public static void GivenprintEmp() {
		System.out.println("Input NIC Search Employee :: ");
		scan.nextLine();
		String SearchNIC=scan.nextLine();
		
		for(Employee emp:emps) {
			
			if(emp.getNIC()==SearchNIC) {
				System.out.println("Founded Employee ::"+emp.toString());
			}
		}
		
	}
	public static void chooseEmpType() {
		
		System.out.println("\n1.Add Full Time Employee"+
						   "\n2.Add Manager"+
						   "\n3.Add Contractor");
		System.out.print("Add Option  ::  ");
		int addOp=scan.nextInt();
		
		switch(addOp) {
		case 1:addFulltimeEmployee();break;
		case 2:addManager();break;
		case 3:addContractor();break;
		default:
			System.out.println("Wrong option.");break;
		}
	}
		public static Employee inputEmpDetail() {
			//complete
			
			System.out.print("F Name  :: ");
			scan.nextLine();
			String fname=scan.nextLine();
			System.out.print("M Name  :: ");
			String mname=scan.nextLine();
			System.out.print("L Name  :: ");
			String lname=scan.nextLine();
			
				Name Nobj=new Name(fname,mname,lname);
			
			System.out.print("Input Day   : ");
			int day=scan.nextInt();
			System.out.print("Input month : ");
			int month=scan.nextInt();
			System.out.print("Input year  : ");
			int year=scan.nextInt();
			
				Date Dobj=new Date(day,month,year);
			
			System.out.print("NIC  :: ");
			scan.nextLine();
				String NIC=scan.nextLine();
			
			return new Employee(Nobj,Dobj,NIC);
			
		}
		
		public static void addFulltimeEmployee() {
			
			 System.out.println("\nEnter Full-Time Employee Details:");
			 Employee Eobj=inputEmpDetail();
			 
			 System.out.print("Salary  :  ");
			 double salary=scan.nextDouble();
			 FullTimeEmployee FullEmp=new FullTimeEmployee(Eobj.getName(),Eobj.getDate(),Eobj.getNIC(),salary);
			 emps.add(FullEmp);
		}
		public static void addManager() {
			 System.out.println("\nEnter Manager Details:");
			 Employee Eobj=inputEmpDetail();
			 
			 System.out.print("Salary  :  ");
			 double salary=scan.nextDouble();
			 System.out.print("Company Car  ::  ");
			 scan.nextLine();
			 String company=scan.nextLine();
			 System.out.print("Phone   ::  ");
			 int phone=scan.nextInt();
			 
			 Manager MEmp=new Manager(Eobj.getName(),Eobj.getDate(),Eobj.getNIC(),salary,company,phone);
			 emps.add(MEmp);
		}
		public static void addContractor() {
			 System.out.println("\nEnter Contractor Details:");
			 Employee Eobj=inputEmpDetail();
			 System.out.print("HourlyRate  : ");
			 double Hrate=scan.nextDouble();
			 
			 Contractor CEmp=new Contractor(Eobj.getName(),Eobj.getDate(),Eobj.getNIC(),Hrate);
			 emps.add(CEmp);
		}
		


}