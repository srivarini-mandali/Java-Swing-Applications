/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Main;

import MarketingManagement.MarketingPersonDirectory;
import MarketingManagement.MarketingPersonProfile;
import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketCatalog;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.MarketChannelComboCatalog;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.MarketModel.SolutionOfferCatalog;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Personnel.EmployeeDirectory;
import TheBusiness.Personnel.EmployeeProfile;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.PersonDirectory;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.SalesManagement.SalesPersonDirectory;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.Supplier.Supplier;
import TheBusiness.Supplier.SupplierDirectory;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.UserAccountManagement.UserAccountDirectory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Xerox");
        //product data
        readDataFromCSV(business, "./CSV_Data/productData.csv");
        readMarketDatafromCSV(business,"./CSV_Data/market.csv");
        readUserAccountDataFromCSV(business, "./CSV_Data/user_accounts.csv");
        readChannelDataFromCSV(business, "./CSV_Data/channel.csv");
        readMarketChannelMappingFromCSV(business,"./CSV_Data/marketChannelMapping.csv");
        readOrdersFromCSV(business,"./CSV_Data/order.csv");
        readMarketChannelSolutionsFromCSV(business,"./CSV_Data/marketchannelsolution.csv");
//        printAllProductCatalogs(business);
//        printAllSuppliers(business);
//        printAllUsers(business);
        printAllOrders(business);
        printAllSolutionOffers(business);
        return business;

    }
    private static void readChannelDataFromCSV(Business business, String pathToYourCSVFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathToYourCSVFile))) {
            // Skip the header line
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] data = line.split(",");
                    if (data.length < 3) {
                        // Skip lines with insufficient data
                        continue;
                    }

                    String channelType = data[0].trim();
                    int price = Integer.parseInt(data[1].trim());
                    String unitOfMeasure = data[2].trim();

                    // Create a channel based on the read data
                    // Assuming you have a ChannelCatalog in your Business class
                    business.getChannelCatalog().newChannel(channelType, price, unitOfMeasure);

                } catch (NumberFormatException e) {
                    System.err.println("Error parsing line: " + line);
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readDataFromCSV(Business business, String pathtoyourcsvfilecsv) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathtoyourcsvfilecsv))) {
            String line;
            SupplierDirectory supplierDirectory = business.getSupplierDirectory();
            ProductCatalog p_catalog = business.getProductcatalog();
            
            while ((line = br.readLine()) != null) {
                try {
                    String[] data = line.split(",");
                    if (data.length < 5) {
                        continue; // Skip lines with insufficient data
                    }
                    
                    String supplierName = data[0].trim();
                    String productName = data[1].trim();
                    int floorPrice = Integer.parseInt(data[2].trim());
                    int ceilingPrice = Integer.parseInt(data[3].trim());
                    int targetPrice = Integer.parseInt(data[4].trim());
    //                int actualPrice = Integer.parseInt(data[5].trim());
    //                int quantity = Integer.parseInt(data[6].trim());

                    // Check if supplier already exists, else create a new one
                    Supplier supplier = supplierDirectory.findSupplier(supplierName);
                    if (supplier == null) {
                        supplier = supplierDirectory.newSupplier(supplierName);
                    }

                    ProductCatalog productCatalog = supplier.getProductCatalog();
                    // Add product if it's not already in the catalog
                    Product product = null;
                    if (!productCatalog.containsProduct(productName)) {
                        product = productCatalog.newProduct(productName, floorPrice, ceilingPrice, targetPrice);
                    } else {
                        product = productCatalog.getProduct(productName);
                    }
                    
                    if (!p_catalog.containsProduct(productName)) {
                        product = p_catalog.newProduct(productName, floorPrice, ceilingPrice, targetPrice);
                    } else {
                        product = p_catalog.getProduct(productName);
                    }

                    // Add an OrderItem for the product
    //                OrderItem orderItem = new OrderItem(product, actualPrice, quantity);

                } catch (NumberFormatException e) {
                    System.err.println("Error parsing line: " + line);
                    e.printStackTrace();
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        PersonDirectory persondirectory = business.getPersonDirectory();
        // person representing sales organization        
        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001);

// Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001);

// Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales", "sales"); /// order products for one of the customers and performed by a sales person
        UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "marketing"); /// order products for one of the customers and performed by a sales person
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "Admin", "admin"); /// order products for one of the customers and performed by a sales person
/// order products for one of the customers and performed by a sales person 
    }

    private static void printAllProductCatalogs(Business business) {
        SupplierDirectory supplierDirectory = business.getSupplierDirectory();
        ArrayList<Supplier> suppliers = supplierDirectory.getSuplierList();

        for (Supplier supplier : suppliers) {
            System.out.println("Supplier: " + supplier.getName());
            ProductCatalog productCatalog = supplier.getProductCatalog();
            for (Product product : productCatalog.getProductList()) {
                System.out.println("  Product Name: " + product.getName() +
                                   ", Floor Price: " + product.getFloorPrice() +
                                   ", Ceiling Price: " + product.getCeilingPrice() +
                                   ", Target Price: " + product.getTargetPrice());
            }
        }
    }

    private static void printAllSuppliers(Business business) {
        SupplierDirectory supplierDirectory = business.getSupplierDirectory();
        ArrayList<Supplier> suppliers = supplierDirectory.getSuplierList();

        System.out.println("Suppliers:");
        for (Supplier supplier : suppliers) {
            System.out.println("  Supplier Name: " + supplier.getName());
            // Here you can also print more details of each supplier if needed
        }
    }
    
    private static void printAllUsers(Business business) {
        UserAccountDirectory userAccountDirectory = business.getUserAccountDirectory();
        ArrayList<UserAccount> userAccounts = userAccountDirectory.useraccountlist; 

        System.out.println("User Accounts:");
        for (UserAccount userAccount : userAccounts) {
            System.out.println("  Username: " + userAccount.getUsername() +
                               ", Role: " + userAccount.getRole() +
                               ", Person ID: " + userAccount.getPersonId());
        }
    }
   
    private static void readMarketDatafromCSV(Business business, String pathtoyourcsvfilecsv) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathtoyourcsvfilecsv))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] data = line.split(",");

            // Assuming the order of columns is Main Market, Sub Market, Sub Market Type, Characteristics
            String mainMarketName = data[0].trim();
            String characteristics = data[1].trim();
//            ArrayList<String> characteristicsList = new ArrayList<>();
//            characteristicsList.add(characteristics);
            MarketCatalog marketCatalog = business.getMarketCatalog();
            Market market = findMarketByName(mainMarketName, marketCatalog.getMarkets());
            if (market == null) {
                market = new Market(mainMarketName);
                marketCatalog.addMarket(market);
            }
                        market.setCharacteristics(characteristics);

//            Market mainMarket = findMarketByName(mainMarketName, marketCatalog.getMarkets());
//            if (mainMarket == null) {
//                mainMarket = new Market(mainMarketName);
//                mainMarket.setCharacteristics(characteristicsList);
//                marketCatalog.addMarket(mainMarket);
//            }

             
            // Find or create the sub market
//            Market subMarket = findMarketByName(subMarketName, mainMarket.getSubmarkets());
//            if (subMarket == null) {
//                subMarket = new Market(subMarketName);
//                mainMarket.addSubmarket(subMarket);
//            }
//
//            // Set sub market type and characteristics
//            subMarket.setSubmarketType(subMarketType);
//            subMarket.setCharacteristics(characteristicsList);

                } catch (NumberFormatException e) {
                    System.err.println("Error parsing line: " + line);
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  static Market findMarketByName(String marketName, ArrayList<Market> markets) {
        for (Market market : markets) {
            if (market.getName().equals(marketName)) {
                return market;
            }
        }
        return null; // Market not found
    }
    
    private static void readUserAccountDataFromCSV(Business business, String user_accountscsv) {
        try (BufferedReader br = new BufferedReader(new FileReader(user_accountscsv))) {
            
            // Skip the header line
            br.readLine();
            
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] data = line.split(",");
                    if (data.length < 4) {
                        // Skip lines with insufficient data
                        continue;
                    }

                    String username = data[0].trim();
                    String password = data[1].trim();
                    String personId = data[2].trim();
                    String role = data[3].trim();

                      // Find or create the person in the person directory
                    PersonDirectory personDirectory = business.getPersonDirectory();
                    Person person = personDirectory.findPerson(personId);
                    if (person == null) {
                        person = personDirectory.newPerson(personId);
                    }

                    // Create a user account based on the role
                    UserAccountDirectory userAccountDirectory = business.getUserAccountDirectory();
                    switch (role.toLowerCase()) {
                        case "sales":
                            SalesPersonDirectory salesPersonDirectory = business.getSalesPersonDirectory();
                            SalesPersonProfile salesPersonProfile = salesPersonDirectory.newSalesPersonProfile(person);
                            userAccountDirectory.newUserAccount(salesPersonProfile, username, password);
                            break;
                        case "marketing":
                            MarketingPersonDirectory marketingPersonDirectory = business.getMarketingPersonDirectory();
                            MarketingPersonProfile marketingPersonProfile = marketingPersonDirectory.newMarketingPersonProfile(person);
                            userAccountDirectory.newUserAccount(marketingPersonProfile, username, password);
                            break;
                        case "admin":
                            EmployeeDirectory employeeDirectory = business.getEmployeeDirectory();
                            EmployeeProfile employeeProfile = employeeDirectory.newEmployeeProfile(person);
                            userAccountDirectory.newUserAccount(employeeProfile, username, password);
                            break;
                        case "customer":
                            CustomerDirectory customerDirectory = business.getCustomerDirectory();
                            CustomerProfile customerProfile = customerDirectory.newCustomerProfile(person);
                            userAccountDirectory.newUserAccount(customerProfile, username, password);
                            break;
                        default:
                            System.out.println("Unknown role: " + role);
                    }

                } catch (NumberFormatException e) {
                    System.err.println("Error parsing line: " + line);
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void readMarketChannelMappingFromCSV(Business business, String pathToYourCSVFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathToYourCSVFile))) {
            // Skip the header line
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] data = line.split(","); // Assuming tab-delimited data
                    if (data.length < 3) {
                        // Skip lines with insufficient data
                        continue;
                    }

                    String mainMarketName = data[0].trim();
                    String channelType = data[1].trim();
                    int adBudget = Integer.parseInt(data[2].trim());

                    MarketCatalog marketCatalog = business.getMarketCatalog();

                    // Find or create the main market
                    Market mainMarket = findMarketByName(mainMarketName, marketCatalog.getMarkets());
                    if (mainMarket == null) {
                        mainMarket = new Market(mainMarketName);
                        marketCatalog.addMarket(mainMarket);
                        
                    }

                    // Create a MarketChannelMapping and add it to the main market
//                    mainMarket.addMarketChannelMapping(channelType, adBudget);

                } catch (NumberFormatException e) {
                    System.err.println("Error parsing line: " + line);
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void readOrdersFromCSV(Business business, String pathToYourCSVFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathToYourCSVFile))) {
            // Skip the header line
            br.readLine();
            String line;
            MasterOrderList mol = business.getMasterorderlist();
            ArrayList<Order> all_orders=mol.getOrders();
            
            while ((line = br.readLine()) != null) {
                try {
                    String[] data = line.split(","); 
                    if (data.length < 11) {
                        // Skip lines with insufficient data
                        continue;
                    }
                    
                    
                    int order_id = Integer.parseInt(data[0].trim());
                    String product_name = data[1].trim();
                    int actual_price = Integer.parseInt(data[2].trim());
                    int target_price = Integer.parseInt(data[3].trim());
                    int quantity = Integer.parseInt(data[4].trim());
                    String sales_person_associated = data[5].trim();
                    String customer_associated = data[6].trim();
                    String solution_if_applied = data[7].trim();
                    float commission = Float.parseFloat(data[8].trim());
                    String market = data[9].trim();
                    String channel = data[10].trim();

                    Person customer_person = new Person(customer_associated);
                    CustomerProfile cp = new CustomerProfile(customer_person);
                    
                    Person sales_person = new Person(sales_person_associated);
                    SalesPersonProfile sp = new SalesPersonProfile(sales_person);
                    
                    Market m = business.getMarketCatalog().findMarket(market);
                    
                    int flag=0;
                    
                    //if order id is same, create order item only for the same order
                    for(Order order: all_orders){
                        if(order.getOrder_id()==(order_id)){                           
                            flag=1;
                            ProductCatalog p_catalog = business.getProductcatalog();
                            Product p = p_catalog.getProduct(product_name);
                            order.newOrderItem(p, actual_price, quantity);
                            
                        }
                    }

                    
//                   if order_id is different, create another order
                    if(flag==0){
                        Order o = mol.newOrder(order_id, cp, sp, commission, m);
                        ProductCatalog p_catalog = business.getProductcatalog();
                        Product p = p_catalog.getProduct(product_name);
                        o.newOrderItem(p, actual_price, quantity);
                    }
                    
//                  newOrderItem(Product p, int actualprice, int q)

                } catch (NumberFormatException e) {
                    System.err.println("Error parsing line: " + line);
                    e.printStackTrace();
                }
                
                
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readMarketChannelSolutionsFromCSV(Business business, String pathToYourCSVFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathToYourCSVFile))) {
            // Skip the header line
            br.readLine();
            String line;
            SolutionOfferCatalog solution_offer_cat = business.getSolutionOfferCatalog();
            MarketChannelComboCatalog mccc = business.getMarketChannelComboCatalog();
            
            while ((line = br.readLine()) != null) {
                try {
                    String[] data = line.split(","); 
                    if (data.length < 6) {
                        // Skip lines with insufficient data
                        continue;
                    }  
                    
                    
                    // Reading csv data and assigning values
                    String market_name = data[0].trim();
                    String channel_type = data[1].trim();
                    String product_name = data[2].trim();
                    int solution_price = Integer.parseInt(data[3].trim());
                    int target_price = Integer.parseInt(data[4].trim());
                    String solution_order_list = data[5].trim();
                    
                    // Creating Market, Channel, Product objects
                    Market m = new Market(market_name);
                    Channel c = new Channel(channel_type);
                    ProductCatalog p_catalog = business.getProductcatalog();    
                    Product p = p_catalog.getProduct(product_name); //getting product object from product_catalog using product_name
                    
                    // Creating new MarketChannelCombo
                    MarketChannelAssignment new_mca = mccc.newMarketChannelCombo(m, c);
                    // Adding SolutionOffer for the MarketChannelCombo
                    SolutionOffer s = solution_offer_cat.newSolutionOffer(new_mca);
                    s.addProduct(p);
                    s.setSolutionPrice(solution_price);
                    
                } catch (NumberFormatException e) {
                    System.err.println("Error parsing line: " + line);
                    e.printStackTrace();
                }    
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printAllOrders(Business business){
        ArrayList<Order> all_orders = business.getMasterorderlist().getOrders();
        
        System.out.println("-------- All orders --------");
        for(Order order: all_orders){
            ArrayList<OrderItem> orderitems = order.getOrderitems();
            for(OrderItem oi: orderitems){
                System.out.printf("Order_id: %-3s \t Product: %-15s \t Actual_price: %-6d \t Quantity: %d \n", order.getOrder_id(), oi.getSelectedProduct().getName(), oi.getActualPrice(), oi.getQuantity());
//                System.out.println("Order_id: "+order.getOrder_id()+ "\tProduct: "+oi.getSelectedProduct().getName() +"\t\tActual_price: "+ oi.getActualPrice() + " \tQuantity: " + oi.getQuantity());
            }
        }
        
    }
    
    private static void printAllSolutionOffers(Business business){
        SolutionOfferCatalog solution_offer_cat = business.getSolutionOfferCatalog();

        System.out.println("\n-------- Solution Offers Catalog --------");
        for(SolutionOffer s: solution_offer_cat.getSolutionoffers()){
            System.out.printf("Market: %-15s \t Channel: %-10s \t Solution_price: %-6d \t Product_name: %s \n", s.getMarketchannelcomb().getMarket().getName(), s.getMarketchannelcomb().getChannel().getChannelType(), s.getSolutionPrice(), s.getProduct().getName());
//            System.out.println("Market: "+s.getMarketchannelcomb().getMarket().getName() + "\t\tChannel: "+ s.getMarketchannelcomb().getChannel().getChannelType() + "\t\tSolution_price: " + s.getPrice() + "\t\tProduct_name: " + s.getProduct().getName());
        }
        System.out.println("\n");
    }
}


