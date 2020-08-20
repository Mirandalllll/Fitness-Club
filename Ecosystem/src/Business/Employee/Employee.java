/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String course;
    private String account;
    private String password;
    private String evaluation;
    private int id;
    private static int count = 1;

    public Employee(String name, String phonenumber, String email) {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public Employee(String name, String phoneNumber, String email, String address, String course, int ID, String account, String password){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.course = course;
        this.account = account;
        this.password = password;
        //this.evaluation = evaluation;
        id = count;
        count++;
    }
    
    @Override
    public String toString() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
