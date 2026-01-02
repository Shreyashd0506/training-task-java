package com.task5.abstraction;


public class SchoolMain {
	 public static void main(String[] args) {

	     Teacher t1 = new MathTeacher();
	     Teacher t2 = new ScienceTeacher();

	     t1.takeAttendance(); 
	     t1.teach();          

	     t2.takeAttendance();
	     t2.teach();
	 }
	}