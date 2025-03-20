/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.OrderManagement;

import java.util.ArrayList;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductSummary;
import TheBusiness.SalesManagement.SalesPersonProfile;
import java.time.LocalDateTime;

/**
 *
 * @author kal bugrara
 */
public class Order {

    private ArrayList<OrderItem> orderitems;
    private CustomerProfile customer;
    private SalesPersonProfile salesperson;
    private MarketChannelAssignment mca;
    private String status;
    private ProductSummary productSummary;
    private static int count = 0;
    private int modelNumber;
    private float commission; // New attribute for commission
    private LocalDateTime issueDate;
    private LocalDateTime completionDate;
    private LocalDateTime shippingDate;
    private int targetprice;
    private String market_channel;
    private int order_id;
    private Market market;
    
    public Order(){
         count++;
         modelNumber = count;
    }
    
    public Order(CustomerProfile cp) {
        orderitems = new ArrayList();
        customer = cp;
        customer.addCustomerOrder(this); //we link the order to the customer
        salesperson = null;
        status = "in process";
        count++;
        modelNumber = count;
    }
    
    public Order(CustomerProfile cp, SalesPersonProfile ep, float commission) {
        orderitems = new ArrayList();
        customer = cp;
        salesperson = ep;
        customer.addCustomerOrder(this); //we link the order to the customer
        salesperson.addSalesOrder(this); 
        this.commission = commission;
        count++;
        modelNumber = count;
    }
    
    public Order(int orderId, CustomerProfile cp, SalesPersonProfile ep, float commission, Market m) {
        orderitems = new ArrayList();
        customer = cp;
        salesperson = ep;
//        this.targetprice = targetprice;
//        this.market_channel = market_channel;
        this.order_id = orderId;
        customer.addCustomerOrder(this); //we link the order to the customer
        salesperson.addSalesOrder(this); 
        this.commission = commission;
        this.market = m;
        count++;
        modelNumber = count;
    }
    
    public OrderItem newOrderItem(Product p, int actualprice, int q) {
        OrderItem oi = new OrderItem(p, actualprice, q);
        getOrderitems().add(oi);
        this.issueDate = LocalDateTime.now();
        this.completionDate = this.issueDate.plusDays(10);
        this.shippingDate = this.issueDate.plusDays(5);
        return oi;
    }
    
    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    // Getter and setter for completionDate
    public LocalDateTime getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDateTime completionDate) {
        this.completionDate = completionDate;
    }

    // Getter and setter for shippingDate
    public LocalDateTime getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDateTime shippingDate) {
        this.shippingDate = shippingDate;
    }
    
      public void setCommission(float commission) {
        this.commission = commission;
    }

    // New method to get the commission
    public float getCommission() {
        return this.commission;
    }
    
    //order total is the sumer of the order item totals
    public int getOrderTotal() {
        int sum = 0;
        for (OrderItem oi : getOrderitems()) {
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    
    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : getOrderitems()) {
            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
        }
        return sum;
    }

    public int getNumberOfOrderItemsAboveTarget() {
        int sum = 0;
        for (OrderItem oi : getOrderitems()) {
            if (oi.isActualAboveTarget() == true) {
                sum = sum + 1;
            }
        }
        return sum;
    }
    
    //sum all the item targets and compare to the total of the order 
    public boolean isOrderAboveTotalTarget(){
        int sum = 0;
        for (OrderItem oi: getOrderitems()){
            sum = sum + oi.getOrderItemTargetTotal(); //product targets are added
        }
        if(getOrderTotal()>sum) {return true;}
        else {return false;}
        
    }
    
    public void CancelOrder(){
            setStatus("Cancelled");
    }
    
    public void Submit(){
            setStatus("Submitted");
    }
    
    public void Completed(){
            setStatus("Completed");
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
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
     * @return the customer
     */
    public CustomerProfile getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(CustomerProfile customer) {
        this.customer = customer;
    }

    /**
     * @return the salesperson
     */
    public SalesPersonProfile getSalesperson() {
        return salesperson;
    }
    

    /**
     * @param salesperson the salesperson to set
     */
    public void setSalesperson(SalesPersonProfile salesperson) {
        this.salesperson = salesperson;
    }

    /**
     * @return the mca
     */
    public MarketChannelAssignment getMca() {
        return mca;
    }

    /**
     * @param mca the mca to set
     */
    public void setMca(MarketChannelAssignment mca) {
        this.mca = mca;
    }

    /**
     * @return the productSummary
     */
    public ProductSummary getProductSummary() {
        return productSummary;
    }

    /**
     * @param productSummary the productSummary to set
     */
    public void setProductSummary(ProductSummary productSummary) {
        this.productSummary = productSummary;
    }

    /**
     * @return the modelNumber
     */
    public int getModelNumber() {
        return modelNumber;
    }

    /**
     * @param modelNumber the modelNumber to set
     */
    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }
        
}
