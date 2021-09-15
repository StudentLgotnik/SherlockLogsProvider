package com.mkaza.sherlock;

import java.io.IOException;
import java.nio.file.Paths;

public class ReadFileByStringPath {

    public static void readByStringPath(String stringPath) throws IOException {
        ReadFileByPath.readByPath(Paths.get(stringPath));
    }

}
