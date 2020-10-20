package com.ltts.activitydemo;

import java.util.Comparator;

public class Namesort implements Comparator<Student>{

	@Override
	public int compare(Student std1, Student std2) {
		// TODO Auto-generated method stub
		return std1.getName().compareTo(std2.getName());
	}

}
