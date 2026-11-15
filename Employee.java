import java.time.LocalDate;

public class Employee extends StaffMember {


	private String empNo;
	private String departmentName;

	public Employee(String first_Name, String last_Name, LocalDate date_of_Birth, Address address, String mobile_Number,String personal_Email, String work_Email) {
		super(first_Name, last_Name, date_of_Birth, address, mobile_Number, personal_Email, work_Email);

	}

	double Pay() {
		return 0;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", departmentName=" + departmentName + "]";
	}
	
	

}
