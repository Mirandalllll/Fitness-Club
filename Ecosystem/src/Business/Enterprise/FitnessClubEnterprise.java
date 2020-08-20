/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Appointment.AppointmentTime;
import Business.Appointment.ClassRoomDirectory;
import Business.Course.CourseDirectory;
import Business.Role.Role;
import Business.WorkQueue.AppointmentQueue;
import Business.WorkQueue.CourseQueue;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class FitnessClubEnterprise extends Enterprise {

    private CourseQueue courseQueue;
    private CourseDirectory courseDirectory;
    private AppointmentQueue appointmentQueue;
    private ClassRoomDirectory classRoomDirectory;
    private AppointmentTime appointmentTime;
    
//    public FitnessClubEnterprise(String name, EnterpriseType type) {
//        super(name, type);
//    }
    
    public FitnessClubEnterprise(String name){
        super(name,EnterpriseType.FitnessClub);
        this.appointmentTime = new AppointmentTime();
        this.classRoomDirectory = new ClassRoomDirectory();
        this.courseDirectory = new CourseDirectory();
        
        appointmentQueue = new AppointmentQueue();
        courseQueue = new CourseQueue();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public CourseQueue getCourseQueue() {
        return courseQueue;
    }

    public void setCourseQueue(CourseQueue courseQueue) {
        this.courseQueue = courseQueue;
    }

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(CourseDirectory courseDirectory) {
        this.courseDirectory = courseDirectory;
    }

    public AppointmentQueue getAppointmentQueue() {
        return appointmentQueue;
    }

    public void setAppointmentQueue(AppointmentQueue appointmentQueue) {
        this.appointmentQueue = appointmentQueue;
    }

    public ClassRoomDirectory getClassRoomDirectory() {
        return classRoomDirectory;
    }

    public void setClassRoomDirectory(ClassRoomDirectory classRoomDirectory) {
        this.classRoomDirectory = classRoomDirectory;
    }

    public AppointmentTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(AppointmentTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
    
    
}
