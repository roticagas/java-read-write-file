package com.example.readwritefile;

public class WriteLineObject {
    private String c;
    private String d;

    public WriteLineObject(String c, String d) {
        this.c = c;
        this.d = d;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "WriteLineObject{" +
                "c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}
