package streams.intermediate;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
	public static void main(String[] args) {
		List<Employee2> list = Employee2.employees();
		list.stream().filter(new Predicate<Employee2>() {
			@Override
			public boolean test(Employee2 t) {
				return t.isMale();
			}
//		}).forEach(System.out::println);
		}).peek(s -> {
			s.setIncome(s.getIncome() * 0.9);
		}).forEach(System.out::println);
		System.out.println("-------------------------------");
		list.stream().filter(new Predicate<Employee2>() {
			@Override
			public boolean test(Employee2 t) {
				return t.getDateOfBirth().isBefore(LocalDate.of(1993, Month.APRIL, 3));
			}
		}).forEach(System.out::println);

	}
}
