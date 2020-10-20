package com.ltts.activitydemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.ltts.activitydemo.Student;



public class SortDemo {
public static void main(String args[]){
	ArrayList<Student> studentlist=new ArrayList<>();
	Student st1=new Student("harshu","jagtial",1);

	Student st2=new Student("harshitha","hyderabad",2);

	Student st3=new Student("ramya","jagtial",3);
	studentlist.add(st1);
	studentlist.add(st2);
	studentlist.add(st3);
	//for(student st:studentlist){
	//System.out.println(studentlist);}

	System.out.println(studentlist);
	Collections.sort(studentlist,new Namesort());
	System.out.println("sort by name");

	System.out.println(studentlist);
}
}
