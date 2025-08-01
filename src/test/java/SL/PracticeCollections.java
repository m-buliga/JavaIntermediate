package SL;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeCollections {

    public static void main(String[] args) {
        listTestCases();
        System.out.println("-----------------------");
        mapTCResults();
    }

    public static void listTestCases() {
        List<String> testCases = new ArrayList<>();
        testCases.add("AlertsTest");
        testCases.add("BrowserWindowsTest");
        testCases.add("FramesTest");

        for (String element : testCases) {
            System.out.println("The test case's name is: " + element);
        }
    }

    public static void mapTCResults() {
        Map<String, String> testCaseResults = new HashMap<>();
        testCaseResults.put("AlertsTest", "Passed");
        testCaseResults.put("BrowserWindowsTest", "Passed");
        testCaseResults.put("FramesTest", "Failed");

        for (Map.Entry<String, String> entry : testCaseResults.entrySet()) {
            String testCase = entry.getKey();
            String result = entry.getValue();

            if(entry.getValue().equalsIgnoreCase("passed")) {
                System.out.println("SUCCESS! " + testCase + " has " + result);
            }
        }

        for (Map.Entry<String, String> entry : testCaseResults.entrySet()) {
            String testCase = entry.getKey();
            String result = entry.getValue();

            if(entry.getValue().equalsIgnoreCase("Failed")) {
                System.out.println("SORRY! " + testCase + " has " + result);
            }
        }
    }
}
