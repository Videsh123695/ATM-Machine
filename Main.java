//base class of all
import java.util.ArrayList;

abstract class Employee {
    private String name;
    private int id;
    public Employee(String name, int  id){
        this.name=name;
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public abstract double calculateSalary ();
     @Override
     public String toString(){
        return "Employee[name="+name+",id="+id+", salary="+calculateSalary()+"]";
     }
    }
//fulltime empoyee -> child class
    class FullTimeEmployee extends Employee {
        private double monthlySalary;

        public FullTimeEmployee(String name, int id , double monthlySalary){
            super(name,id);
            this.monthlySalary=monthlySalary;
        }
        @Override
        public double calculateSalary(){
            return monthlySalary;
        }

    }
//partime empoyee -> child class
    class PartTimeEmployee extends Employee{
        private int hoursWorked;
        private double hourlyRate;
        public PartTimeEmployee(String name, int id, int hoursWorked,double hourlyRate){
            super(name,id);
            this.hoursWorked=hoursWorked;
            this.hourlyRate=hourlyRate;
        }
        @Override
        public double calculateSalary(){
            return hoursWorked*hourlyRate;
        }
    }
class PayrollSystem{
    // ArrayList<Integer> arr= new ArrayList();
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList=new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id ){
        Employee employeeToRemove=null;

        for(Employee employee: employeeList){
            if(employee.getId()==id){
                employeeToRemove=employee;
                break;
            } 
        }
        if(employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
        }
    }
public  void displayEmployees(){
    for(Employee employee: employeeList){
        System.out.println(employee);
    }
}

}
    public class Main {
        public static void main(String[] args) {
            
            PayrollSystem payrollSystem=new PayrollSystem();

            FullTimeEmployee emp1 = new FullTimeEmployee("vasu", 1, 70000);
            PartTimeEmployee emp2 = new PartTimeEmployee("videsh", 2, 40, 100);
            PartTimeEmployee emp3 = new PartTimeEmployee("videsh", 2, 40, 100);
            PartTimeEmployee emp4 = new PartTimeEmployee("videsh", 2, 40, 100);
            PartTimeEmployee emp5 = new PartTimeEmployee("videsh", 2, 40, 100);

            payrollSystem.addEmployee(emp1);
            payrollSystem.addEmployee(emp2);
            payrollSystem.addEmployee(emp3);
            payrollSystem.addEmployee(emp4);
            payrollSystem.addEmployee(emp5);

            System.out.println("Initial Employee details : ");

            payrollSystem.displayEmployees();

             System.out.println("Removing Employees : ");
           payrollSystem.removeEmployee(2);
           payrollSystem.removeEmployee(4);
          

            System.out.println("Remining Employees Details : ");
            payrollSystem.displayEmployees();





        }
    
        
    }
    

