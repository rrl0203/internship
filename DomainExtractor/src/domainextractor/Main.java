package domainextractor;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws ParseException, IOException, InterruptedException {
        JSONParser parser = new JSONParser();
        Object minerData =  parser.parse(new FileReader("miners_data.json"));
        JSONObject jsonMiners = (JSONObject) minerData;
        Iterator<String> itr = jsonMiners.keySet().iterator();
        PrintStream fileStream = new PrintStream(new File("domains.txt"));

        while(itr.hasNext())
        {
            String domain = itr.next();
            fileStream.println(domain);
        }

    }
}
