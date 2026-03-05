/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racb.model;

/**
 *
 * @author jobair
 */
public class ClientDetails {
    
    int id, clientId;
    double balance;
    long memoId;

    public ClientDetails(int clientId, long memoId) {
        this.clientId = clientId;
        this.memoId = memoId;
    }

    public ClientDetails(int id, int clientId, double balance, long memoId) {
        this.id = id;
        this.clientId = clientId;
        this.balance = balance;
        this.memoId = memoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getMemoId() {
        return memoId;
    }

    public void setMemoId(long memoId) {
        this.memoId = memoId;
    }

    @Override
    public String toString() {
        return "ClientDetails{" + "id=" + id + ", clientId=" + clientId + ", balance=" + balance + ", memoId=" + memoId + '}';
    }
    
}
