package HW.day4;

import java.sql.*;
import java.util.ArrayList;

public class EmployeesDAO {
    private static final String URL = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\SDAIA-Course-HW\\src\\main\\java\\HW\\day4\\hr.db";
    private static final String SELECT_ALL_EMPLOYEES = "select * from employees";
    private static final String SELECT_ONE_EMPLOYEES = "select * from employees where employees_id = ?";
    private static final String INSERT_EMPLOYEES = "insert into employees values (?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_EMPLOYEES= "update employees set farst_Name = ?, last_Name = ? ,email = ? ,Phone_number = ? ,Hire_date = ? ,Salary = ? where job_id = ?";
    private static final String DELETE_EMPLOYEES = "delete from employees where employees_id = ?";

    public void insertEmployees(EmployeesDAO e) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(INSERT_EMPLOYEES);
        st.setInt(1, e.getEmployeesId();
        st.setString(2, e.getFarstName());
        st.setString(3, e.getLastName());
        st.setString(4, e.getEmail());
        st.setString(5, e.getPhoneNumber());
        st.setString(6, e.getHireDate());
        st.setDouble(7, e.getSalary());

        st.executeUpdate();
    }

    public void updateEmployees(EmployeesDAO e) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(UPDATE_EMPLOYEES);
        st.setInt(7, e.getEmployeesId());
        st.setString(1, e.getFarstName());
        st.setDouble(2, e.getLastName());
        st.setDouble(3, e.getEmail());
        st.setDouble(4, e.getPhoneNumber());
        st.setDouble(5, e.getHireDate());
        st.setDouble(6, e.getSalary());

        st.executeUpdate();
    }

    public void updateEmployees(int employeeId) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(DELETE_EMPLOYEES);
        st.setInt(1, employeeId);
        st.executeUpdate();
    }

    public Employees selectEmployees(int employeeId) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ONE_EMPLOYEES);
        st.setInt(1, employeeId);
        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            return new Employees(rs);
        }
        else {
            return null;
        }
    }

    public ArrayList<Employees> selectAllEmployees() throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ALL_EMPLOYEES);
        ResultSet rs = st.executeQuery();
        ArrayList<Employees> employees = new ArrayList<>();
        while (rs.next()) {
            employees.add(new Employees(rs));
        }

        return employees;
    }

}