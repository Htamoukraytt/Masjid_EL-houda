package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // this logic to be able to read data from the files  ( we will have userName
    public static String readProperty(String key){

        File file=new File("configuration.properties");
        Properties properties=new Properties();

        // this property object will read the properties from file(Conf...properties)
        try {
            properties.load(new FileInputStream(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);
    }








}
