package streams.intermediate.terminate;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import common.EmpDAO;
import common.Employee;

public class ReduceExample {
	public static void main(String[] args) {
		// 사원의 평균 급여 계산
		List<Employee> empList= EmpDAO.getEmpList(); 
		// 전체 사원의 컬렉션을 통해 스트림 생성
		Stream<Employee> stream = empList.stream();
		
		OptionalDouble avg = stream.filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getJobId().equals("IT_PROG");
			}
			
		}).flatMapToInt(new Function<Employee, IntStream>(){
			@Override
			public IntStream apply(Employee t) {
				return IntStream.of(t.getSalary());
			}
		}).average();
		
		
		System.out.println("평균 급여는 : " + avg);
	}
}
