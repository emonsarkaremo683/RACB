/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racb.model;

/**
 *
 * @author jobair
 */
public class Supplier {
    int id;
    double balance;
    String companyName, contactPerson, contactNumber, address, companyNumber;

    public Supplier() {
    }
    // data insert or update
    public Supplier(String companyName, String contactPerson, String contactNumber, String address, String companyNumber) {
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.address = address;
        this.companyNumber = companyNumber;
    }
    
    //data show
    public Supplier(int id, double balance, String companyName, String contactPerson, String contactNumber, String address, String companyNumber) {
        this.id = id;
        this.balance = balance;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.address = address;
        this.companyNumber = companyNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", balance=" + balance + ", companyName=" + companyName + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber + ", address=" + address + ", companyNumber=" + companyNumber + '}';
    }
    
    
    
    
    
}
