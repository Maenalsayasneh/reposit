package com.pubnub.api.models.consumer.history;

import com.google.gson.JsonElement;
import i0.d.a.a.a;

public class PNHistoryItemResult {
    private JsonElement entry;
    private JsonElement meta;
    private Long timetoken;

    public static class PNHistoryItemResultBuilder {
        private JsonElement entry;
        private JsonElement meta;
        private Long timetoken;

        public PNHistoryItemResult build() {
            return new PNHistoryItemResult(this.timetoken, this.entry, this.meta);
        }

        public PNHistoryItemResultBuilder entry(JsonElement jsonElement) {
            this.entry = jsonElement;
            return this;
        }

        public PNHistoryItemResultBuilder meta(JsonElement jsonElement) {
            this.meta = jsonElement;
            return this;
        }

        public PNHistoryItemResultBuilder timetoken(Long l) {
            this.timetoken = l;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNHistoryItemResult.PNHistoryItemResultBuilder(timetoken=");
            P0.append(this.timetoken);
            P0.append(", entry=");
            P0.append(this.entry);
            P0.append(", meta=");
            P0.append(this.meta);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNHistoryItemResult(Long l, JsonElement jsonElement, JsonElement jsonElement2) {
        this.timetoken = l;
        this.entry = jsonElement;
        this.meta = jsonElement2;
    }

    public static PNHistoryItemResultBuilder builder() {
        return new PNHistoryItemResultBuilder();
    }

    public JsonElement getEntry() {
        return this.entry;
    }

    public JsonElement getMeta() {
        return this.meta;
    }

    public Long getTimetoken() {
        return this.timetoken;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNHistoryItemResult(timetoken=");
        P0.append(getTimetoken());
        P0.append(", entry=");
        P0.append(getEntry());
        P0.append(", meta=");
        P0.append(getMeta());
        P0.append(")");
        return P0.toString();
    }
}
