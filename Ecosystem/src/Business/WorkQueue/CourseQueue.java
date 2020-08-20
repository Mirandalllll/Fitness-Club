/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author luliu
 */
public class CourseQueue{
    private ArrayList<CourseRequest> courseRequestList;
    
    public CourseQueue(){
        this.courseRequestList = new ArrayList();
    }

    public ArrayList<CourseRequest> getCourseRequestList() {
        return courseRequestList;
    }

    public void setCourseRequestList(ArrayList<CourseRequest> courseRequestList) {
        this.courseRequestList = courseRequestList;
    }
    
    
}
