package com.bridgelabz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventeryManager {
	List<Inventery> inventery;
	JSONArray inventryArray = new JSONArray();
	
	public void read() {
		
		JSONParser parser = new JSONParser();
		try {
			JSONArray obj = (JSONArray) parser.parse(new FileReader("C:\\Users\\Naresh\\Documents\\inventery.json"));
			
			ObjectMapper objectMapper = new ObjectMapper();
			inventery =  objectMapper.readValue(obj.toString(), new TypeReference<List<Inventery>>() {});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void add(JSONObject object) {
		inventryArray.add(object);
	}
	
	public void write() {
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
	}
	
	public void print() {
		System.out.println(inventery);
	}

	
}
