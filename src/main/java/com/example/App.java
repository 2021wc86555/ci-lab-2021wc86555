package com.example; 
 
import java.time.LocalDateTime; 
 
public class App {
    public static void main(String[] args) { 
       System.out.println("🚀 CI Pipeline Demo"); 
       System.out.println("Hello from GitHub, Maven, and Jenkins!"); 
       System.out.println("Build triggered at: " + LocalDateTime.now()); 
   }
} 
