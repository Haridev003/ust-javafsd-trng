package Testing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	
}

public class CollectersExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Student> Studentlist = new ArrayList<Student>();
        Studentlist.add(new Student(11,"jon",22));
        Studentlist.add(new Student(22,"steve",18));
        Studentlist.add(new Student(33,"Lucy",22));
        Studentlist.add(new Student(44,"Sansa",23));
        Studentlist.add(new Student(55,"Maggie",18));
        
        List<String> names = Studentlist.stream().map(n->n.name).collect(Collectors.toList());
        System.out.println(names);
        
        
	}

}
