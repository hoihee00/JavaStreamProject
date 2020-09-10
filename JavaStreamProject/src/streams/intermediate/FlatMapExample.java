package streams.intermediate;

import java.time.LocalDate;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		stream.flatMap(new Function<Integer, Stream<Integer>>(){
			@Override
			public Stream<Integer> apply(Integer t) {
				return Stream.of(t * 3);
			}
		}).forEach(System.out::println);
		
		System.out.println("------------------------------");

//		DoubleStream.of(0.3);
		
		OptionalDouble result = Employee2.employees().stream().flatMapToDouble(new Function<Employee2, DoubleStream>(){
			@Override
			public DoubleStream apply(Employee2 t) {
				return DoubleStream.of(t.getIncome());
			}
//		}).filter(n -> n > 8000).min();
		}).reduce(new DoubleBinaryOperator() {
			@Override
			public double applyAsDouble(double left, double right) {
				System.out.println(left + ", " + right);
				return left + right;
			}
		});
		if(result.isPresent())
			System.out.println("result: " + result);
		else
			System.out.println("결과 없음");
		
		System.out.println("------------------------------");
		
		Employee2.employees().stream().flatMapToDouble(new Function<Employee2, DoubleStream>(){
			@Override
			public DoubleStream apply(Employee2 t) {
				return DoubleStream.of(t.income);
//				return DoubleStream.of(t.getIncome);
			}
		}).forEach(System.out::println);
		
		System.out.println("------------------------------");

		
		Employee2.employees().stream().flatMap(new Function<Employee2, Stream<String>>(){
			@Override
			public Stream<String> apply(Employee2 t) {
				return Stream.of(t.name);
			}
//		}).findFirst().ifPresent(System.out::println); // 첫번째 값만 가져옴
		}).forEach(System.out::println);

		System.out.println("------------------------------");
		
		Optional<LocalDate> result2 = Employee2.employees().stream().flatMap(new Function<Employee2, Stream<LocalDate>>(){
			@Override
			public Stream<LocalDate> apply(Employee2 t) {
				return Stream.of(t.getDateOfBirth());
			}
		}).reduce(new BinaryOperator<LocalDate>() {
			@Override
			public LocalDate apply(LocalDate t, LocalDate u) {
				System.out.println(t + ", " + u);
				return t.isBefore(u) ? t : u;
			}
		});
		System.out.println("min 값: " + result2);
	}
}
