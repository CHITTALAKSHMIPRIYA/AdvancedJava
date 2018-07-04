package com.bridgelabz;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionCounterListener
 *
 */
@WebListener
public class SessionCounterListener implements HttpSessionListener {

    private static int totalActiveSessions;
    public SessionCounterListener() {
        // TODO Auto-generated constructor stub
    }
    public static int getTotalActiveSession(){
    	return totalActiveSessions;
      }

	
    public void sessionCreated(HttpSessionEvent arg0)  { 
        totalActiveSessions++;
        System.out.println("sessionCreated - add one session into counter");
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	totalActiveSessions--;
    	System.out.println("sessionDestroyed - deduct one session from counter");
             }
	
}
