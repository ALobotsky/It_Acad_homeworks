package homework13_SAX;

import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;



public class SAXparsing extends DefaultHandler {

	private String thisElement = "";
	private ElementMy elementMy;
	private ArrayList<ElementMy> list = new ArrayList<>();
	
	public ArrayList<ElementMy> getListElementMy() {
		
		return list;
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
		
		
		if (thisElement.equals("element")) {
			elementMy = new ElementMy();
		}
		if (thisElement.equals("age") && elementMy != null) { 
			elementMy.setAge(new Integer(new String(ch, start, length))); 
		} 
		if (thisElement.equals("id") && elementMy != null) { 
			elementMy.setId(new Long(new String(ch, start, length))); 
		} 
		if (thisElement.equals("isDegree") && elementMy != null) { 
			elementMy.setDegree(new Boolean(new String(ch, start, length))); 
		} 
		if (thisElement.equals("name") && elementMy != null) { 
			elementMy.setName(new String(ch, start, length)); 
		} 
		if (thisElement.equals("surname") && elementMy != null) { 
			elementMy.setSurname(new String(ch, start, length));
			list.add(elementMy);
			elementMy = null;
		}
	} 
}

	

