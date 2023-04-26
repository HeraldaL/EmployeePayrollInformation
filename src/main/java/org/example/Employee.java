package org.example;

public class Employee {
    private String employeeId;
    private String employeeName;
    private double hoursWorked;
    private double payRate;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName=' " + employeeName + '\'' +
                ", hourWorked=" + hoursWorked +
                ", payRate=" + payRate +
                '}';
    }

    public Employee(String employeeId, String employeeName, double hourWorked, double payRate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.hoursWorked = hourWorked;
        this.payRate = payRate;

        }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId( String EmployeeId){
        this.employeeId = EmployeeId;
    }


    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
          this.employeeName = employeeName;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked =hoursWorked;
    }
    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate){
        this.payRate = payRate;
    }
    public double getGrossPay(){
        return hoursWorked * payRate;
    }
}




