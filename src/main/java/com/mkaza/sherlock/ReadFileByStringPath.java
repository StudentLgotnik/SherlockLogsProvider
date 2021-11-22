package com.mkaza.sherlock;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class ReadFileByStringPath {

    public static File readByStringPath(String stringPath) throws IOException {
        return ReadFileByPath.readByPath(Paths.get(stringPath));
    }

}
