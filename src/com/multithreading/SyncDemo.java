package com.multithreading;

public class SyncDemo {

	public static void main(String[] args) {
		Sender snd = new Sender(); 
        Threads S1 = new Threads( " Hi " , snd ); 
        Threads S2 = new Threads( " Bye " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 


	}

}