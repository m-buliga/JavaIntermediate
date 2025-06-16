package configFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ConfigFile {

    // facem o metoda generica pt a deserializa xml file si sa returneze partea pe care o doresc
    // metoda generica =>
    public static <T> T createConfigNode(Class<T> klass) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(klass);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return klass.cast(unmarshaller.unmarshal(new File("src/test/resources/ConfigFile/shareDataConfig.xml")));
        }
        catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
