package Nugget_8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBops {

	static Connection con;
	static PreparedStatement ps;
	static ResultSet rs;
	static Scanner in;
	
	public static void setUpTable(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/java_501", "root", "root");
			ps=con.prepareStatement("create table emp "
									+ "(empno int(4) not null,"
									+ "ename varchar(20),"
									+ "job varchar(9),"
									+ "mgr int(4),"
									+ "hiredate date,"
									+ "sal double(7,2),"
									+ "comm double(7,2),"
									+ "deptno int(2)"
									+ ");");
			
			ps.executeUpdate();
			System.out.println("Succesfully Created.");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Creation Falied.\n"+e.getMessage());
		}
		
	}
	
	public static void insert(Employee e){
		try {
			ps=con.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, e.getEno());
			ps.setString(2, e.geteName());
			ps.setString(3, e.getJob());
			ps.setInt(4,e.getMgr());
			ps.setDate(5, e.getHireDate());
			ps.setDouble(6, e.getSal());
			ps.setDouble(7, e.getComm());
			ps.setInt(8,e.getDeptno());
			ps.executeUpdate();			
			
		} catch (SQLException ex) {
			System.out.println("Insertion Failed.\n"+ex.getMessage());
		}
		
	}
	
	public static void displayTop5(){
		try {
			ps=con.prepareStatement("select * from emp limit 5;");
			rs=ps.executeQuery();
			System.out.println("-------------------------------------------TOP 5 Records---------------------------------------------");
			showline();
			tableHeader();
			showline();
			while(rs.next()){
				System.out.println(String.format("| %-5s",rs.getString(1))+" "+
						String.format("| %-20s",rs.getString(2))+" "+
						String.format("| %-9s",rs.getString(3))+" "+
						String.format("| %-4s",rs.getString(4))+" "+
						String.format("| %-10s",rs.getString(5))+" "+
						String.format("| %-10s",rs.getString(6))+" "+
						String.format("| %-10s",rs.getString(7))+" "+
						String.format("| %-6s",rs.getString(8))+" "+
						"|"
						);
			}
			showline();
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
		} catch (SQLException e) {
			System.out.println("displayTop5 failed to execute.\n"+e.getMessage());
		}
		
	}

	private static void tableHeader() {
		System.out.println(String.format("| %-5s","EmpNo")+" "+
				String.format("| %-20s","EName")+" "+
				String.format("| %-9s","JOB")+" "+
				String.format("| %-4s","MGR")+" "+
				String.format("| %-10s","HireDate")+" "+
				String.format("| %-10s","SAL")+" "+
				String.format("| %-10s","COMM")+" "+
				String.format("| %-6s","DeptNo")+" "+
				"|"
				);
		
	}

	private static void showline() {
		System.out.print("+");
		for(int i=0;i<5+2;i++)System.out.print("-");
		System.out.print("+");
		for(int i=0;i<20+2;i++)System.out.print("-");
		System.out.print("+");
		for(int i=0;i<9+2;i++)System.out.print("-");
		System.out.print("+");
		for(int i=0;i<4+2;i++)System.out.print("-");
		System.out.print("+");
		for(int i=0;i<10+2;i++)System.out.print("-");
		System.out.print("+");
		for(int i=0;i<10+2;i++)System.out.print("-");
		System.out.print("+");
		for(int i=0;i<10+2;i++)System.out.print("-");
		System.out.print("+");
		for(int i=0;i<6+2;i++)System.out.print("-");
		System.out.println("+");	
	}

	public static void insert10(){
		try(BufferedReader br=new BufferedReader(new FileReader("emp.txt"))){
			while(br.ready()){
				String[] arr=br.readLine().split(" ");
				Employee e=new Employee();
				e.setEno(Integer.parseInt(arr[0]));
				e.seteName(arr[1]);
				e.setJob(arr[2]);
				e.setMgr(Integer.parseInt(arr[3]));
				e.setHireDate(Date.valueOf(arr[4]));
				e.setSal(Double.parseDouble(arr[5]));
				e.setComm(Double.parseDouble(arr[6]));
				e.setDeptno(Integer.parseInt(arr[7]));
				DBops.insert(e);		
			}
			displayAll();
						
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
	}

	
	public static void recordsCount() {
		try {
			ps=con.prepareStatement("select count(*) from emp");
			rs=ps.executeQuery();
			if(rs.next())
				System.out.println("COUNT : "+rs.getInt(1));
		} catch (SQLException e) {
			System.out.println("RecordCount Failed\n"+e.getMessage());
		}
		
		
	}


	public static void getEmployeeRecord() {
		System.out.println("Enter Eno: ");
		in=new Scanner(System.in);
		int eno=in.nextInt();
		display(eno);
		
	}

	private static void display(int eno) {
		try {
			ps=con.prepareStatement("select * from emp where empno=?");
			ps.setInt(1, eno);
			rs=ps.executeQuery();
			System.out.println("-------------------------------------------Employee Record-------------------------------------------");
			
			if(rs.next()){
				showline();
				tableHeader();
				showline();
				System.out.println(String.format("| %-5s",rs.getString(1))+" "+
						String.format("| %-20s",rs.getString(2))+" "+
						String.format("| %-9s",rs.getString(3))+" "+
						String.format("| %-4s",rs.getString(4))+" "+
						String.format("| %-10s",rs.getString(5))+" "+
						String.format("| %-10s",rs.getString(6))+" "+
						String.format("| %-10s",rs.getString(7))+" "+
						String.format("| %-6s",rs.getString(8))+" "+
						"|"
						);
				showline();
			}else
			System.out.println("                                      NO RECORD FOUND !!!                                            ");
			
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
		} catch (SQLException e) {
			System.out.println("Display Failed.\n"+e.getMessage());
		}
	}

	
	public static void updateSalary() {
		System.out.println("Enter EmpNO: ");
		in=new Scanner(System.in);
		int eno=in.nextInt();
		update(eno);
	}

	private static void update(int eno) {
		try {
			ps=con.prepareStatement("select ename,sal from emp where empno=?");
			ps.setInt(1, eno);
			rs=ps.executeQuery();
			System.out.println("-------------------------------------------Employee Record-------------------------------------------");
			
			if(rs.next()){
				System.out.println("+----------------------+------------+");
				System.out.println(String.format("| %-20s","EName")+" "+String.format("| %-10s","Salary")+" "+"|");
				System.out.println("+----------------------+------------+");
				System.out.println(String.format("| %-20s",rs.getString(1))+" "+	String.format("| %-10s",rs.getString(2))+" "+"|");
				System.out.println("+----------------------+------------+");
			}else
			System.out.println("                                      NO RECORD FOUND !!!                                            ");			
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
			System.out.println("Enter New Salary: ");
			in=new Scanner(System.in);
			double newSal=in.nextDouble();
			ps=con.prepareStatement("update emp set sal=? where empno=?");
			ps.setDouble(1, newSal);
			ps.setInt(2, eno);			
			ps.executeUpdate();
			System.out.println("Successfully Updated.");
			displayAll();
			
		} catch (SQLException e) {
			System.out.println("Display Failed.\n"+e.getMessage());
		}
	}

	public static void closeAll(){
		try {
			rs.close();
			ps.close();
			con.close();
			in.close();
		} catch (SQLException e) {
			System.out.println("Close Failed!\n"+e.getMessage());
		}
		
		
	}

	
	public static void displayAll() {
		try {
			ps=con.prepareStatement("select * from emp ;");
			rs=ps.executeQuery();
			System.out.println("-------------------------------------------All Records---------------------------------------------");
			showline();
			tableHeader();
			showline();
			while(rs.next()){
				System.out.println(String.format("| %-5s",rs.getString(1))+" "+
						String.format("| %-20s",rs.getString(2))+" "+
						String.format("| %-9s",rs.getString(3))+" "+
						String.format("| %-4s",rs.getString(4))+" "+
						String.format("| %-10s",rs.getString(5))+" "+
						String.format("| %-10s",rs.getString(6))+" "+
						String.format("| %-10s",rs.getString(7))+" "+
						String.format("| %-6s",rs.getString(8))+" "+
						"|"
						);
			}
			showline();
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
		} catch (SQLException e) {
			System.out.println("DisplayAll failed to execute.\n"+e.getMessage());
		}
		
		
	}
}
