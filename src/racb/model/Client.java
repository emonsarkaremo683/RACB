/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racb.model;

/**
 *
 * @author jobair
 */
public class Client {
    int id;
    String name, number, address;
    double balance;

    public Client() {
    }

    public Client(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public Client(int id, String name, String number, String address, double balance) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.address = address;
        this.balance = balance;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", number=" + number + ", address=" + address + ", balance=" + balance + '}';
    }
    
    
    
}
