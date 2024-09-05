package pack2;


class User {
    // Instance Variables
    private int id;
    private String name;

    // Parameterized Constructor For Base Class User
    public User(int id, String name){
        this.id=id;
        this.name=name;
    }
}
//Child Class For User.
//Using Here The Concept Of Inheritance
class Employee extends User{

 // Instance Variable For Derived Class (Employee)
 public Double salary;

 //Parameterized Constructor For Derived Class (Employee)
 public Employee(int id, String name, double salary) {
     super(id, name); // Using Super Keyword To Access The Properties Of Base Class
     this.salary=salary;
 }

 //Instance Function Of Derived Class To Calculate Annual Salary Of Derived Class (Employee).
 public double calculateAnnualSalary(){
     if(salary == null){
         return 0;
     }
     salary=salary*12;
     return salary;
 }
}
public class Main {
    public static void main(String[] args){
        // New Object Created For Child Class Employee And Also Passed The Arguments,
        //Which Are Parameterized Through Constructor.
        Employee E1=new Employee(18, "Vaibhav", 500000);
        //Assigned calculateAnnualSalary Function To A Variable To Calculate Annual Income Of Employee.
        double annualsalary = E1.calculateAnnualSalary();
        // Printing Annual Salary Of E1 Object;
        System.out.println(annualsalary);
    }
}