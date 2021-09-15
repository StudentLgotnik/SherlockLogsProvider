package com.mkaza.sherlock;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;

public class TestLogCollecting {

    @Test
    public void nullAssertionTest() {
        Assert.assertNotNull(null);
    }


    @Test
    @Ignore
    public void BooleanAssertionTest() {
        Assert.assertTrue(false);
    }

    @Test
    @Ignore
    public void PositiveAssertionTest() {
        Assert.assertTrue(true);
    }

    @Test
    @Ignore
    public void ProcessNullTest() {
        NotNullProcessor.processNotNull(null);
    }

    @Test
    @Ignore
    public void ReadFileFromStringPathTest() throws IOException {
        ReadFileByStringPath.readByStringPath("\\");
    }

    @Test
    @Ignore
    public void ReadFileFromPathTest() throws IOException {
        ReadFileByPath.readByPath(Paths.get("\\"));
    }
}
