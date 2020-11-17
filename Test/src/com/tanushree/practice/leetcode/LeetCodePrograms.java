package com.tanushree.practice.leetcode;

public class LeetCodePrograms {
	
public String restoreString(String s, int[] indices) {
        
	String str ="" ;
	char c = 0;
	  for(int i=0;i<s.length();i++) {
        	
        	for(int j=0;j<s.length();j++) {
        		if(i==indices[j]) {
        			c=s.charAt(j);
        			break;
        		}
        	}
        	str+=c;
        }
   return str;
}

	public static void main(String[] args) {
		
		String s = "aaiougrt";
		int[]indices = {4,0,2,6,7,3,1,5};
		LeetCodePrograms obj=new LeetCodePrograms();
		String result=obj.restoreString(s, indices);
		System.out.println(result);
	}

}
