/*
*-Creator: Rafae Khan
*-Language Used: Java
*-Program Name: Payroll system
*-Program Description: This program is a basic payroll system utilizing several design principles
 */
package p;


public class Employee {
    private int employeeId;
    private String employeeTitle, firstName, lastName, dateOfBirth, NINumber, jobTitles[], jobDepartment;

    public Employee() {
    }

    public Employee(int employeeId, String employeeTitle, String firstName, String lastName, String dateOfBirth, String NINumber, String[] jobTitles, String jobDepartment) {
        this.employeeId = employeeId;
        this.employeeTitle = employeeTitle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.NINumber = NINumber;
        this.jobTitles = jobTitles;
        this.jobDepartment = jobDepartment;
    }
    

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNINumber() {
        return NINumber;
    }

    public void setNINumber(String NINumber) {
        this.NINumber = NINumber;
    }

    public String[] getJobTitles() {
        return jobTitles;
    }

    public void setJobTitles(String[] jobTitles) {
        this.jobTitles = jobTitles;
    }

    public String getJobDepartment() {
        return jobDepartment;
    }

    public void setJobDepartment(String jobDepartment) {
        this.jobDepartment = jobDepartment;
    }

    @Override
    public String toString() {
        return employeeId + " " + employeeTitle + " " + firstName + " " + lastName + " " + dateOfBirth + " " + NINumber + " Job Titles=" + jobTitles + " " + jobDepartment + '}';
    }
    
    
}
