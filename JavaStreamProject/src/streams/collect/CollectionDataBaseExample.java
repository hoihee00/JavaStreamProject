package streams.collect;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import common.ConnectDB;
import common.EmpDAO;
import common.Employee;

public class CollectionDataBaseExample {
	public static void main(String[] args) {
		// employee 테이블
		// 입사일자 기준. 1990년대 입사한 사람들
		// List 컬렉션에 저장
		
		List<Employee> emp = EmpDAO.getEmpList();
		
		emp.stream().filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getHireDate().isAfter(LocalDate.of(1990, Month.JANUARY, 1))&&t.getHireDate().isBefore(LocalDate.of(2000, Month.JANUARY, 1));
			}
		}).forEach(System.out::println);

		System.out.println("-------------------");
		// job -> ST_CLERK인 사람들의 이름과 급여를 컬렉션에 저장
		
		List<Employee> listE = emp.stream()
				.filter(e -> e.getJobId().equals("ST_CLERK"))
				.collect(Collectors.toList());
		
		
	}

}
