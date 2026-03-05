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
public class EmployeeDetails {
    
    int id, employeeId;
    Date date;
    double withdraw, salary;

    public EmployeeDetails() {
    }

    public EmployeeDetails(int employeeId, Date date, double withdraw) {
        this.employeeId = employeeId;
        this.date = date;
        this.withdraw = withdraw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" + "id=" + id + ", employeeId=" + employeeId + ", date=" + date + ", withdraw=" + withdraw + ", salary=" + salary + '}';
    }
}
