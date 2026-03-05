/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racb.model;

/**
 *
 * @author jobair
 */
public class SupplierDetails {
    // 1 = cash, 2 = bank, 3 = due
    int id, memoNo, supplierId, typeId;
    double balance;

    public SupplierDetails() {
    }

    public SupplierDetails(int memoNo, int supplierId, int typeId, double balance) {
        this.memoNo = memoNo;
        this.supplierId = supplierId;
        this.typeId = typeId;
        this.balance = balance;
    }

    public SupplierDetails(int id, int memoNo, int supplierId, int typeId, double balance) {
        this.id = id;
        this.memoNo = memoNo;
        this.supplierId = supplierId;
        this.typeId = typeId;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemoNo() {
        return memoNo;
    }

    public void setMemoNo(int memoNo) {
        this.memoNo = memoNo;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "SupplierDetails{" + "id=" + id + ", memoNo=" + memoNo + ", supplierId=" + supplierId + ", typeId=" + typeId + ", balance=" + balance + '}';
    }
    
    
    
    
}
