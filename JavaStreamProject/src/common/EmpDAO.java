package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	
	// List<Employee> getEmpList();
	
	public static List<Employee> getEmpList() {
		Connection conn = ConnectDB.getDB();
		List<Employee> employees = new ArrayList();
		
		try {
			String sql = "select * from employees";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int idx = 0;
			while (rs.next()) {
				Employee emp = new Employee(rs.getInt("employee_id"), rs.getString("first_name"),
						rs.getString("last_name"), rs.getString("email"),
						rs.getDate("hire_date").toLocalDate(), rs.getString("job_id"),
						rs.getInt("salary"));
				employees.add(emp);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employees;
	}

	
	
	
	
}
