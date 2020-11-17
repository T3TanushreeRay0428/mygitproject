package com.tanushree.practice.leetcode;

public class Practice1 {

	public int numberOfSteps(int num) {
		
		
		int count = 0;
		while(num >0){
			System.out.println("count"+count+" num "+num);
			
		if (num % 2 == 0) 
		{
			num = num / 2;
			
		} else
		{

			num = num - 1;
			
		}
		count++;
	    }
		
		return count;
	}

	public static void main(String[] args) {

		int num = 0;
		Practice1 obj = new Practice1();
		
		int count = obj.numberOfSteps(num);
		
		System.out.println(count);

	}

}
