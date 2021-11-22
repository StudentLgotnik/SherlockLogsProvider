package com.mkaza.sherlock.call;

import com.mkaza.sherlock.call.configuration.CallConfiguration;

public class CallRaw {

    private final String raw;

    public CallRaw(String raw) {
        this.raw = raw;
    }

    public String getRaw() {
        return raw;
    }

    public static CallRaw fromConfiguration(CallConfiguration configuration) {
        return new CallRaw(String.format("Call from %s(%s) to %s(%s), %s, %s",
                configuration.getCallAuthor(),
                configuration.getIncomingPhone(),
                configuration.getTargetUser(),
                configuration.getOutgoingPhone(),
                configuration.getDate(),
                configuration.getCountry()));
    }
}
