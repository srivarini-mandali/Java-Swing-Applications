/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Supplier;

import TheBusiness.Business.Business;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class SupplierDirectory {
    ArrayList<Supplier> suppliers;
    Business business;
    
    public SupplierDirectory(Business b){
        this.business = b;
        suppliers = new ArrayList();
    }
    public Supplier newSupplier(String n){
        Supplier supplier = new Supplier(n, business);
        suppliers.add(supplier);
        return supplier;

    }
    public Supplier findSupplier(String id){
        
        for (Supplier supplier: suppliers){
            
            if(supplier.getName().equals(id)) return supplier;
        }
        return null;
        }
    public ArrayList<Supplier> getSuplierList(){
        return suppliers;
    }
    
}