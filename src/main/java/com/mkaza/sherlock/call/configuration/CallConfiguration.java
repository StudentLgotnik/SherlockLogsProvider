package com.mkaza.sherlock.call.configuration;

public class CallConfiguration {

    private String country;
    private String outgoingPhone;
    private String incomingPhone;
    private String callAuthor;
    private String targetUser;
    private String date;

    public CallConfiguration() {
    }

    public CallConfiguration(String country, String outgoingPhone, String incomingPhone, String callAuthor, String targetUser, String date) {
        this.country = country;
        this.outgoingPhone = outgoingPhone;
        this.incomingPhone = incomingPhone;
        this.callAuthor = callAuthor;
        this.targetUser = targetUser;
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public String getOutgoingPhone() {
        return outgoingPhone;
    }

    public String getIncomingPhone() {
        return incomingPhone;
    }

    public String getCallAuthor() {
        return callAuthor;
    }

    public String getTargetUser() {
        return targetUser;
    }

    public String getDate() {
        return date;
    }
}
