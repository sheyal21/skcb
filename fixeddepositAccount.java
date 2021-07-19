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
public class fixeddepositAccount extends Account {
  private String duration;
  private float interest;

    public fixeddepositAccount() {
    }

    

    public fixeddepositAccount(String duration, float interest, String openDate, int id, int accountNumber, float balance) {
        super(openDate, id, accountNumber, balance);
        this.duration = duration;
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "fixeddepositAccount{" + "duration=" + duration + ", interest=" + interest + super.toString()+ '}';
    }
  
 

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
  
  
  
  
  
}
