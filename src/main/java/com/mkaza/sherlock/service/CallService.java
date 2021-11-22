package com.mkaza.sherlock.service;

import com.mkaza.sherlock.call.CallRaw;
import com.mkaza.sherlock.call.configuration.CallConfiguration;
import com.mkaza.sherlock.call.configuration.CallConfigurationBuilder;
import com.mkaza.sherlock.call.exception.CallConfigurationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CallService {

    private static final Logger logger = LogManager.getLogger(CallService.class);

    public CallRaw getCallByCountry(String country) {
        try {
            CallConfiguration configuration = new CallConfigurationBuilder().setCountry(country).build();
            return CallRaw.fromConfiguration(configuration);
        } catch (CallConfigurationException e) {
            logger.error("Getting call by country fails!", e);
            return null;
        }
    }

    public CallRaw getCallByPhone(String phone) {
        try {
            CallConfiguration configuration = new CallConfigurationBuilder().setCountry(phone).build();
            return CallRaw.fromConfiguration(configuration);
        } catch (CallConfigurationException e) {
            logger.error("Getting call by phone fails!", e);
            return null;
        }
    }

    public CallRaw getCallByAuthor(String author) {
        try {
            CallConfiguration configuration = new CallConfigurationBuilder().setCountry(author).build();
            return CallRaw.fromConfiguration(configuration);
        } catch (CallConfigurationException e) {
            logger.error("Getting call by author fails!", e);
            return null;
        }
    }

}
