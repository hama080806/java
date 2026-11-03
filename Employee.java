public class Employee {

	private String empNo;
	private String departmentName;

	Employee(String empn, String depName) {
		empNo = empn;
		departmentName = depName;
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
