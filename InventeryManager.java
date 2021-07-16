package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InventeryManager {
	Map obj = new HashMap();
	
	public void add() {
		
		  obj.put("name", "Brown rice");
		  obj.put("weight", "50kg"); 
		  obj.put("price", "50");
		  System.out.println(obj);
		  
		  obj.put("name", "pulse rice");
		  obj.put("weight", "60kg"); 
		  obj.put("price", "60");
		  System.out.println(obj);
		  
		  obj.put("name", "wheat rice");
		  obj.put("weight", "70kg"); 
		  obj.put("price", "70");
		System.out.println(obj);
}
	
}
