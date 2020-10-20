package com.lts.activity1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ltts.activitydemo.Student;
public class Mainclass {
public static void main(String args[]){
	List<Student> studentlist=new ArrayList<>();
	Student st1=new Student("harshu","jagtial",1);

	Student st2=new Student("harshitha","hyderabad",2);

	Student st3=new Student("ramya","jagtial",3);
	studentlist.add(st1);
	studentlist.add(st2);
	studentlist.add(st3);
	System.out.println(studentlist);
	Iterator<Student> iterator=studentlist.iterator();
	while(iterator.hasNext()){
	Student s=iterator.next();
	System.out.println(s);
	}
}
}
