package Practise1;

import java.util.*;
public class pawan {

	    public static void main(String[] args) {
	        String name = "my name is pawan";
	        char arr[] = name.toCharArray();
	        HashMap<Object,Object> map = new HashMap<>();
	        
	        for(char a : arr)
	        {
	            map.put(a,map.getOrDefault(a,0));
	        }

	        System.out.println(map);    
	        
	        
	        
	        
	        
	    }
	}

