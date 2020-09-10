package streams.intermediate;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import common.EmpDAO;
import common.Employee;

public class StreamMapExample {
	public static void main(String[] args) {
		
		List<Employee> employees = EmpDAO.getEmpList();
		
//		for(Employee emp : employees) {
//			System.out.println(emp.toString());
//		}
		
		// salary가 5000 이상인 사원들 출력
		
//		Stream<Employee> emp = employees.stream();
//		emp.filter(t -> t.getSalary() > 5000)
//		.forEach(System.out::println);
		
		
		
		
		
	}
}
