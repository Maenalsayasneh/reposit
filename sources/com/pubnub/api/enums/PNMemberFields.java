package com.pubnub.api.enums;

import com.pubnub.api.endpoints.objects_api.utils.Include;

public enum PNMemberFields {
    CUSTOM(Include.INCLUDE_CUSTOM_PARAM_VALUE),
    USER("user"),
    USER_CUSTOM("user.custom");
    
    private final String value;

    private PNMemberFields(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
