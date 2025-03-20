/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import javax.swing.JFrame;

/**
 *
 * @author renuka
 */
public class UserAccount {

    private static int count = 0 ;
    private String accountId;
    private String username;
    private String password;
  

    

    public UserAccount(String username, String password) {
        this.accountId = "user" + this.count++;
        this.username = username;
        this.password = password;
        ;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    

   
}    
    

