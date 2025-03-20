/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.ProductManagement;

import TheBusiness.Business.Business;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
//this class will extract summary data from the product
public class ProductSummary {

    Product subjectproduct;
    int salesabovetarget;
    int salesbelowtarget;
    int priceperformance; //total profit above target --could be negative too
    int acutalsalesvolume;
    int rank; // will be done later
    Business business;

    public ProductSummary(Product p, Business b) {
        
        this.business = b;
        subjectproduct = p; //keeps track of the product itself not as well;
        salesabovetarget = getNumberAboveTarget(p);
        priceperformance = getProductPricePerformance(p);
        acutalsalesvolume = getSalesVolume(p);
        salesbelowtarget = getNumberBelowTarget(p);
    }

    public int getSalesRevenues() {
        return acutalsalesvolume;
    }

    public int getNumberAboveTarget(Product p) {
        int freq_above=0;
        for(Order o: business.getMasterorderlist().getOrders()){
            for(OrderItem oi: o.getOrderitems()){
                if(p.getName().equals(oi.getSelectedProduct().getName()) && oi.getActualPrice() >= oi.getSelectedProduct().getTargetPrice()){
                    freq_above+=1;
                }
            }
        }
        return freq_above;
    }

    public int getProductPricePerformance(Product p) {
        int price_performance=0;
        for(Order o: business.getMasterorderlist().getOrders()){
            for(OrderItem oi: o.getOrderitems()){
                if(p.getName().equals(oi.getSelectedProduct().getName())){
                    price_performance+=oi.calculatePricePerformance();
                }
            }
        }
        
        
        return price_performance;
    }

    public int getNumberBelowTarget(Product p) {
        int freq_below=0;
        for(Order o: business.getMasterorderlist().getOrders()){
            for(OrderItem oi: o.getOrderitems()){
                if(p.getName().equals(oi.getSelectedProduct().getName()) && oi.getActualPrice() < oi.getSelectedProduct().getTargetPrice()){
                    freq_below+=1;
                }
            }
        }
        return freq_below;
    }

    public boolean isProductAlwaysAboveTarget() {
        return false; // to be implemented
    }

    private int getSalesVolume(Product p) {
        int salesVolume=0;
        for(Order o: business.getMasterorderlist().getOrders()){
            for(OrderItem oi: o.getOrderitems()){
                if(p.getName().equals(oi.getSelectedProduct().getName())){
                    salesVolume+=oi.getOrderItemTotal();
                }
            }
        }
        
        
        return salesVolume;
    }

    public Product getSubjectproduct() {
        return subjectproduct;
    }

    public int getSalesabovetarget() {
        return salesabovetarget;
    }

    public int getSalesbelowtarget() {
        return salesbelowtarget;
    }

    public int getPriceperformance() {
        return priceperformance;
    }
    
        
}
