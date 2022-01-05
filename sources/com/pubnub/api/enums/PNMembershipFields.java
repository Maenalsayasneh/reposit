package com.pubnub.api.enums;

import com.pubnub.api.endpoints.objects_api.utils.Include;

public enum PNMembershipFields {
    CUSTOM(Include.INCLUDE_CUSTOM_PARAM_VALUE),
    SPACE("space"),
    SPACE_CUSTOM("space.custom");
    
    private final String value;

    private PNMembershipFields(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
