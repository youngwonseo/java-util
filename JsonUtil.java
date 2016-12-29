

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import twitter4j.JSONObject;

public class JsonUtil {
	public static Map jsonToMap(String jsonStr) throws Exception{
		ObjectMapper mapper = new ObjectMapper();		
		Map map = mapper.readValue(jsonStr,new TypeReference<Map<String,String>>(){});
		return map;
	}
	
	
	public static void main(String[] args){
		try{
			String json = "{\"id\":\"youngwon\",\"name\":\"¼­¿µ¿ø\",\"age\":28}";
			
			JSONObject jsonObj = new JSONObject(json);
			System.out.println(jsonToMap(jsonObj.toString()));
			
			
			//System.out.println(json);			
			System.out.println(jsonToMap(json));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


