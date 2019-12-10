package minesweeper;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new FileReader("domains.txt"));
        String domain;

        while((domain = br.readLine()) != null)
        {
            String[] command = new String[] {
                    "/bin/bash",
                    "-c",
                    "echo rubenminesweeper| sudo python minesweeper.py -t http://" + domain + " -tm 30 >> automaticSweep.txt"};
            Process proc = new ProcessBuilder(command).start();
            Thread.sleep(60000);
        }
    }
}
