/*
*-Creator: Rafae Khan
*-Language Used: Java
*-Program Name: Payroll system
*-Program Description: This program is a basic payroll system utilizing several design principles
 */
package p;


public class SalariedEmployee extends Employee {

    private String type;
    private double annualSalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(int employeeId, String employeeTitle, String firstName, String lastName, String dateOfBirth, String NINumber, String[] jobTitles, String jobDepartment) {
        super(employeeId, employeeTitle, firstName, lastName, dateOfBirth, NINumber, jobTitles, jobDepartment);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

}
