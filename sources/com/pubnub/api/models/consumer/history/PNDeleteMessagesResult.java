package com.pubnub.api.models.consumer.history;

public class PNDeleteMessagesResult {

    public static class PNDeleteMessagesResultBuilder {
        public PNDeleteMessagesResult build() {
            return new PNDeleteMessagesResult();
        }

        public String toString() {
            return "PNDeleteMessagesResult.PNDeleteMessagesResultBuilder()";
        }
    }

    public static PNDeleteMessagesResultBuilder builder() {
        return new PNDeleteMessagesResultBuilder();
    }

    public String toString() {
        return "PNDeleteMessagesResult()";
    }
}
