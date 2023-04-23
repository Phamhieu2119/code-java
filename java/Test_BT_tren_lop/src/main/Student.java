package main;

public class Student {
	public int count1;
	public static int count2;
	public Student() {
		count1++;
		count2++;
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		System.out.println(s1.count1);
		System.out.println(s1.count2);
		System.out.println(s2.count1);
		System.out.println(s2.count2);
		System.out.println(s3.count1);
		System.out.println(s3.count2);
		System.out.println(Student.count2);
		
	}
	
}
