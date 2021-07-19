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
public class checkingAccount extends Account {
  private float minbalance;  
  
  

    public checkingAccount() {
    }



    public checkingAccount(float overdraft, String openDate, int id, int accountNumber, float balance) {
        super(openDate, id, accountNumber, balance);
        this.overdraft = overdraft;
    }

    @Override
    public String toString() {
        return "checkingAccount{" + "overdraft=" + overdraft + super.toString()+'}';
    }
  
  

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
