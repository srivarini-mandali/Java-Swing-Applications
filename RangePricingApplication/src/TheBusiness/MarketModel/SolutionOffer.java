/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import java.util.ArrayList;
import TheBusiness.ProductManagement.Product;
import TheBusiness.SolutionOrders.SolutionOrder;

/**
 *
 * @author kal bugrara
 */
public class SolutionOffer {
    Product product;
    int price;//floor, ceiling, and target ideas
    String ad;
    MarketChannelAssignment marketchannelcomb;
    ArrayList<SolutionOrder> solutionorders;
    
    public SolutionOffer(MarketChannelAssignment m){
        marketchannelcomb = m;
        solutionorders = new ArrayList();
        m.addSolutionOffer(this); 
       
    } 
    
    public void addProduct(Product p){
        this.product = p;
    }
    public void setSolutionPrice(int p){
        price = p;
        
    }
    public int getSolutionPrice(){
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public MarketChannelAssignment getMarketchannelcomb() {
        return marketchannelcomb;
    }

    public ArrayList<SolutionOrder> getSolutionorders() {
        return solutionorders;
    }
    
    public int getRevenues(){
        int sum = 0;
        for(SolutionOrder so: solutionorders){
            sum = sum + so.getSolutionPrice();
            
        }
        return sum;
    }
    
    public void addSolutionOrder(SolutionOrder so){
        solutionorders.add(so);
    }
    // this will allow one to retrieve all offers meant for this market/channel combo
    public boolean isSolutionOfferMatchMarketChannel(MarketChannelAssignment mca){
        
        if (marketchannelcomb==mca) return true;
        else return false;
    }
    public String getAd(){
        return ad;
    }
    public void setAd(String a){ //this an amazing solution for people like
        ad = a;
    }

    
}
