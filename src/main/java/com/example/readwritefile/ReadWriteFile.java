package com.example.readwritefile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public List<String> readFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<String> result = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null) {
            result.add(line);
        }
        return result;
//        ArrayList<String> data = new ArrayList<>();
//        data.add("a1|b1");
//        data.add("a2|b2");
//        data.add("a3|b3");
//        return data;
    }

    public void writeFile(File file, List<String> data) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        for (String each : data) {
            bw.write(each + "\n");
        }
        bw.close();
    }
}
