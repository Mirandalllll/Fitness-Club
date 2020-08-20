/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Sales.OnlineSalesDirectory;
import Business.WorkQueue.OnlineSalesQueue;
import java.util.ArrayList;

/**
 *
 * @author luliu
 */
public class OnlineSalesEnterprise extends Enterprise{
    private OnlineSalesQueue onlineSalesQueue;
    private OnlineSalesDirectory onlineSalesDirectory;
    
    public OnlineSalesEnterprise(String name){
        super(name, Enterprise.EnterpriseType.OnlineSales);
        this.onlineSalesDirectory = new OnlineSalesDirectory();
        
        onlineSalesQueue = new OnlineSalesQueue();
    }
    
    public ArrayList<Role> getSupportRole(){
        return null;
    }

    public OnlineSalesQueue getOnlineSalesQueue() {
        return onlineSalesQueue;
    }

    public void setOnlineSalesQueue(OnlineSalesQueue onlineSalesQueue) {
        this.onlineSalesQueue = onlineSalesQueue;
    }

    public OnlineSalesDirectory getOnlineSalesDirectory() {
        return onlineSalesDirectory;
    }

    public void setOnlineSalesDirectory(OnlineSalesDirectory onlineSalesDirectory) {
        this.onlineSalesDirectory = onlineSalesDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
