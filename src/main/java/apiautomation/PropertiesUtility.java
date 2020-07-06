package apiautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

public class PropertiesUtility {
    private static Properties properties;

    public static String getProperties(String key) {
        return properties.getProperty(key);
    }

    public static void loadProperties(String configPropertyFileLocation) throws IOException, URISyntaxException {
        properties = new Properties();
        properties.load(new FileInputStream(new File(getResourcePath(configPropertyFileLocation))));
    }

    public static String getResourcePath(String resoucePath) throws URISyntaxException {
        URL resource = Thread.currentThread().getContextClassLoader().getResource(resoucePath);
        return resource.toURI().getPath();
    }
}
