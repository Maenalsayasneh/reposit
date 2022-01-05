package com.pubnub.api.models.consumer;

import i0.d.a.a.a;

public class PNPublishResult {
    private final Long timetoken;

    public static class PNPublishResultBuilder {
        private Long timetoken;

        public PNPublishResult build() {
            return new PNPublishResult(this.timetoken);
        }

        public PNPublishResultBuilder timetoken(Long l) {
            this.timetoken = l;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNPublishResult.PNPublishResultBuilder(timetoken=");
            P0.append(this.timetoken);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNPublishResult(Long l) {
        this.timetoken = l;
    }

    public static PNPublishResultBuilder builder() {
        return new PNPublishResultBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNPublishResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNPublishResult)) {
            return false;
        }
        PNPublishResult pNPublishResult = (PNPublishResult) obj;
        if (!pNPublishResult.canEqual(this)) {
            return false;
        }
        Long timetoken2 = getTimetoken();
        Long timetoken3 = pNPublishResult.getTimetoken();
        return timetoken2 != null ? timetoken2.equals(timetoken3) : timetoken3 == null;
    }

    public Long getTimetoken() {
        return this.timetoken;
    }

    public int hashCode() {
        Long timetoken2 = getTimetoken();
        return 59 + (timetoken2 == null ? 43 : timetoken2.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNPublishResult(timetoken=");
        P0.append(getTimetoken());
        P0.append(")");
        return P0.toString();
    }
}
