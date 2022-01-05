package com.pubnub.api.models.server;

import com.google.gson.annotations.SerializedName;
import i0.d.a.a.a;

public class SubscribeMetadata {
    @SerializedName("r")
    private final String region;
    @SerializedName("t")
    private final Long timetoken;

    public SubscribeMetadata(Long l, String str) {
        this.timetoken = l;
        this.region = str;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SubscribeMetadata;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscribeMetadata)) {
            return false;
        }
        SubscribeMetadata subscribeMetadata = (SubscribeMetadata) obj;
        if (!subscribeMetadata.canEqual(this)) {
            return false;
        }
        Long timetoken2 = getTimetoken();
        Long timetoken3 = subscribeMetadata.getTimetoken();
        if (timetoken2 != null ? !timetoken2.equals(timetoken3) : timetoken3 != null) {
            return false;
        }
        String region2 = getRegion();
        String region3 = subscribeMetadata.getRegion();
        return region2 != null ? region2.equals(region3) : region3 == null;
    }

    public String getRegion() {
        return this.region;
    }

    public Long getTimetoken() {
        return this.timetoken;
    }

    public int hashCode() {
        Long timetoken2 = getTimetoken();
        int i = 43;
        int hashCode = timetoken2 == null ? 43 : timetoken2.hashCode();
        String region2 = getRegion();
        int i2 = (hashCode + 59) * 59;
        if (region2 != null) {
            i = region2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("SubscribeMetadata(timetoken=");
        P0.append(getTimetoken());
        P0.append(", region=");
        P0.append(getRegion());
        P0.append(")");
        return P0.toString();
    }
}
