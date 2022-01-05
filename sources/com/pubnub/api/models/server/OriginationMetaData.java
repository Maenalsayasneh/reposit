package com.pubnub.api.models.server;

import com.google.gson.annotations.SerializedName;
import i0.d.a.a.a;

public class OriginationMetaData {
    @SerializedName("r")
    private Integer region;
    @SerializedName("t")
    private Long timetoken;

    public boolean canEqual(Object obj) {
        return obj instanceof OriginationMetaData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OriginationMetaData)) {
            return false;
        }
        OriginationMetaData originationMetaData = (OriginationMetaData) obj;
        if (!originationMetaData.canEqual(this)) {
            return false;
        }
        Long timetoken2 = getTimetoken();
        Long timetoken3 = originationMetaData.getTimetoken();
        if (timetoken2 != null ? !timetoken2.equals(timetoken3) : timetoken3 != null) {
            return false;
        }
        Integer region2 = getRegion();
        Integer region3 = originationMetaData.getRegion();
        return region2 != null ? region2.equals(region3) : region3 == null;
    }

    public Integer getRegion() {
        return this.region;
    }

    public Long getTimetoken() {
        return this.timetoken;
    }

    public int hashCode() {
        Long timetoken2 = getTimetoken();
        int i = 43;
        int hashCode = timetoken2 == null ? 43 : timetoken2.hashCode();
        Integer region2 = getRegion();
        int i2 = (hashCode + 59) * 59;
        if (region2 != null) {
            i = region2.hashCode();
        }
        return i2 + i;
    }

    public void setRegion(Integer num) {
        this.region = num;
    }

    public void setTimetoken(Long l) {
        this.timetoken = l;
    }

    public String toString() {
        StringBuilder P0 = a.P0("OriginationMetaData(timetoken=");
        P0.append(getTimetoken());
        P0.append(", region=");
        P0.append(getRegion());
        P0.append(")");
        return P0.toString();
    }
}
