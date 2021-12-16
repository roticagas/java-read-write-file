package com.example.readwritefile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadWriteLineTest {
    @Test
    public void testRead() {
        String data = "a|b";
        ReadWriteLine r = new ReadWriteLine();
        ReadLineObject actual = r.read(data);
        ReadLineObject expected = new ReadLineObject("a", "b");
        assertEquals(actual.getA(), expected.getA());
        assertEquals(actual.getB(), expected.getB());
    }

    @Test
    public void testWrite() {
        WriteLineObject data = new WriteLineObject("c", "d");

        String expected = "c|d";
        ReadWriteLine rw = new ReadWriteLine();
        String actual = rw.write(data);
        assertEquals(actual, expected);
    }



}
