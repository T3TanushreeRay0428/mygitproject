package com;

public class Test1 {

	public int numIdenticalPairs(int[] nums) {
		System.out.println("tetst");
        int count=0;
        int i,j;
        for(i=0;i<nums.length;i++) {
        	for(j=1;j<nums.length;j++) {
        		if(nums[i]==nums[j]&& i<j) {
        			count++;
        			
        		}
        	}
        	
        }
        
        return count;
    }
		    

		    

	public static void main(String[] args) {
      
		int[] nums= {1,2,3,1,1,3};
		Test1 obj=new Test1();
		int count =obj.numIdenticalPairs(nums);
		
		System.out.println(count);
		
		   }
		
	}


