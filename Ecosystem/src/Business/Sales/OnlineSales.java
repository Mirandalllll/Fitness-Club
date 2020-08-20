/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sales;

/**
 *
 * @author luliu
 */
public class OnlineSales {
    private String itemname;
    private int itemId;
    private static int count = 0;
    private double price;
    
    public OnlineSales(String itemname, double price){
        this.itemname = itemname;
        this.price = price;
        itemId = count;
        count++;
        
    }
    
    @Override
    public String toString(){
        return this.itemname;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        OnlineSales.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
