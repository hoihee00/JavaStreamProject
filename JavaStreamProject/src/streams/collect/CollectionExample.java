package streams.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import streams.intermediate.Student;

public class CollectionExample {
	public static void main(String[] args) {
		Set<String> setStr = new HashSet<>();
		setStr.add(new String("밍밍"));
		setStr.add(new String("애기"));
		setStr.add(new String("말랑"));
		
		Iterator<String> iter = setStr.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("야옹", 90));
		students.add(new Student("멍멍", 80));
		
		for(Student s : students) {
			System.out.println(s);
		}
		
		List<Student> studentsw = new ArrayList<>();
		studentsw.add(new Student("개굴", 90));
		studentsw.add(new Student("씩씩", 80));
		
		List<Student> studentr = new ArrayList<>();
		studentr.add(new Student("잉잉", 60));
		studentr.add(new Student("메롱", 50));
		
		Map<String, Integer> map = new HashMap<>();
		map.put("겸디", 25);
		map.put("어흥", 26);
		Set<String> key = map.keySet();
		Iterator<String> itr = key.iterator();
		while(itr.hasNext()){
			String k = itr.next(); // key 값을 가지고
			System.out.println(map.get(k));; // value 값을 가지고
		}
		
		Map<String, List<Student>> stMap = new HashMap<>();
		stMap.put("남자", students);
		stMap.put("여자", studentsw);
		stMap.put("재평가", studentr);
		Set<String> setk = stMap.keySet();
		for (String s : setk) {
			System.out.println(s);
			List<Student> valueList = stMap.get(s);
			for (Student st : valueList) {
			System.out.println("  " + st);
			}
		}

	}
}
