package homework13_SAX;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.*;

import org.xml.sax.*;
import org.xml.sax.helpers.*;



public class Main {

	public static void main(String[] args) {

SAXParserFactory factory = SAXParserFactory.newInstance();
		
		SAXParser parser = null;
		
		try {
			
			parser = factory.newSAXParser();
			
		} catch (ParserConfigurationException | SAXException e) {
		
			e.printStackTrace();
		} 
		
		SAXparsing saxp = null; 
		 
		try {
			
			saxp = new SAXparsing();
			
			parser.parse(new File("test.xml"), saxp);
			
		} catch (SAXException | IOException e) {
			
			e.printStackTrace();
		}
		
		List<ElementMy> list = new ArrayList<>(saxp.getListElementMy());
		
		for(ElementMy el: list) {
			
			System.out.println(el.toString());
		}
		
	
	}


		
	}


