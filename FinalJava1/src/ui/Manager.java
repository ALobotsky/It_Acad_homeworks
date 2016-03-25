package ui;

import Connection.Connection;
import MyException.MyException;
import Parsers.ParserJSON;
import Parsers.ParserSAX;
import Parsers.Root;
import Parsers.Scheduls;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Manager {

    //Реализация паттерна Singlton
    private final static Manager instance = new Manager();

    private Manager() {
    }

    public static Manager getInstance() {
        return instance;
    }

    private Root root;

    public Root getRoot() {
        return root;
    }

    // Метод записывает ссылку на путь файла
    public void setFilePath(String filePath) {
        Connection.getInstance().setFilePath(filePath);
    }

    // Метод скачивает файл
    public void downloadFiles(String link, String filePath) throws IOException, MyException {
        File file = new File(filePath);
        if (!file.exists())
            Connection.getInstance().downloadFile(link);

    }

    // Метод удаляет файл
    public void deleteFiles(String filePath) throws MyException {
        Connection.getInstance().deleteFile(filePath);
    }

    // Метод выбора парсера
    public void setChoiceParse(String lib) throws Exception {

//    	if (lib.equals("SAX")) {
//            this.root = new ParserSAX().parse(Connection.getInstance().getFilePath());
//    	} else {
//            throw new MyException("Manager error no such parser");
//        }
            
        if (lib.equals("JSON")) {
            this.root = new ParserJSON().parse(Connection.getInstance().getFilePath());
        } else {
            throw new MyException("Manager error no such parser");
        }
    }

    // Метод очищает объект класса Root
    public void cleanRoot() {
        this.root = null;

    }

    //метод выводит
    public void showShelduls(ArrayList<Scheduls> schedls) {

        if (schedls == null) {
            System.out.println("sheduls = null");
            return;
        }

        for (Scheduls scheduls : schedls) {

            System.out.println("============================");
            System.out.println("busNumber: " + scheduls.getBusNumber());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
            System.out.println("dateEnd: " + simpleDateFormat.format(scheduls.getDateEnd()));
            System.out.println("dateStart: " + simpleDateFormat.format(scheduls.getDateStart()));
            System.out.println("id: " + scheduls.getId());
            System.out.println("locationEnd: " + scheduls.getLocationEnd());
            System.out.println("locationStart: " + scheduls.getLocationStart());
            System.out.println("price: " + scheduls.getPrice());

            for (int j = 0; j < scheduls.getWaypoints().size(); j++) {
                System.out.println("shel: " + scheduls.getWaypoints().get(j));
            }

        }
    }

    // Метод выводит в консоль объект Root
    public void showRoot(Root root) {
        System.out.println("Date: " + root.getDate());
        System.out.println("Name: " + root.getName());
        showShelduls(root.getSchedulses());

    }

    //Вывод по длительности пути
    
    
    
    //  Поиск по № автобуса
    public ArrayList<Scheduls> searchSсheduls() throws MyException {

        if (this.root == null) {
            throw new MyException("Root = null");
        }

        ArrayList<Scheduls> scheduls = null;

        System.out.println("Для поиска автобуса по №");
        System.out.println("Введите № автобуса: ");
        Scanner scanner = new Scanner(System.in);
        String sBusNumber = scanner.next();


        for (Scheduls custom : root.getSchedulses()) {
            if (custom.getBusNumber().contains(sBusNumber)) {
                if (scheduls == null) {
                	scheduls = new ArrayList<>();
                }
                scheduls.add(custom);
            }
        }
        if (scheduls != null) {
            return scheduls;
        }
        return null;
    }
    
    //Search by Price
    
    
    
  //Вывод по длительности пути
//    public void showRoad(ArrayList<Scheduls> schedls) {
//
//        if (schedls == null) {
//            System.out.println("sheduls = null");
//            return;
//        }
//        for (Scheduls scheduls : schedls) {
//        	System.out.println("============================");
//        	System.out.println("locationEnd: " + scheduls.getLocationEnd());
//            System.out.println("locationStart: " + scheduls.getLocationStart());
//            
//           
//            Calendar calendar1 = Calendar.getInstance();
//            //calendar1.setTime(d1);
//            Date end = scheduls.getDateEnd();
//            Date start = scheduls.getDateStart();
//            
//            long diff = SetTimeInMillis(end)- start) - 
//            System.out.println("time on trip:"+ diff);
//        	}
//        }




}
