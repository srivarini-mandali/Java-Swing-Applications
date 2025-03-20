/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarketAnalytics;
import TheBusiness.Business.Business;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import java.util.*;

/**
 *
 * @author raisi
 */
public class AnalysisHelper {
    
    public HashMap<SolutionOffer, Integer> getBestSolutionOffers(Business business, Boolean print){
        HashMap<SolutionOffer, Integer> best_solution_offers = new HashMap<SolutionOffer, Integer>();
        
        for(SolutionOffer so : business.getSolutionOfferCatalog().getSolutionoffers()) {
            int margin = so.getSolutionPrice() - so.getProduct().getTargetPrice();
            best_solution_offers.put(so, margin);

        } 
        
        if(print){
            // Sort the HashMap by values
            List<Map.Entry<SolutionOffer, Integer>> sortedEntries = sortSolutionOffersByMargin(best_solution_offers);

            // Display the sorted entries
            System.out.println("\n--- Q1: Our top 3 best negotiated solutions");
            int topCount = 3;
            for (int i = sortedEntries.size() - 1; i >= 0 && topCount > 0; i--, topCount--) {
                Map.Entry<SolutionOffer, Integer> entry = sortedEntries.get(i);
                SolutionOffer s = entry.getKey();
                int value = entry.getValue();
                System.out.printf("Market: %-15s \t Channel: %-10s \t Solution_price: %-6d \t Product_name: %-15s \t Margin: %d\n", s.getMarketchannelcomb().getMarket().getName(), s.getMarketchannelcomb().getChannel().getChannelType(), s.getSolutionPrice(), s.getProduct().getName(), value);
    //            System.out.println("Market: "+s.getMarketchannelcomb().getMarket().getName() + "\tChannel: "+ s.getMarketchannelcomb().getChannel().getChannelType() + "\tSolution_price: " + s.getPrice() + "\tProduct_name: " + s.getProduct().getName() + "\tMargin: "+value);
            }
        }
        
        return best_solution_offers;
    }
     
    public HashMap<String, Integer> getBestCustomers(Business business, Boolean print){
        HashMap<String, Integer> best_customers = new HashMap<String, Integer>();
        
        for (Order o : business.getAllOrders()) {
            String cust = o.getCustomer().getCustomerId();
            
            // Getting orderitems for each order
            ArrayList<OrderItem> orderitems = o.getOrderitems();
            for(OrderItem oi: orderitems){
                // Calculating (actualPrice - selectedproduct.getTargetPrice()) * quantity
                int price_performance = oi.calculatePricePerformance();
                // We need customers who purchase products above target price, meaning positive price_performance
                if(price_performance>0){
                    if (best_customers.containsKey(cust)) {
                        best_customers.put(cust, best_customers.get(cust) + 1);
                    } 
                    else {
                        best_customers.put(cust, 1);
                    }
                }
            }
            
        }
        
        if(print){
            // Sort the HashMap by values
            List<Map.Entry<String, Integer>> sortedEntries = sortByValues(best_customers);

            // Display the sorted entries
            System.out.println("\n--- Q2: Our top 3 best customers (customers who buy about target price)");
            int topCount = 3;
            for (int i = sortedEntries.size() - 1; i >= 0 && topCount > 0; i--, topCount--) {
                Map.Entry<String, Integer> entry = sortedEntries.get(i);
                System.out.println("Customer name: "+entry.getKey() + "\t\tNumber of orders bought above target price: " + entry.getValue());
            }
        }
        
        return best_customers;
    }
    
    public HashMap<String, Integer> getBestSalesPeople(Business business, Boolean print){
        HashMap<String, Integer> best_sales_people = new HashMap<String, Integer>();
        
        for (Order o : business.getAllOrders()) {
            String sales_person = o.getSalesperson().getSalesPersonId();
            
            // Getting orderitems for each order
            ArrayList<OrderItem> orderitems = o.getOrderitems();
            for(OrderItem oi: orderitems){
                // Calculating (actualPrice - selectedproduct.getTargetPrice()) * quantity
                int price_performance = oi.calculatePricePerformance();
                
                // We need only salespeople who sold products above target price, meaning positive price_performance
                if(price_performance>0){
                    if (best_sales_people.containsKey(sales_person)) {
                        best_sales_people.put(sales_person, best_sales_people.get(sales_person) + 1);
                    } 
                    else {
                        best_sales_people.put(sales_person, 1);
                    }
                }
            }
            
        }
             
        if(print){
            // Sort the HashMap by values
            List<Map.Entry<String, Integer>> sortedEntries = sortByValues(best_sales_people);

            // Display the sorted entries
            System.out.println("\n--- Q3: Our top 3 best sales people (sell higher that target)");
            int topCount = 3;
            for (int i = sortedEntries.size() - 1; i >= 0 && topCount > 0; i--, topCount--) {
                Map.Entry<String, Integer> entry = sortedEntries.get(i);
                System.out.println("Sales person name: "+entry.getKey() + "\t\tNumber of orders sold above target price: " + entry.getValue());
            }
        }
        
        return best_sales_people;
    }
    
    public HashMap<Market, Integer> totalMarginalRevenueByMarket(Business business, Boolean print){
        HashMap<Market, Integer> margin_by_market = new HashMap<Market, Integer>();
        
        for(Order o : business.getAllOrders()) {
            int margin = o.getOrderPricePerformance();
            Market m = o.getMarket();
            if(margin_by_market.containsKey(m)){
                margin_by_market.put(m, margin_by_market.get(m) + margin);
            }
            else{
                margin_by_market.put(m, margin);
            }
        } 
        
        if(print){
            Iterator<Map.Entry<Market, Integer>> iterator = margin_by_market.entrySet().iterator();
            System.out.println("\n--- Q4: Our total marginal revenue broken down by market that is above or below expected target (actual minus target)");
            String target_above_below;
            while (iterator.hasNext()) {
                Map.Entry<Market, Integer> entry = iterator.next();
                Market m = entry.getKey();
                int value = entry.getValue();
                target_above_below = (value > 0) ? "Above Target" : "Below Target";
                System.out.printf("Market: %-15s \t Margin: %-8d \t Result: %s \n", m.getName(), value, target_above_below);
    //            System.out.println("Market: "+m.getName() + "\t\tMargin: " + value + "\tResult: "+target_above_below);
            }
        }
                
        return margin_by_market;
    }
    
    public HashMap<String, Integer> solutionPricingCheck(Business business){
        HashMap<String, Integer> solution_price_check = new HashMap<String, Integer>();
        String target_count;
        
        System.out.println("\n--- Q5: if the company is pricing its solutions correctly.");
        for(SolutionOffer so: business.getSolutionOfferCatalog().getSolutionoffers()){
            target_count = ((so.getSolutionPrice()- so.getProduct().getTargetPrice())>0) ? "Above Target Count" : "Below Target Count";
            if(solution_price_check.containsKey(target_count)){
                solution_price_check.put(target_count, solution_price_check.get(target_count) + 1);
            }
            else{
                solution_price_check.put(target_count, 1);
            }
        }
        
        Iterator<Map.Entry<String, Integer>> iterator = solution_price_check.entrySet().iterator();
        int belowTargetCount = solution_price_check.get("Below Target Count");
        int aboveTargetCount = solution_price_check.get("Above Target Count");
        int total_solution_offers_count = aboveTargetCount + belowTargetCount;
        float abv_percent = ((float) aboveTargetCount/total_solution_offers_count)*100;
        float blw_percent = ((float) belowTargetCount/total_solution_offers_count)*100;
        System.out.println("Above Target Solution Offers Count: " + aboveTargetCount + "\t\tPercentage: "+ abv_percent  + "%");
        System.out.println("Below Target Solution Offers Count: " + belowTargetCount + "\t\tPercentage: "+ blw_percent + "%");
        
        if(abv_percent > 60 ){
            System.out.println("Company is pricing its solutions correctly");
        }
        else{
            int diff = belowTargetCount - aboveTargetCount; 
            System.out.println("Company is NOT pricing its solutions correctly."
                    + "\nCompany must increase solution price for atleast "+diff+" solution(s), where solution price is less than the target price.\n");
        }
            
        return solution_price_check;
    }
    
    // Function to sort hashmap values of type <String, Integer>
    public static List<Map.Entry<String, Integer>> sortByValues(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());

        // Custom comparator to compare Map.Entry objects by values
        Comparator<Map.Entry<String, Integer>> valueComparator = Comparator.comparing(Map.Entry::getValue);

        // Sort the entryList using the comparator
        entryList.sort(valueComparator);

        return entryList;
    }
    
    // Function to sort hashmap values of type <SolutionOffer, Integer>
    public static List<Map.Entry<SolutionOffer, Integer>> sortSolutionOffersByMargin(HashMap<SolutionOffer, Integer> map) {
        List<Map.Entry<SolutionOffer, Integer>> entryList = new LinkedList<>(map.entrySet());

        // Custom comparator to compare Map.Entry objects by values
        Comparator<Map.Entry<SolutionOffer, Integer>> valueComparator = Comparator.comparing(Map.Entry::getValue);

        // Sort the entryList using the comparator
        entryList.sort(valueComparator);

        return entryList;
    }
    
}
