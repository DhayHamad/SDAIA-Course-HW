package HW.day4;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Employees {

    private int employeesId;
    private String farstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String hireDate;
    private double salary;

  public  Employees (ResultSet rs) throws SQLException {
      employeesId = rs.getInt("employees_id");
      farstName = rs.getString("farst_Name");
      lastName = rs.getString("last_Name");
      email = rs.getString("email");
      phoneNumber = rs.getString("Phone_number");
      hireDate = rs.getString("Hire_date");
      salary = rs.getDouble("Salary");
  }

    public Employees(int employeesId, String farstName, String lastName, String email, String phoneNumber, String hireDate, double salary) {
        this.employeesId = employeesId;
        this.farstName = farstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public int getEmployeesId() {
        return employeesId;
    }

    public void setEmployeesId(int employeesId) {
        this.employeesId = employeesId;
    }

    public String getFarstName() {
        return farstName;
    }

    public void setFarstName(String farstName) {
        this.farstName = farstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeesId=" + employeesId +
                ", farstName='" + farstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", salary=" + salary +
                '}';
    }
}
