package model;

public class Service {
	private Emp emp;

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	public void getMsg() {
		String msg1 = emp.displayEmpInfo();
		System.out.println(msg1);
	}

}
