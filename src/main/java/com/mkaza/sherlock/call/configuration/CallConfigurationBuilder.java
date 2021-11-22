package com.mkaza.sherlock.call.configuration;

import com.mkaza.sherlock.call.exception.CallConfigurationException;

import java.util.Objects;

public class CallConfigurationBuilder {

    private String country;
    private String outgoingPhone;
    private String incomingPhone;
    private String callAuthor;
    private String targetUser;
    private String date;

    public CallConfigurationBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public CallConfigurationBuilder setOutgoingPhone(String outgoingPhone) {
        this.outgoingPhone = outgoingPhone;
        return this;
    }

    public CallConfigurationBuilder setIncomingPhone(String incomingPhone) {
        this.incomingPhone = incomingPhone;
        return this;
    }

    public CallConfigurationBuilder setCallAuthor(String callAuthor) {
        this.callAuthor = callAuthor;
        return this;
    }

    public CallConfigurationBuilder setTargetUser(String targetUser) {
        this.targetUser = targetUser;
        return this;
    }

    public CallConfigurationBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CallConfiguration build() throws CallConfigurationException {
        validate(country);
        validate(outgoingPhone);
        validate(incomingPhone);
        validate(callAuthor);
        validate(targetUser);
        validate(date);
        return new CallConfiguration(country, outgoingPhone, incomingPhone, callAuthor, targetUser, date);
    }

    private void validate(String callProperty) {
        if (Objects.isNull(callProperty))
            throw new CallConfigurationException("Configuration property is empty!");
    }
}
