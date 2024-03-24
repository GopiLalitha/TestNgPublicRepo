package testngpackage;

import java.util.HashSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Automation";
	    HashSet<String> set1=new HashSet<String>();
	     int len=str.length();
	     for(int i=0;i<len;i++){
	       char ch=str.charAt(i) ;
	        set1.add(String.valueOf(ch));
	        System.out.println(set1);
	     }
	    
	     
	}

}
