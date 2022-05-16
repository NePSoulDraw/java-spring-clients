
package com.clients.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncryption {
    
    public static void main(String[] args) {
        
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        
        /*
        String password = "123";
        
        System.out.println("Contrasena no encriptada: " + password);
        
        System.out.println("Contrasena encriptada: " + passwordEncryption(password));
        */
        
    }
    
    public static String passwordEncryption(String password){
        
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        return encoder.encode(password);
        
    }
    
}
