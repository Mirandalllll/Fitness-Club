/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public boolean isEmployeeExist(Employee emp) {
        if (!this.employeeList.isEmpty()) {
            for (Employee em : this.employeeList) {
                if (em.getId() == emp.getId()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Employee createEmployee(String name, String phoneNumber, String email, String address, String course, String evaluation){
        Employee employee = new Employee(name, phoneNumber, email);
        //employee.setName(name);
        employeeList.add(employee);
        return employee;
    }

    public void createEmployee(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}