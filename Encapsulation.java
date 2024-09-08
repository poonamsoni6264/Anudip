package object_oriented_programming;

class Employee 
{
	private int emp_id;// variable create as private 
	
	public void setEmp(int empid)//set functions for set the value
	{
		emp_id = empid;
	}
	
	public int getEmp()//get method for view the value 
	{
		return emp_id;
	}
}



public class Encapsulation
{
    public static void main(String args[])
    {
    	Employee e = new Employee();//object of employee class 
    	e.setEmp(12345);
    	System.out.println(e.getEmp());
    }
}
