/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Supplier;

import TheBusiness.Business.Business;
import java.util.ArrayList;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.ProductManagement.ProductSummary;
import TheBusiness.ProductManagement.ProductsReport;

/**
 *
 * @author kal bugrara
 */
public class Supplier {
    String name;
    ProductCatalog productcatalog;
    ProductsReport productsreport;
    Business business;
    
    public Supplier(String n, Business b){
        name = n;
        this.business = b;
        productcatalog = new ProductCatalog("software", business);
    }
    
    public ProductsReport prepareProductsReport(){
        productsreport = productcatalog.generatProductPerformanceReport();
        return productsreport;
    }
    
    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget(){
        if(productsreport==null) productsreport = prepareProductsReport();
        return productsreport.getProductsAlwaysAboveTarget();
       
    }
    
    public String getName(){
        return name;
    }
    
    public ProductCatalog getProductCatalog(){
        return productcatalog;
    }
    //add supplier product ..
    
    //update supplier product ...
    @Override
    public String toString(){
       return name;
       
   }
}
