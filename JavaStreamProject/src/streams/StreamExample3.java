package streams;

import java.util.Arrays;
import java.util.List;
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


public class StreamExample3 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("김다희", 83), new Student("이광호", 98), new Student("김도은", 87), new Student("최형준", 97));
		
		//forEach (총 점수, 평균 가지고 오는 기능 구현)
		
		
		Stream<Student> scoreAvg = list.stream()
				.filter(predicate)
		stu.forEach(action);
	}

}
