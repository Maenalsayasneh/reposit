package com.pubnub.api.enums;

public enum PNPushType {
    APNS("apns"),
    MPNS("mpns"),
    GCM("gcm"),
    FCM("gcm"),
    APNS2("apns2");
    
    private final String value;

    private PNPushType(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
