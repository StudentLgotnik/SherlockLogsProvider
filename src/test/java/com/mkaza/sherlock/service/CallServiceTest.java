package com.mkaza.sherlock.service;

import com.mkaza.sherlock.call.CallRaw;
import org.junit.Assert;
import org.junit.Test;

public class CallServiceTest {

    CallService callService = new CallService();

    @Test
    public void filterByCountryTest() {

        CallRaw callRaw = callService.getCallByCountry("Ukraine");

        Assert.assertNotNull(callRaw);
    }

    @Test
    public void filterByPhoneTest() {

        CallRaw callRaw = callService.getCallByPhone("0990123456");

        Assert.assertNotNull(callRaw);
    }

    @Test
    public void filterByAuthorTest() {

        CallRaw callRaw = callService.getCallByAuthor("Maksym");

        Assert.assertNotNull(callRaw);
    }
}
