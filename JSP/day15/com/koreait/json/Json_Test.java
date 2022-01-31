package com.koreait.json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Test {

	public static void main(String[] args) {
		JSONObject in = new JSONObject();
		in.put("name", "김사과");
		in.put("gender", "남자");
		in.put("age", "10");
		System.out.println( in.toJSONString() );
		
		JSONObject out = new JSONObject();
		out.put("in", in);
		System.out.println( out.toJSONString() );
		
		JSONParser parser = new JSONParser();
		JSONObject p_out = null;
		JSONObject p_in = null;
		String name = null;
		String gender = null;
		int age = 0;
		String json = out.toJSONString();
		
		try {
			p_out = (JSONObject) parser.parse( json );
			p_in = (JSONObject) p_out.get("in");
			gender = (String)p_in.get("gender");
			name = (String) p_in.get("name");
			age =  Integer.parseInt( (String)p_in.get("age") );
			
			System.out.println("gender : " + gender);
			System.out.println("name : " + name);
			System.out.println("age : " + age);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}