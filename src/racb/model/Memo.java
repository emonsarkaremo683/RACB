/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racb.model;

/**
 *
 * @author jobair
 */
public class Memo {
    
    int id, productId, typeId;
    double quantity, unitPrice, totalPrice, totalBalance, dueBalance, netBalance;
    String productName;
    long memoNo;
    
     public Memo() {
    }

    public Memo(long memoNo, int productId, double quantity, double unitPrice, double totalPrice) {
        this.productId = productId;
        this.memoNo = memoNo;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public Memo(double totalBalance, int typeId, long memoNo, double dueBalance, double netBalance) {
        this.typeId = typeId;
        this.memoNo = memoNo;
        this.totalBalance = totalBalance;
        this.dueBalance = dueBalance;
        this.netBalance = netBalance;
    }

    public Memo(int id, String productName, double quantity, double unitPrice, double totalPrice) {
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.productName = productName;
    }

    public Memo(int typeId, long memoNo, double totalBalance, double dueBalance, double netBalance) {
        this.typeId = typeId;
        this.memoNo = memoNo;
        this.totalBalance = totalBalance;
        this.dueBalance = dueBalance;
        this.netBalance = netBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getDueBalance() {
        return dueBalance;
    }

    public void setDueBalance(double dueBalance) {
        this.dueBalance = dueBalance;
    }

    public double getNetBalance() {
        return netBalance;
    }

    public void setNetBalance(double netBalance) {
        this.netBalance = netBalance;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getMemoNo() {
        return memoNo;
    }

    public void setMemoNo(long memoNo) {
        this.memoNo = memoNo;
    }

    @Override
    public String toString() {
        return "Memo{" + "id=" + id + ", productId=" + productId + ", typeId=" + typeId + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + ", totalBalance=" + totalBalance + ", dueBalance=" + dueBalance + ", netBalance=" + netBalance + ", productName=" + productName + ", memoNo=" + memoNo + '}';
    }
    
    
    

   
    
    
    
    
    
}
