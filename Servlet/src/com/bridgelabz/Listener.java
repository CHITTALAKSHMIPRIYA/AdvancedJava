package com.bridgelabz;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Listener
 *
 */
@WebListener
public class Listener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public Listener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
      System.out.println("Request Destroyed"+arg0.getServletRequest().getProtocol());
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("Request intialized"+arg0.getServletRequest().getLocalAddr());
    }
	
}
