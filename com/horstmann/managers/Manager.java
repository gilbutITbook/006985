package com.horstmann.managers;

import com.horstmann.employees.Employee;

public class Manager extends Employee {
    private double bonus;
    
    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double getSalary() { 
        return salary + bonus; // 보호된 salary 변수에 접근하는 건 괜찮다.
    }
}
