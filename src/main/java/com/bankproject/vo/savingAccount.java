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
public class savingAccount extends Account {
  private float minBalance;

    public savingAccount() {
    }


    public savingAccount(float interest, String openDate, int id, int accountNumber, float balance) {
        super(openDate, id, accountNumber, balance);
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "savingAccount{" + "interest=" + interest +super.toString()+ '}';
    }
  


    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    
    
}
