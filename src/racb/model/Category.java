/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racb.model;

/**
 *
 * @author jobair
 */
public class Category {
    
    int id;
    String name;
    int supplierId;
    String supplierName;

    public Category() {
    }

    public Category(String name, int supplierId) {
        this.name = name;
        this.supplierId = supplierId;
    }

    public Category(int id, String name, String supplierName) {
        this.id = id;
        this.name = name;
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + ", supplierId=" + supplierId + '}';
    }
    
    
    
    
}
