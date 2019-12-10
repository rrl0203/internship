package minesweeper;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws ParseException, IOException, InterruptedException {
        JSONParser parser = new JSONParser();
        Object minerData =  parser.parse(new FileReader("miners_data.json"));
        JSONObject jsonMiners = (JSONObject) minerData;
        Iterator<String> itr = jsonMiners.keySet().iterator();

        while(itr.hasNext())
        {
            String[] command = new String[] {
                    "/bin/bash",
                    "-c",
                    "echo rubenminesweeper| sudo python minesweeper.py -t http://" + itr.next() + " -tm 30 >> automaticSweep.txt"};
            Process proc = new ProcessBuilder(command).start();
            Thread.sleep(60000);
        }

    }
}
