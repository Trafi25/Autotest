package jtest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfProperties {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;
    static {
        try {
            //указание пути до файла с настройками
            fileInputStream = new FileInputStream("C:/webdrivers/chromedriver.exe");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            //обработка возможного исключения (нет файла и т.п.)
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace(); } } }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key); } }