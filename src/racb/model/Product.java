/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racb.model;

/**
 *
 * @author jobair
 */
public class Product {
    //id, name, price, quantity, category Id, supplier Id
    
    int id, categoryId, supplierId;
    double price, quantity;
    String categoryName, supplierName;

    public Product() {
    }

    public Product(double price, double quantity, int categoryId, int supplierId) {
        this.categoryId = categoryId;
        this.supplierId = supplierId;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(int id, double price, double quantity, String categoryName, String supplierName) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.categoryName = categoryName;
        this.supplierName = supplierName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", categoryId=" + categoryId + ", supplierId=" + supplierId + ", price=" + price + ", quantity=" + quantity + ", categoryName=" + categoryName + ", supplierName=" + supplierName + '}';
    }
    
    
}
