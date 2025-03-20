/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author srivarinimandali
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHasher {
    public static String hashPassword(String password) {
        try {
            // Create a MessageDigest instance for MD5 hashing
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Add the password bytes to the digest
            md.update(password.getBytes());
            
            // Get the hash bytes
            byte[] bytes = md.digest();
            
            // Convert the bytes to a hexadecimal string
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null; // Handle the error appropriately in your application
        }
    }
}
