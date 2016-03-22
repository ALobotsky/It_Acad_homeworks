package homeW14_json;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;


public class Main_Jackson {


			@SuppressWarnings("unchecked")
			public static void main(String[] args) throws IOException {
				
				
				// Парсим файл test.json с помощью jackson
				ObjectMapper mapper = new ObjectMapper();
				
				Root root = null;
				
				try {
				
					root = (Root) mapper.readValue(new FileReader("test.json"), Root.class);
					
					System.out.println("ROOT TO STRING");
				
					System.out.println(root.toString());
				
				}catch(Exception e) {
					
					System.out.println("ERROR Jackson read " + e.getMessage());
				}
			}		

	}


