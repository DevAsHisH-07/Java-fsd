package com.multithreading;

import java.io.*; 
import java.util.*; 

public class Threads extends Thread{
	private String msg; 
    private Threads t; 
    Sender  sender; 
    Threads(String m,  Sender obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 


}