public  class EMPLOYEE {

	public String empname;
	public int empId;
	public String phone_no;
	public String emailaddress;
	
	public EMPLOYEE(String name, int empid,String ph_no,String email){
		name=empname;
		empid=empId;
		ph_no=phone_no;
		email=emailaddress;
		
	}
	public void show_details(){
		System.out.println("Show Details of the Employees");
	}
	public void calculate_salary(){
		
	System.out.println("Employee Salary");
	}
	public static void main(String[] args) {
		
	}
}