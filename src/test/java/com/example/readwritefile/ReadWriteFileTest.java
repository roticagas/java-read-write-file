package com.example.readwritefile;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReadWriteFileTest {

    @Test
    void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("test01.dat").getFile());

        ReadWriteFile rw = new ReadWriteFile();
        List<String> expected = new ArrayList<>();
        expected.add("a1|b1");
        expected.add("a2|b2");
        expected.add("a3|b3");
        List<String> actual = null;
        try {
            actual = rw.readFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(expected, actual);
    }

    @Test
    void testWrite() {
        try {
            File file = Files.createTempFile("", ".dat").toFile();
            ReadWriteFile rw = new ReadWriteFile();
            List<String> data = new ArrayList<>();
            data.add("a1|b1");
            data.add("a2|b2");
            data.add("a3|b3");
            rw.writeFile(file, data);
            // verify
            assertTrue(file.length() > 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
