
package fr.m2i.jsf.web.app;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;



@ManagedBean(name="userData" , eager = true)
public class UserData {
    
    private static final List<Employee> employees = new ArrayList() {
         {
        add(new Employee("Anna","Communication",32,2590.00));
        add(new Employee("Sullyvan","IT",22,1680.00));
        add(new Employee("Jerome","Communication",45,4590.00));
        add(new Employee("Chris","Production",35,2450.00));
        add(new Employee("Elon","PDG",40,62450.00));
    }
    };
    private String name;
    private String department;
    private int age;
    private double salary;

    public String addEmployee() {

        Employee employee = new Employee(name, department, age, salary);
        employees.add(employee);
        
        name=null;
        department=null;
        age=0;
        salary=0.0 ;

        return null;
    }

    
    public List<Employee> getEmployees(){
        return employees ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   
}
