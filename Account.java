/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankproject.vo;

/**
 *
 * @author brave
 */
public class Account {
  
   
    private int accountNumber;
    private float accbalance;

    public Account() {
    }

    public Account(String openDate, int id, int accountNumber, float balance) {
        this.openDate = openDate;
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Accounts{" + "openDate=" + openDate + ", id=" + id + ", accountNumber=" + accountNumber + ", balance=" + balance + '}';
    }
    
    
    
    

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
   
    
    
}
