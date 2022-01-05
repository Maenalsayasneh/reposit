package com.pubnub.api.enums;

import com.pubnub.api.endpoints.objects_api.utils.Include;

public enum PNUserFields {
    CUSTOM(Include.INCLUDE_CUSTOM_PARAM_VALUE);
    
    private final String value;

    private PNUserFields(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
