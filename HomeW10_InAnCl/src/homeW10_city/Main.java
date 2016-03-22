package homeW10_city;

import homeW10_city.City.Avenue;
import homeW10_city.City.Square;
import homeW10_city.City.Street;


		public class Main {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				City gomel = new City("Gomel");
				
				Street KalininStr = gomel.new Street("Kalinina street");
				Avenue LeninaAv = gomel.new Avenue("Lenina avenue");
				Square vokzalSqr = gomel.new Square("Privokzalnaja");

			}

		}
