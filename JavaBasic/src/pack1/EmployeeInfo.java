package pack1;

public class EmployeeInfo {
	
	static int id;
	static String firstName;
	static String lastName;
	static String dob;

	public static void main(String[] args) {
		
		EmployeeInfo employee = new EmployeeInfo();
		employee.id=231;
		employee.firstName="srinivas";
		employee.lastName="edara";
		employee.dob="14/2/2000";

		EmployeeInfo employee1 = new EmployeeInfo();
		employee1.id=2123;
		employee1.firstName="sri";
		employee1.lastName="ed";
		employee1.dob="14/3/2019";
	}

}
