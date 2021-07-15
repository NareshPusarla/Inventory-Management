package com.bridgelabz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRice {

	public static void main(String[] args) {
	
		  JSONObject rice = new JSONObject(); 
		  rice.put("name", "Brown rice");
		  rice.put("weight", "50kg"); 
		  rice.put("price", "50");
		  
		  JSONObject pulse = new JSONObject(); 
		  pulse.put("name", "Pulse rice");
		  pulse.put("weight", "60kg"); 
		  pulse.put("price", "60");
		  
		  JSONObject wheat = new JSONObject(); 
		  wheat.put("name", "Wheat rice");
		  wheat.put("weight", "70kg"); 
		  wheat.put("price", "70");
		  
		  JSONArray inventryArray = new JSONArray(); 
		  inventryArray.add(rice);
		  inventryArray.add(pulse); 
		  inventryArray.add(wheat);
		  
		  File file = new File("C:\\Users\\Naresh\\Documents\\inventery.json"); 
		  try {
		  file.createNewFile(); 
		  FileWriter fileWriter = new FileWriter(file);
		  fileWriter.write(inventryArray.toString()); 
		  fileWriter.flush();
		  fileWriter.close(); 
		  } catch (IOException e) { 
			  e.printStackTrace(); 
			  }
		  System.out.println(inventryArray);
		 
	}

}
