package streams;

import java.util.Arrays;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class DoubleStreamExample {
	public static void main(String[] args) {
		double[] dAry = { 2.3, 4.5, 8.3, 5.5, 4.6 };
		//스트림을 생성하고 5보다 작은 반복요소를 필터하고 합을 구하세요.
		DoubleStream dStream2 = Arrays.stream(dAry);
		double sum = dStream2.filter(new DoublePredicate() {
			@Override
			public boolean test(double value) {
				return value < 5;
			}
		}).sum();
		System.out.println(sum);
		
		// 데이터 타입에 따른 스트림
		LongStream lStream = Arrays.stream(new long[] { 10, 29, 38 });
		IntStream iStream = Arrays.stream(new int[] { 1, 2, 3 });
		DoubleStream dStream = Arrays.stream(new double[] { 1.1, 2.2 });
		
		// 제네릭 사용한 스트림 
		Stream<Integer> intStream; // 위의 iStream 과 성격은 유사하지만 같은 데이터 타입은 아님
		Stream<String> sStream = Arrays.stream(new String[] { "Hong", "Park" });
		Stream<Student> tStream = Arrays.stream(new Student[] {new Student("김도은",70)});
	}
}
