/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.Course.CourseReview;

/**
 *
 * @author luliu
 */
public class CourseReviewRequest extends WorkRequest{
    private CourseReview coursereviewrequest;
    
    public CourseReviewRequest(CourseReview classreivew){
        this.coursereviewrequest = coursereviewrequest;
    }
    
    @Override
    public String toString(){
        return this.coursereviewrequest.toString();
    }

    public CourseReview getCoursereview() {
        return coursereviewrequest;
    }

    public void setCoursereview(CourseReview coursereview) {
        this.coursereviewrequest = coursereviewrequest;
    }
    
    
}
