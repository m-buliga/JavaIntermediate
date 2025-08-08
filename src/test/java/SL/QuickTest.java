package SL;

import java.util.Map;

public class QuickTest {
    public static void main(String[] args) {
        String path = "src/test/resources/InputData/SLPracticeData.properties";
        Map<String, User> users = LoadUsers.loadUsers(path);

        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
