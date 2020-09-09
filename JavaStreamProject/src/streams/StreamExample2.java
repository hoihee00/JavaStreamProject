package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student {
	String name;
	int score;
	public String getName() { return name; }
	public int getScore() { return score; }
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
}

public class StreamExample2 {
	public static void main(String[] args) {
		// 김다희 83 / 이광호 98 / 김도은 87 / 최형준 97
		// score >= 85 몇 명인지? rCnt 변수에 담기
		// 리스트 출력
		
/*		List<Student> list = Arrays.asList(new Student("김다희", 83), new Student("이광호", 98), new Student("김도은", 87), new Student("최형준", 97));
		Stream<Student> students = list.stream();
		long iCnt = students.filter(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.score >= 85;
			}
		}).peek(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				System.out.println(t.name + ", " + t.score);
			}
		}).count();
		System.out.println("총 인원: " + iCnt);
*/		
		
		List<Student> list = Arrays.asList(new Student("김다희", 83), new Student("이광호", 98), new Student("김도은", 87), new Student("최형준", 97));
		Stream<Student> students = list.stream();
		long iCnt = students.filter(t -> t.score >= 85)
				.peek(t -> System.out.println(t.name + ", " + t.score))
				.filter(t -> t.name.startsWith("김"))
				.count();
		System.out.println("총 인원: " + iCnt);

		
	}
}
