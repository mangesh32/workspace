package Nugget_8;


public class JDBC_MAIN {

	public static void main(String[] args) {
		
		DBops.setUpTable();
		
		DBops.insert10();
			
		DBops.displayTop5();
		
		DBops.recordsCount();
		
		DBops.getEmployeeRecord();
		
		DBops.updateSalary();
	
		DBops.closeAll();	
		
	}

}



