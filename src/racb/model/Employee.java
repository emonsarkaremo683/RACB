/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racb.model;

import java.util.Date;

/**
 *
 * @author jobair
 */
public class Employee {
    
    int id;
    String name, contactNumber;
    double salary, remainSalary;
    Date joinDate;

    public Employee() {
    }

    public Employee(String name, String contactNumber, double salary, Date joinDate) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.salary = salary;
        this.joinDate = joinDate;
    }

    public Employee(int id, String name, String contactNumber, double salary, double remainSalary, Date joinDate) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.salary = salary;
        this.remainSalary = remainSalary;
        this.joinDate = joinDate;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getRemainSalary() {
        return remainSalary;
    }

    public void setRemainSalary(double remainSalary) {
        this.remainSalary = remainSalary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", salary=" + salary + ", remainSalary=" + remainSalary + '}';
    }
    
    
    
}
