package ch02.sec03;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee james = new Employee("James Bond", 500000);
            // Employee(String, double) 생성자를 호출한다.
        Employee anonymous = new Employee("", 40000);
            // Employee(double) 생성자를 호출한다.
        Employee unpaid = new Employee("Igor Intern");
        Employee e = new Employee();
            // 인수 없는 생성자를 호출한다.
    }
}
