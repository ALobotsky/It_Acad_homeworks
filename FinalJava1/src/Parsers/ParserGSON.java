package Parsers;


import MyException.MyException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserGSON implements ParseIn {

    @Override
    public Root parse(String filePath) throws Exception {

        if (filePath == null) {
            throw new MyException("ParserGson error file not found");
        }

        Pattern pattern = Pattern.compile("\\.(json)");
        Matcher matcher = pattern.matcher(filePath);

        if (!matcher.find()) {
            throw new MyException("ParserGson error file not xml format");
        }

        FileReader fileReader = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fileReader);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss Z").create();
        Root root = gson.fromJson(reader, Root.class);
        fileReader.close();

        return root;
    }

}
