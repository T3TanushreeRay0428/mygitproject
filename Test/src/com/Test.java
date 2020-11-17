package com;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

	private static Object kidsWithCandies;

	public static void main(String[] args) {
		
		int[]  candies = {12,1,12};
		int extraCandies = 10;
		
		ArrayList<Boolean> list ;
		
		list=kidsWithCandies(candies,extraCandies);
		
		System.out.println(list);
		
		/*Input: candies = [2,3,5,1,3], extraCandies = 3
				Output: [true,true,true,false,true] */
	         
	}
	
	private static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        int maxCandies;
	        Boolean flag=true;
	        ArrayList<Boolean> list= new ArrayList<Boolean>() ;
	        
	        
	        for(int i=0;i<candies.length;i++){
	        	maxCandies=candies[i]+extraCandies;
	        	flag=true;
	        	
	            for(int j=0;j<candies.length;j++){
	            	
	            	if(maxCandies<candies[j]){
	            		flag=false;
	            		
	                }	
	                
	            }
	            
	            	list.add(flag);
	           
	        }
	        
	        return list;
	}

	
       
        
    }

