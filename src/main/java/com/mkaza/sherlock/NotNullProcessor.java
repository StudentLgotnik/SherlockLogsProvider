package com.mkaza.sherlock;

import java.util.Objects;

public class NotNullProcessor {

    public static void processNotNull(Object o) {
        if(Objects.isNull(o)) throw new IllegalArgumentException("Parameter is empty!");
    }

    public static Object getProcessedObjects() {
        return null;
    }
}
