package qwerty;
import java.util.*;

public class constuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in =new Scanner(System.in) ;
        List<Student> studs=new ArrayList<>();
        studs.add(new Student(1,55));
        studs.add(new Student(2,95));
        studs.add(new Student(3,85));
        studs.add(new Student(4,75));
        studs.add(new Student(5,99));
        Collections.sort(studs,(s1,s2)->{ 
        	return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
        });
        
        for(Student s : studs) {
        	System.out.println(s);
        }
	}

}
 class Student{
	 int roll;
	 int marks;
	 public Student(int roll,int marks) {
		 this.roll=roll;
		 this.marks=marks;
	 }
	 @Override
	 public String toString() {
		 return ("Student{" + roll + ", marks=" + marks + ":}");
  	 }
	 
 }
 