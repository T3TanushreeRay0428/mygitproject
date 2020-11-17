package com.tanushree.practice.leetcode;

public class Subtract {

public int subtractProductAndSum(int n) {
	   
	int product=1;
	int sum=0;
	int result = 0;
	while(n !=0) {

		
		product = product * (n%10);
		sum=sum+(n%10);
		n=n/10;
		result=product-sum;
	}
	 return result;
	
    }
	public static void main(String[] args) {

		Subtract obj=new Subtract();
		int num=234;
		int result=obj.subtractProductAndSum(num);
		System.out.println(result);
	}

}
