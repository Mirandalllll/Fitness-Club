/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Course;

import java.util.ArrayList;

/**
 *
 * @author luliu
 */
public class CourseDirectory {
    private ArrayList<Course> courseList;
    
    public CourseDirectory(){
        this.courseList = new ArrayList();
}

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    
}
