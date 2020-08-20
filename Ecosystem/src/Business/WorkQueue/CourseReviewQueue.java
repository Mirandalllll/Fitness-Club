/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Course.CourseReview;
import java.util.ArrayList;



/**
 *
 * @author luliu
 */
public class CourseReviewQueue {
    private ArrayList<CourseReviewRequest> classReviewRequestList;
    
    public CourseReviewQueue(CourseReview classreviewrequest){
        this.classReviewRequestList = new ArrayList();
    }

    public ArrayList<CourseReviewRequest> getClassReviewRequestList() {
        return classReviewRequestList;
    }

    public void setClassReviewRequestList(ArrayList<CourseReviewRequest> classReviewRequestList) {
        this.classReviewRequestList = classReviewRequestList;
    }
    
    
}
