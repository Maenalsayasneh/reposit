package com.pubnub.api.models.consumer.access_manager;

import com.google.gson.annotations.SerializedName;
import i0.d.a.a.a;
import java.util.Map;

public class PNAccessManagerKeysData {
    @SerializedName("auths")
    private Map<String, PNAccessManagerKeyData> authKeys;

    public Map<String, PNAccessManagerKeyData> getAuthKeys() {
        return this.authKeys;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNAccessManagerKeysData(authKeys=");
        P0.append(getAuthKeys());
        P0.append(")");
        return P0.toString();
    }
}
