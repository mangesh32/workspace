package Nugget_8;

import java.sql.Date;

public class Employee {
	private int eno,mgr,deptno;
	private String eName,job;
	private Date HireDate;
	private double sal,comm;
	
	public Employee() {
		super();
		this.eno = 0;
		this.mgr = 0;
		this.deptno = 0;
		this.eName = null;
		this.job = null;
		HireDate = null;
		this.sal = 0;
		this.comm = 0;
	}
	
	public Employee(int eno,String eName,String job,int mgr,Date hireDate, double sal, double comm, int deptno) {
		super();
		this.eno = eno;
		this.mgr = mgr;
		this.deptno = deptno;
		this.eName = eName;
		this.job = job;
		this.HireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHireDate() {
		return HireDate;
	}

	public void setHireDate(Date hireDate) {
		HireDate = hireDate;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}
	
	
	
}
