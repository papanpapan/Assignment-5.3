public class TRAINEE extends EMPLOYEE {
	private String dept_Name;
	private int basic;
	public TRAINEE(String name,int empid,String ph_no,String email){
		super(name,empid,ph_no,email);
		
		
	basic = 30000;
	dept_Name="Trainee";
	}
public void show_details(){
		System.out.println("Details of the Trainee :");
	    System.out.println("POST:"+dept_Name);
}
	public void calculate_salary(){
		double Travel_Allowance=0.10*basic;
		double Total_Salary=basic+Travel_Allowance;
		System.out.println("Total Salary of the Manager is :"+Total_Salary);
}
	public static void main(String[] args) {
		

	}
}