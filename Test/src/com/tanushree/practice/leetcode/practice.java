package com.tanushree.practice.leetcode;

public class practice {
	
public int numJewelsInStones(String J, String S) {
        int count=0;
        char c;
        char c1;
        
	   for(int i=0;i< S.length();i++) {
		   c=S.charAt(i);
		   for(int j=0;j<J.length();j++) {
		    c1=J.charAt(j);
		   if(c==c1) {
    	   count ++;
       
		   }
        }
	   }
	   return count;
    }


	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAbbbb";
		practice obj= new practice();
		int count=obj.numJewelsInStones(J,S);
		System.out.println(count);
		
	}

}
