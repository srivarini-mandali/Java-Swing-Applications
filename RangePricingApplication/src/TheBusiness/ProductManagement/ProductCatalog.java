/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.ProductManagement;

import TheBusiness.Business.Business;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class ProductCatalog {

    String type;
    ArrayList<Product> products; //list of products initially empty
    Business business;
    
    public ProductCatalog(String n, Business b) {
//        type = n;
        this.products = new ArrayList<>();  ///create the list of elements otherwise it is null
        this.business=b;
    }
// new ProductCatalog(); or new ProductCatalog("Printers");
    public ProductCatalog(    ) {
//        type = "unknown";
        this.products = new ArrayList<>();
    }
    public Product newProduct(int fp, int cp, int tp) {
        Product p = new Product(fp, cp, tp);
        products.add(p);
        return p;
    }
    public Product newProduct(String n, int fp, int cp, int tp) {
        Product p = new Product(n,fp, cp, tp);
        products.add(p);
        return p;
    }

    public ProductsReport generatProductPerformanceReport() {
        ProductsReport productsreport = new ProductsReport();

        for (Product p : products) {

            ProductSummary ps = new ProductSummary(p, business);
            productsreport.addProductSummary(ps);
        }
        return productsreport;
    }

    public ArrayList<Product> getProductList(){
        return products;
    }


    public boolean containsProduct(String productName) {
        for (Product p : products) {
        if (p.getName().equals(productName)) {
            return true;
        }
    }
    return false;
    }
    public Product getProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null; // Product not found
    }



}
