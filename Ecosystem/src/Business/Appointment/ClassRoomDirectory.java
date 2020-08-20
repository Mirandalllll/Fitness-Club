/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import java.util.ArrayList;

/**
 *
 * @author luliu
 */
public class ClassRoomDirectory {
    private ArrayList<ClassRoom> classRoomList;
    
    public ClassRoomDirectory(){
        this.classRoomList = new ArrayList();
        for(int i = 0; i < 25; i++){
            ClassRoom classRoom = new ClassRoom();
            this.classRoomList.add(classRoom);
        }
    }
    
    public ArrayList<ClassRoom> getClassRoomList(){
        return classRoomList;
    }
    
    public void setClassRoomList(ArrayList<ClassRoom> classRoomList){
        this.classRoomList = classRoomList;
    }
}
