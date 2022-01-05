package com.pubnub.api.models.consumer.push;

public class PNPushRemoveChannelResult {

    public static class PNPushRemoveChannelResultBuilder {
        public PNPushRemoveChannelResult build() {
            return new PNPushRemoveChannelResult();
        }

        public String toString() {
            return "PNPushRemoveChannelResult.PNPushRemoveChannelResultBuilder()";
        }
    }

    public static PNPushRemoveChannelResultBuilder builder() {
        return new PNPushRemoveChannelResultBuilder();
    }

    public String toString() {
        return "PNPushRemoveChannelResult()";
    }
}
