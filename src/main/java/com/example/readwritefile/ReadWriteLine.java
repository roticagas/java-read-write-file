package com.example.readwritefile;

public class ReadWriteLine {
    public ReadLineObject read(String data) {
        // only sample , in real use must prevent null
        String[] xx = data.split("\\|");
        return new ReadLineObject(xx[0],xx[1]);
    }
    public String write(WriteLineObject data) {
        // only sample , in real use must prevent null
        return data.getC() + "|" + data.getD();
    }
}
