package com.pubnub.api.models.server;

import com.google.gson.annotations.SerializedName;
import i0.d.a.a.a;

public class PublishMetaData {
    @SerializedName("t")
    private Long publishTimetoken;
    @SerializedName("r")
    private Integer region;

    public boolean canEqual(Object obj) {
        return obj instanceof PublishMetaData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PublishMetaData)) {
            return false;
        }
        PublishMetaData publishMetaData = (PublishMetaData) obj;
        if (!publishMetaData.canEqual(this)) {
            return false;
        }
        Long publishTimetoken2 = getPublishTimetoken();
        Long publishTimetoken3 = publishMetaData.getPublishTimetoken();
        if (publishTimetoken2 != null ? !publishTimetoken2.equals(publishTimetoken3) : publishTimetoken3 != null) {
            return false;
        }
        Integer region2 = getRegion();
        Integer region3 = publishMetaData.getRegion();
        return region2 != null ? region2.equals(region3) : region3 == null;
    }

    public Long getPublishTimetoken() {
        return this.publishTimetoken;
    }

    public Integer getRegion() {
        return this.region;
    }

    public int hashCode() {
        Long publishTimetoken2 = getPublishTimetoken();
        int i = 43;
        int hashCode = publishTimetoken2 == null ? 43 : publishTimetoken2.hashCode();
        Integer region2 = getRegion();
        int i2 = (hashCode + 59) * 59;
        if (region2 != null) {
            i = region2.hashCode();
        }
        return i2 + i;
    }

    public void setPublishTimetoken(Long l) {
        this.publishTimetoken = l;
    }

    public void setRegion(Integer num) {
        this.region = num;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PublishMetaData(publishTimetoken=");
        P0.append(getPublishTimetoken());
        P0.append(", region=");
        P0.append(getRegion());
        P0.append(")");
        return P0.toString();
    }
}
