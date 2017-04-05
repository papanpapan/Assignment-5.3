public class TESTEMP {
	public static void main(String[] args) {
		EMPLOYEE mgr=new MANAGER("Henriques",123,"8013207158","henriques123@gmail.com");
		mgr.show_details();
		System.out.println("NAME :"+mgr.empname);
		System.out.println("EMPLOYEE ID :"+mgr.empId);
		System.out.println("EMAIL ID :"+mgr.emailaddress);
		System.out.println("PHONE_NO :"+mgr.phone_no);
		mgr.calculate_salary();
		System.out.println("..................................................");
		EMPLOYEE tra=new TRAINEE("Micheal",345,"9007463481","michealcleark@gmail.com");
		tra.show_details();
		System.out.println("NAME :"+tra.empname);
		System.out.println("EMPLOYEE ID :"+tra.empId);
		System.out.println("EMAIL ID :"+tra.emailaddress);
		System.out.println("PHONE_NO :"+tra.phone_no);
		tra.calculate_salary();

	}

}
