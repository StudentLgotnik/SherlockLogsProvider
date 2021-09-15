package com.mkaza.sherlock;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    public static void read(Path path) throws IOException {
        Files.readAllLines(path);
    }
}
