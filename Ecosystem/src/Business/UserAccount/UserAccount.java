/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.AppointmentQueue;
import Business.WorkQueue.CourseQueue;
import Business.WorkQueue.OnlineSalesQueue;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private OnlineSalesQueue onlineSalesQueue;
    private AppointmentQueue appointmentQueue;
    private CourseQueue courseQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
        courseQueue = new CourseQueue();
        appointmentQueue = new AppointmentQueue();
        onlineSalesQueue = new OnlineSalesQueue();
    }

    public OnlineSalesQueue getOnlineSalesQueue() {
        return onlineSalesQueue;
    }

    public void setOnlineSalesQueue(OnlineSalesQueue onlineSalesQueue) {
        this.onlineSalesQueue = onlineSalesQueue;
    }

    public AppointmentQueue getAppointmentQueue() {
        return appointmentQueue;
    }

    public void setAppointmentQueue(AppointmentQueue appointmentQueue) {
        this.appointmentQueue = appointmentQueue;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public CourseQueue getCourseQueue() {
        return courseQueue;
    }

    public void setCourseQueue(CourseQueue courseQueue) {
        this.courseQueue = courseQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
}