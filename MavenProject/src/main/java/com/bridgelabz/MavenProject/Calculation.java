package com.bridgelabz.MavenProject;

import java.util.StringTokenizer;

public class Calculation {
 public static int findMax(int ar[])
 {
	 int max=ar[0];
	 for(int i=1;i<ar.length;i++)
	 {
		 if(max<ar[i])
		 {
			 max=ar[i];
		 }
	 }
	return max;
 }
 public static int cube(int n)
 {
	return n*n*n;
	 
 }
 public static String reverseWord(String str)
 {
	 StringBuilder res=new StringBuilder();
	 StringTokenizer st=new StringTokenizer(str,"");
	 while(st.hasMoreTokens())
	 {
		    StringBuilder sb=new StringBuilder();  
	        sb.append(st.nextToken());  
	        sb.reverse();  
	  
	        res.append(sb);  
	        res.append(" ");  
	        }  
	        return res.toString();  
	 }
 }

