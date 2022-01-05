package com.pubnub.api.models.consumer.push;

public class PNPushRemoveAllChannelsResult {

    public static class PNPushRemoveAllChannelsResultBuilder {
        public PNPushRemoveAllChannelsResult build() {
            return new PNPushRemoveAllChannelsResult();
        }

        public String toString() {
            return "PNPushRemoveAllChannelsResult.PNPushRemoveAllChannelsResultBuilder()";
        }
    }

    public static PNPushRemoveAllChannelsResultBuilder builder() {
        return new PNPushRemoveAllChannelsResultBuilder();
    }

    public String toString() {
        return "PNPushRemoveAllChannelsResult()";
    }
}
