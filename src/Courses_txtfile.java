import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Coursess {
    public String filename;
    public static List<String> readfile(String filename) throws IOException {
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        FileReader fileReader = null;

        File file = new File("./src/"+filename);
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> listitem = new ArrayList<String>();
        while ((line = bufferedReader.readLine()) != null) {
            listitem.add(line);
        }
        fileReader.close();
        return listitem;
    }
    public static void main(String[] args) {
        try {
            List <String> courses = readfile("courses.json");
            List <String> percentage = readfile("coursetopicpercent.txt");
            List <String> instructors = readfile("instructors.txt");
            List <String> topicprofskill = readfile("topicprofskill.txt");
            List <String> topics = readfile("topics.json");
            Iterator itr = topicprofskill.iterator();
            Iterator instructItr = instructors.iterator();
            Iterator topicItr = topics.iterator();
            Iterator percentageItr = percentage.iterator();
            while (itr.hasNext()) {
                String skillValue = (String)itr.next();
                String[] skillID = skillValue.split(",");
              /*  while (instructItr.hasNext()) {
                    String instValue = (String) instructItr.next();
                    String[] instID = instValue.split(",");
                    if(skillID[1].equals(instID[0])) {
                        while (topicItr.hasNext()) {
                            String topicValue = (String) topicItr.next();
                            String[] topicID = topicValue.split(",");
                            if (topicID[0].equals(skillID[1])) {
                                while (percentageItr.hasNext()) {
                                    String percentValue = (String) percentageItr.next();
                                    String[] percentID = percentValue.split(",");
                                    if (percentID[1].equals(topicID[0])) {
                                        System.out.println(percentID[2]);
                                    }
                                }
                            }
                        }
                    }


                }*/
            }

         /*   System.out.println("Contents of file:");
            System.out.println(courses.toString());
            System.out.println(percentage.toString());
            System.out.println(instructors.toString());
            System.out.println(topicprofskill.toString());
            System.out.println(topics.toString());*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}