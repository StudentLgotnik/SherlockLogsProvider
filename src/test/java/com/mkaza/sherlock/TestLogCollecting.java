package com.mkaza.sherlock;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;

public class TestLogCollecting {

    @Test
    public void arrayEqualsAssertionTest() {
        String[] s1 = {"s1.1", "s1.2"};
        String[] s2 = {"s2.1", "s2.2"};
        Assert.assertArrayEquals(s1, s2);
    }

    @Test
    public void PositiveAssertionTest() {
        Assert.assertTrue(true);
    }

}
