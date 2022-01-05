package com.pubnub.api.enums;

import com.pubnub.api.endpoints.objects_api.utils.Include;

public enum PNSpaceFields {
    CUSTOM(Include.INCLUDE_CUSTOM_PARAM_VALUE);
    
    private final String value;

    private PNSpaceFields(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
