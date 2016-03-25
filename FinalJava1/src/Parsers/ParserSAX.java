package Parsers;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

import MyException.MyException;

public class ParserSAX extends DefaultHandler implements ParseIn  {

	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
	
	private String thisElement = "";
	private Root root;
	private Scheduls schedule;

	public ParserSAX() {
		this.root = new Root();
	}

	
	

	@Override 
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException { 
		thisElement = qName;
	} 
	 
	@Override 
	public void endElement(String namespaceURI, String localName, String qName) throws SAXException { 
		thisElement = "";
	}
	
	@Override 
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		if(thisElement.equals("name") && schedule == null) {
			
			root.setName(new String(ch, start, length));
		}
		
		if(thisElement.equals("date") && schedule == null) {
			
			//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
			try {
				
			root.setDate(simpleDateFormat.parse(new String(ch, start, length)));
				
			} catch(ParseException e) {
				
				throw new SAXException("ParserSAX ERROR ParseException " + e);
			}
			
		}
		
		
		if(thisElement.equals("schedule") && schedule == null) {
			
			schedule = new Scheduls();
		}
		
		if(thisElement.equals("id") && schedule != null) {
			
			schedule.setId(new Long(new String(ch, start, length)));
		}
		
		if(thisElement.equals("busNumber") && schedule != null) {
			
			schedule.setBusNumber(new String(new String(ch, start, length)));
		}
		
		if(thisElement.equals("locationStart") && schedule != null) {
			
			schedule.setLocationStart(new String(ch, start, length));
		}
		
		if(thisElement.equals("locationEnd") && schedule != null) {
			
			schedule.setLocationEnd(new String(ch, start, length));
		}
		
		if(thisElement.equals("price") && schedule != null) {
			
			schedule.setPrice(new Integer(new String(ch, start, length)));
		}
		
		if(thisElement.equals("dateStart") && schedule != null) {
			
			//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
			
			try {
				
				schedule.setDateStart(simpleDateFormat.parse(new String(ch, start, length)));
				
			} catch(ParseException e) {
				
				throw new SAXException("ParserSAX ERROR ParseException " + e);
			}
			
		}
		
		if(thisElement.equals("dateEnd") && schedule != null) {
			
			//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
			
			try {
				
				schedule.setDateEnd(simpleDateFormat.parse(new String(ch, start, length)));
				
			} catch(ParseException e) {
				
				throw new SAXException("ParserSAX ERROR ParseException " + e);
			}
			
		}
		
		
		if(thisElement.equals("waypoints") && schedule != null) {
			
			schedule.getWaypoints().add(new String(ch, start, length));
		}
		
		root.getSchedulses().add(schedule);
		
		schedule = null;

			
	} 

	@Override
	public Root parse(String filePath) throws SAXException, IOException, ParserConfigurationException , MyException {
		
		if(filePath == null) {
			
			throw new MyException("ParserSAX ERROR file not found");
		}
		
		Pattern pattern = Pattern.compile("\\.(xml)");
		 
		Matcher matcher = pattern.matcher(filePath);
    
		if(!matcher.find()) {
    	
			throw new MyException("ParserSAX ERROR file not xml format");
    	
		}
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		SAXParser parser = factory.newSAXParser();
		
		ParserSAX parserSAX = new ParserSAX();
		
		parser.parse(new File(filePath), parserSAX);
		
		return parserSAX.root;
	}

	
}
