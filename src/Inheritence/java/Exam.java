package Inheritence.java;

public class Exam 
{
 private String examType;
 private String subject;
 
 public Exam()
 {
	 
 }
 public Exam(String e,String s)
 {
	 examType=e;
	 subject=s;
 }
 
 public void showExamDetails()
 {
	 System.out.println("Exam type is:"+examType);
	 System.out.println("Subject is:"+subject);
 }
	
}
