
package fr.m2i.jsf.web.app;


public class Employee {
    
    private String name ;
    private String departement;
    private int age ;
    private double salary ;
    
    public Employee(){
        
    }

    public Employee(String name, String departement, int age, double salary) {
        this.name = name;
        this.departement = departement;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
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
