package com.pubnub.api.models.consumer.push;

public class PNPushAddChannelResult {

    public static class PNPushAddChannelResultBuilder {
        public PNPushAddChannelResult build() {
            return new PNPushAddChannelResult();
        }

        public String toString() {
            return "PNPushAddChannelResult.PNPushAddChannelResultBuilder()";
        }
    }

    public static PNPushAddChannelResultBuilder builder() {
        return new PNPushAddChannelResultBuilder();
    }

    public String toString() {
        return "PNPushAddChannelResult()";
    }
}
