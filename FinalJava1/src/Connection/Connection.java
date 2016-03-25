package Connection;

import MyException.MyException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Connection {

    private static final Connection instance = new Connection();

    public final static String FILE_PATH_XML = "bus_schedule.xml";
    public final static String FILE_PATH_JSON = "bus_schedule.json";
    public final static String FILE_PATH = "bus_schedule";
    public final static String REGEX_FILES = "\\.(xml|json)";


    private String filePath;


    private Connection() {
    }
    //Реализация паттерна Singlton
    public static Connection getInstance() {
        return instance;
    }

    //Метод возвращает путь файла XML
    public String getFILE_XML() {
        return FILE_PATH_XML;
    }

    //Метод возвращает путь файла JSON
    public String getFILE_JSON() {
        return FILE_PATH_JSON;
    }

    //Метод возвращает ссылку на путь файла
    public String getFilePath() {
        return filePath;
    }

    // Метод задает ссылку на путь файла
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    //Метод скачивает файл
    public void downloadFile(String LINK) throws MyException, IOException {

        try {

            String link = LINK;
            InputStream inputStream = null;

            FileOutputStream outputStream = null;
            URL url = new URL(LINK);
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();

            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                inputStream = httpURLConnection.getInputStream();
                String result = "";
                Pattern pattern = Pattern.compile(REGEX_FILES);
                Matcher matcher = pattern.matcher(link);

                if (matcher.find()) {
                    result = matcher.group();
                } else {

                    throw new MyException("Connection downloadFile error");
                }

                File file = new File(FILE_PATH + result);
                outputStream = new FileOutputStream(file);
                int byteRead = -1;
                byte[] buffer = new byte[512];
                while ((byteRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, byteRead);
                }
            } else {
                throw new MyException("Connection downloadFile error response");
            }
            inputStream.close();
            outputStream.close();
        } catch (UnknownHostException e) {
            throw new MyException("Connection downloadFile error UnknownHostException");
        } catch (IOException e) {
            throw new MyException("Connection downloadFile error IOException");
        } catch (Exception e) {
            throw new MyException("Connection downloadFile error unknown");
        }
    }

    // Метод удаляет файл
    public void deleteFile(String filePath) throws MyException {

        File file = new File(filePath);
        if (!file.exists()) {
            throw new MyException("File\\" + filePath + "\\don't find");
        }
        if (!file.delete()) {
            throw new MyException("Connection deleteFile error");
        }
    }
}


