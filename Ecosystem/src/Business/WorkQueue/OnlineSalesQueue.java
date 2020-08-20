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
public class OnlineSalesQueue {
    private ArrayList<OnlineSalesRequest> onlinesalesRequestList;
    
    public OnlineSalesQueue(){
        this.onlinesalesRequestList = new ArrayList();
    }

    public ArrayList<OnlineSalesRequest> getOnlinesalesRequestList() {
        return onlinesalesRequestList;
    }

    public void setOnlinesalesRequestList(ArrayList<OnlineSalesRequest> onlinesalesRequestList) {
        this.onlinesalesRequestList = onlinesalesRequestList;
    }
    
    
    
}
