package SL;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class LoadUsers {

    public static Map<String, User> loadUsers(String filePath) {
        Properties props = new Properties();
        Map<String, User> users = new HashMap<>();

        try (FileInputStream file = new FileInputStream(filePath)) {
            props.load(file);

            Set<String> userKeys = new HashSet<>();
            for (String key : props.stringPropertyNames()) {
                String prefix = key.split("\\.")[0];
                userKeys.add(prefix);
            }

            for (String prefix : userKeys) {
                String name = props.getProperty(prefix + ".name");
                String email = props.getProperty(prefix + ".email");

                if (name != null && email != null) {
                    users.put(prefix, new User(name, email));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
}
