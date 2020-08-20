/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.Course.Course;
import java.util.ArrayList;
/**
 *
 * @author luliu
 */
public class CourseRequest extends WorkRequest{
    private Course course;
    private String result;
    //private Course courserequest;
    
//    public CourseRequest(Course courserequest){
//    this.courserequest =  courserequest;
//}

    @Override
    public String toString(){
        
        return course.getCourseName();
    }
    
    public CourseRequest(){
        course = new Course();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

   

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    
//    public Course getCourserequest() {
//        return courserequest;
//    }
//
//    public void setCourserequest(Course courserequest) {
//        this.courserequest = courserequest;
//    }
    
    
    
}
