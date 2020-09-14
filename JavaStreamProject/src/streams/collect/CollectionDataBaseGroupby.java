package streams.collect;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import common.EmpDAO;
import common.Employee;

public class CollectionDataBaseGroupby {
	// 직무별 - 사원 그룹
	public static void main(String[] args) {
		List<Employee> employees = EmpDAO.getEmpList();
		
		Map<String, List<Employee>> map;
		
		Map<String, List<Employee>> eMap = employees.stream()
				.collect(Collectors.groupingBy(new Function<Employee, String>(){

					@Override
					public String apply(Employee t) {
						return t.getJobId();
					}
					
				}, Collectors.toList()));
		
		Set<String> set = eMap.keySet();
		for (String s : set) {
			System.out.println(s);
			List<Employee> list = eMap.get(s);
			for (Employee e : list) {
				System.out.println(e);
			}
		}
		
		
	}
	
}
