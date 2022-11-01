/*
*-Creator: Rafae Khan
*-Language Used: Java
*-Program Name: Payroll system
*-Program Description: This program is a basic payroll system utilizing several design principles
 */
package p;

/**
 *
 * @author icon
 */
public class CommisionedEmployee extends Employee{

    private double grossAnnualSalary, commissionRate;

    public CommisionedEmployee() {
    }

    public CommisionedEmployee(int employeeId, String employeeTitle, String firstName, String lastName, String dateOfBirth, String NINumber, String[] jobTitles, String jobDepartment) {
        super(employeeId, employeeTitle, firstName, lastName, dateOfBirth, NINumber, jobTitles, jobDepartment);
    }

    public double getGrossAnnualSalary() {
        return grossAnnualSalary;
    }

    public void setGrossAnnualSalary(double grossAnnualSalary) {
        this.grossAnnualSalary = grossAnnualSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

}
