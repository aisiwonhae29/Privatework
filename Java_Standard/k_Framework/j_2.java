package Java_Standard.k_Framework;

import java.util.*;

public class j_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("홍길동",1,1,100,100,100));
		list.add(new Student("남궁성",1,2,90,70,80));
		list.add(new Student("김자바",1,3,50,80,90));
		list.add(new Student("이자바",1,4,70,90,70));
		list.add(new Student("인자바",1,5,60,100,80));
		
		for (int i=0; i<list.size();i++) {
			Student a = (Student) list.get(i);
			System.out.println(a.name);
			}
		
		Collections.sort(list, new nameSort());
		
		for (int i=0; i<list.size();i++) {
			Student a = (Student) list.get(i);
			System.out.println(a.name);
			}
		
		Iterator it = list.iterator();
		
		
	while(it.hasNext())
		System.out.println(it.next());
		
	}

}

class nameSort implements Comparator {

	public int compare(Object o1, Object o2) {
		if((o1 instanceof Comparable && o2 instanceof Comparable)) {
			Student s1= (Student) o1;
			Student s2= (Student) o2;
			
			Comparable c1 = (Comparable) s1.kor;
			Comparable c2 = (Comparable) s2.kor;
		
			return c1.compareTo(c2);
		}else {
			return 1;
		}
			
	}

}

class Student {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3) * 10 + 0.5) / 10f;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]" + "총점 = " + getTotal() + ", 평균 = " + getAverage();
	}

}
