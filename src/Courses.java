import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Courses {
    public String courseID;
    public String instID;
    public String topicID;

    public static String readCourse(String courseID ) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("./src/courses.json"));
        JSONObject jsonObject = (JSONObject) object;
        JSONObject objectID = (JSONObject) jsonObject.get(courseID);
        String  option = (String) objectID.get("name");

        return option;
    }

    public static String readInst(String instID ) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("./src/instructors.json"));
        JSONObject jsonObject = (JSONObject) object;
        JSONObject objectID = (JSONObject) jsonObject.get(instID);
        String  option = (String) objectID.get("name");

        return option;
    }
    public static String readTopic(String topicID ) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("./src/topics.json"));
        JSONObject jsonObject = (JSONObject) object;
        JSONObject objectID = (JSONObject) jsonObject.get(topicID);
        String  option = (String) objectID.get("name");

        return option;
    }

    public static void main(String[] args) {
        try {

            String courseName = readCourse("303");
            String instName = readInst("1");
            String topicName = readTopic("1");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}