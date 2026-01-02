package com.task5.abstraction;

//Abstract class
abstract class Teacher {

   abstract void teach();

 // normal method
 public void takeAttendance() {
     System.out.println("Taking attendance");
 }
}

// child class
class MathTeacher extends Teacher {
	
 @Override
 public void teach() {
     System.out.println("Teaching Mathematics");
 }
}

//Another child class
class ScienceTeacher extends Teacher {

 @Override
public void teach() {
     System.out.println("Teaching Science");
 }
}

