/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sales;

import java.util.ArrayList;

/**
 *
 * @author luliu
 */
public class OnlineSalesDirectory {
    private ArrayList<OnlineSales> onlineSalesList;
    
    public OnlineSalesDirectory(){
        this.onlineSalesList = new ArrayList();
    }

    public ArrayList<OnlineSales> getOnlineSalesList() {
        return onlineSalesList;
    }

    public void setOnlineSalesList(ArrayList<OnlineSales> onlineSalesList) {
        this.onlineSalesList = onlineSalesList;
    }
    
    
    
    
}
