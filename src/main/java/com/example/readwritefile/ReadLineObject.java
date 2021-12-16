package com.example.readwritefile;

public class ReadLineObject {
    private String a;
    private String b;

    public ReadLineObject(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ReadLineObject{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
