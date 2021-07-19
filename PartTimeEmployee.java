/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankproject.vo;

import java.util.ArrayList;

/**
 *
 * @author brave
 */
public class PartTimeEmployee extends Employee {
  private float hoursWorking;
  private float hourlyRate;


    public PartTimeEmployee(float hoursWorking, float hourlyRate, String fullname, int id, String designation) {
        super(fullname, id, designation);
        this.hoursWorking = hoursWorking;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" + "hoursWorking=" + hoursWorking + ", hourlyRate=" + hourlyRate +","+ super.toString()+ '}';
    }
  
  
  
 

    public float getHoursWorking() {
        return hoursWorking;
    }

    public void setHoursWorking(float hoursWorking) {
        this.hoursWorking = hoursWorking;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    
    
    
}
 