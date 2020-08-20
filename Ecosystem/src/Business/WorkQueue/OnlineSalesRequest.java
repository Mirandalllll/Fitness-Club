/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Sales.OnlineSales;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author luliu
 */
public class OnlineSalesRequest extends WorkRequest{
    private HashMap<OnlineSales, Integer> itemOrder;
    
//    public OnlineSalesRequest(OnlineSales onlinesales){
//        this.onlinesales = onlinesales;
//    }
    
    @Override
    public String toString(){
        String result = "";
        for(Map.Entry<OnlineSales, Integer> e : itemOrder.entrySet())
            result += e.getKey().getItemname()+ "*" + e.getValue() + " ";
        return result;
    }
    
    
    public int getQuantity(){
        int quantity = 0;
        for(Map.Entry<OnlineSales, Integer>e: itemOrder.entrySet())
            quantity += e.getValue();
        return quantity;
    }
    
    public double getTotalPrice(){
        double price = 0;
        for(Map.Entry<OnlineSales, Integer> e : itemOrder.entrySet())
            price += e.getKey().getPrice() * e.getValue();
        return price;
    }

    public OnlineSalesRequest(){
        itemOrder = new HashMap();
    }

    public HashMap<OnlineSales, Integer> getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(HashMap<OnlineSales, Integer> itemOrder) {
        this.itemOrder = itemOrder;
    }
    
}
