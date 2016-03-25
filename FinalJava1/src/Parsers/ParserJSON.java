package Parsers;



import MyException.MyException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserJSON implements ParseInterface {

	@Override
	public Root parse(String filePath) throws  IOException,
								ParseException, java.text.ParseException, MyException {

		if(filePath == null) {

			throw new MyException("ParserJson error file not found");
		}

		Pattern pattern = Pattern.compile("\\.(json)");
		Matcher matcher = pattern.matcher(filePath);

		if(!matcher.find()) {
			throw new MyException("ParserJson error file not json format");
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
		Root root = new Root();

		Scheduls scheduls;
		JSONParser parser = new JSONParser();

		FileReader fileReader = new FileReader(filePath);

		JSONObject object = (JSONObject) parser.parse(fileReader);

		root.setDate(simpleDateFormat.parse(String.valueOf(object.get("date"))));
		root.setName(String.valueOf(object.get("name")));
		JSONArray jsonarray = (JSONArray) object.get("schedule");

		for(int i = 0; i < jsonarray.size(); i++) {

			scheduls = new Scheduls();

			JSONObject jsonObject = (JSONObject) jsonarray.get(i);
			scheduls.setBusNumber(String.valueOf(jsonObject.get("busNumber")));
			scheduls.setDateEnd(simpleDateFormat.parse(String.valueOf(jsonObject.get("dateEnd"))));
			scheduls.setDateStart(simpleDateFormat.parse(String.valueOf(jsonObject.get("dateStart"))));
			scheduls.setId((long)jsonObject.get("id"));
			scheduls.setLocationEnd(String.valueOf(jsonObject.get("locationEnd")));
			scheduls.setLocationStart(String.valueOf(jsonObject.get("locationStart")));
			scheduls.setPrice((long) jsonObject.get("price"));
			JSONArray waypoints = (JSONArray) jsonObject.get("waypoints");
			scheduls.setWaypoints((ArrayList<String>) waypoints);

			root.getSchedulses().add(scheduls);
		}

		fileReader.close();
		return root;
	}

}
