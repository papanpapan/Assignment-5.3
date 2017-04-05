public class MANAGER extends EMPLOYEE {
	private String dept_Name;
	private int basic;
	public MANAGER(String name,int empid,String ph_no,String email){
		super(name,empid,ph_no,email);	
	basic = 50000;
	dept_Name="Manager";
	}
public void show_details(){
		System.out.println("Details of the Manager :");
	    System.out.println("POST:"+dept_Name);
}
	public void calculate_salary(){
		double Travel_Allowance=0.15*basic;
		double Total_Salary=basic+Travel_Allowance;
		System.out.println("Total Salary of the Manager is :"+Total_Salary);
	
	}
	
	public static void main(String[] args) {
	
	}

}