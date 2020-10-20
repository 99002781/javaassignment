package com.lts.training;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.lts.model.*;
public class MainClass{
public static void main(String args[]){
	List<Student> Studentlist=new ArrayList<>();
	Student st1=new Student("harshu","jagtial",1);

	Student st2=new Student("harshitha","hyderabad",2);

	Student st3=new Student("ramya","jagtial",3);
	Studentlist.add(st1);
	Studentlist.add(st2);
	Studentlist.add(st3);
	System.out.println(Studentlist);
	Iterator<Student> iterator=Studentlist.iterator();
	while(iterator.hasNext()){
	Student s=iterator.next();
	System.out.println(s);
	}
}
}
