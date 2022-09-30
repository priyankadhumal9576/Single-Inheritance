package Inheritence.java;

public class PracticalExam extends Exam 
{
	private int topic;
	private int outOfMarks;
	
	public PracticalExam()
	{
		
	}
    public PracticalExam(int t,int o)
    {
    	super("written","oops");
    	topic=t;
    	outOfMarks=o;
    }
    public void showPracticalExamdetails()
    {
    	System.out.println("Topics are:"+topic);
    	System.out.println("out of marks:"+outOfMarks);
    }
}
