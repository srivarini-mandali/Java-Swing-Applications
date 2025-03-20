/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.ProductManagement;

import java.util.ArrayList;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Business.Business;
/**
 *
 * @author kal bugrara
 */
public class Product {
    private String name;

    public String getName() {
        return name;
    }
    private int floorPrice;
    private int ceilingPrice;
    private int targetPrice;
    private ArrayList<OrderItem> orderitems;
    private Business business;
    
    public Product( int fp, int cp, int tp) {

        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList();
        
    }
    public Product(String n, int fp, int cp, int tp) {
        name = n;
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList();
    }
       
    public Product updateProduct(int fp, int cp, int tp) {
        setFloorPrice(fp);
        setCeilingPrice(cp);
        setTargetPrice(tp);
        return this; //returns itself
    }
    
    public int getTargetPrice() {return targetPrice;}
    
    public void addOrderItem(OrderItem oi){     
        getOrderitems().add(oi);
    }
    
    //Number of item sales above target 
    public int getNumberOfProductSalesAboveTarget(){
        int sum = 0;
        for (OrderItem oi: getOrderitems()){
            if(oi.isActualAboveTarget()==true) sum = sum +1;
        }
        return sum;
    }
    
    public int getNumberOfProductSalesBelowTarget(){
        int sum = 0;
        for (OrderItem oi: getOrderitems()){
            if(oi.isActualBelowTarget()==true) sum = sum +1;
        }
        return sum;
    }    
    
    public boolean isProductAlwaysAboveTarget(){    
        for (OrderItem oi: getOrderitems()){
            if(oi.isActualAboveTarget()==false) return false; //
        }
        return true;
    }
    
    //calculates the revenues gained or lost (in relation to the target)
    //For example, if target is at $2000 and actual is $2500 then revenue gained
    // is $500 above the expected target. If the actual is $1800 then the lose will be $200
    // Add all these difference to get the total including wins and loses
    
    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : getOrderitems()) {
            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
        }
        return sum;
    }
    
    public int getSalesVolume() {
        int sum = 0;
        for (OrderItem oi : getOrderitems()) {
            sum = sum + oi.getOrderItemTotal();     //positive and negative values       
        }
        return sum;
    }
    
    public void setName(String n){
        name = n;
    }
    
    @Override
    public String toString(){
        return getName();
    }
    
    public int getFloorPrice(){
        return floorPrice;
    }
    
    public int getCeilingPrice(){
        return ceilingPrice;
    }

    /**
     * @param floorPrice the floorPrice to set
     */
    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    /**
     * @param ceilingPrice the ceilingPrice to set
     */
    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    /**
     * @param targetPrice the targetPrice to set
     */
    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    /**
     * @return the orderitems
     */
    public ArrayList<OrderItem> getOrderitems() {
        return orderitems;
    }

    /**
     * @param orderitems the orderitems to set
     */
    public void setOrderitems(ArrayList<OrderItem> orderitems) {
        this.orderitems = orderitems;
    }

    /**
     * @return the business
     */
    public Business getBusiness() {
        return business;
    }

    /**
     * @param business the business to set
     */
    public void setBusiness(Business business) {
        this.business = business;
    }

}
