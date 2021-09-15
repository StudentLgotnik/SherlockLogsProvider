package com.mkaza.sherlock;

import java.io.IOException;
import java.nio.file.Path;

public class ReadFileByPath {

    public static void readByPath(Path path) throws IOException {
        FileReader.read(path);
    }
}
