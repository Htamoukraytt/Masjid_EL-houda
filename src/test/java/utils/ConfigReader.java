package utils;
import java.io.*;
import java.util.Properties;

public class ConfigReader {

    // this logic to be able to read data from the files  ( we will have userName
    public static String readProperty(String key) throws FileNotFoundException {

        FileReader file=new FileReader("configuration.properties");  // path
        Properties properties=new Properties();  // properties object to access methods
        // this property object will read the properties from file(Conf...properties)
        try {
         //   properties.load(new FileInputStream(file));
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties.getProperty(key);
    }








}
