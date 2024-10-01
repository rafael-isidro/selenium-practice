package org.selenium.ginandjuice.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Manipulation {
    public static Properties getProp(){
        Properties props = new Properties();
        try{
            FileInputStream file = new FileInputStream("src/main/resources/application-test.properties");
            props.load(file);
        } catch (IOException e){
            e.printStackTrace();
        }
        return props;
    }

    public static String getPassword(){
        return getProp().getProperty("password");
    }
    public static String getUsername(){
        return getProp().getProperty("username");
    }
}