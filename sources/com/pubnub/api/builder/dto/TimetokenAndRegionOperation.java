package com.pubnub.api.builder.dto;

import i0.d.a.a.a;

public class TimetokenAndRegionOperation implements PubSubOperation {
    private final String region;
    private final long timetoken;

    public TimetokenAndRegionOperation(long j, String str) {
        this.timetoken = j;
        this.region = str;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof TimetokenAndRegionOperation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimetokenAndRegionOperation)) {
            return false;
        }
        TimetokenAndRegionOperation timetokenAndRegionOperation = (TimetokenAndRegionOperation) obj;
        if (!timetokenAndRegionOperation.canEqual(this) || getTimetoken() != timetokenAndRegionOperation.getTimetoken()) {
            return false;
        }
        String region2 = getRegion();
        String region3 = timetokenAndRegionOperation.getRegion();
        return region2 != null ? region2.equals(region3) : region3 == null;
    }

    public String getRegion() {
        return this.region;
    }

    public long getTimetoken() {
        return this.timetoken;
    }

    public int hashCode() {
        long timetoken2 = getTimetoken();
        String region2 = getRegion();
        return ((((int) (timetoken2 ^ (timetoken2 >>> 32))) + 59) * 59) + (region2 == null ? 43 : region2.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("TimetokenAndRegionOperation(timetoken=");
        P0.append(getTimetoken());
        P0.append(", region=");
        P0.append(getRegion());
        P0.append(")");
        return P0.toString();
    }
}
