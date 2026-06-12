package Demo;

import java.util.ArrayList;

public class Democlass {

	public static void main(String[] args) {
		System.out.println("Thank you my loving god venkateswara");
		
	        String str="{{[()]}}";
	        ArrayList<Character> sb=new ArrayList<Character>();
	        for(int i=0;i<str.length();i++)
	        {
		            if(sb.size()>0 &&((str.charAt(i)=='}'&& sb.get(sb.size()-1)=='{'))||(str.charAt(i)==']'&& sb.get(sb.size()-1)=='[')||(str.charAt(i)==')'&& sb.get(sb.size()-1)=='('))
{
	                sb.remove(sb.size()-1);
	            }
	            else {
	 	                sb.add(str.charAt(i));
	            }
	}
	
	
	            
	        if(sb.size()==0)
	        {
	            System.out.println("String is balanced");
	    }
	    else
	    System.out.println("String isnot balanced");
	}
	}

	