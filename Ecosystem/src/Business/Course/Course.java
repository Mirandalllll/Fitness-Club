/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Course;

/**
 *
 * @author luliu
 */
public class Course {
    private double price;
    private int courseId;
    //private int sectionNumber;
    private static int count = 0; //youwenti
    private String courseName;
    private int remainSeats;
    //private String type;(public class& private class)
    
    public Course(String coursename, double price){
        this.courseName = coursename;
        this.price = price;
        courseId = count;
        count++;
    }

    public Course() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return this.courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int classId) {
        this.courseId = courseId;
    }

//    public int getSectionNumber() {
//        return sectionNumber;
//    }
//
//    public void setSectionNumber(int sectionNumber) {
//        this.sectionNumber = sectionNumber;
//    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Course.count = count;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String coursename) {
        this.courseName = coursename;
    }

    public int getRemainSeats() {
        return remainSeats;
    }

    public void setRemainSeats(int remainSeats) {
        this.remainSeats = remainSeats;
    }

    
    
    
}
