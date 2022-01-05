package com.pubnub.api.models.consumer.pubsub;

import com.google.gson.JsonElement;
import i0.d.a.a.a;

public class BasePubSubResult {
    @Deprecated
    private String actualChannel;
    private String channel;
    private String publisher;
    @Deprecated
    private String subscribedChannel;
    private String subscription;
    private Long timetoken;
    private JsonElement userMetadata;

    public static class BasePubSubResultBuilder {
        private String actualChannel;
        private String channel;
        private String publisher;
        private String subscribedChannel;
        private String subscription;
        private Long timetoken;
        private JsonElement userMetadata;

        @Deprecated
        public BasePubSubResultBuilder actualChannel(String str) {
            this.actualChannel = str;
            return this;
        }

        public BasePubSubResult build() {
            return new BasePubSubResult(this.subscribedChannel, this.actualChannel, this.channel, this.subscription, this.timetoken, this.userMetadata, this.publisher);
        }

        public BasePubSubResultBuilder channel(String str) {
            this.channel = str;
            return this;
        }

        public BasePubSubResultBuilder publisher(String str) {
            this.publisher = str;
            return this;
        }

        @Deprecated
        public BasePubSubResultBuilder subscribedChannel(String str) {
            this.subscribedChannel = str;
            return this;
        }

        public BasePubSubResultBuilder subscription(String str) {
            this.subscription = str;
            return this;
        }

        public BasePubSubResultBuilder timetoken(Long l) {
            this.timetoken = l;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("BasePubSubResult.BasePubSubResultBuilder(subscribedChannel=");
            P0.append(this.subscribedChannel);
            P0.append(", actualChannel=");
            P0.append(this.actualChannel);
            P0.append(", channel=");
            P0.append(this.channel);
            P0.append(", subscription=");
            P0.append(this.subscription);
            P0.append(", timetoken=");
            P0.append(this.timetoken);
            P0.append(", userMetadata=");
            P0.append(this.userMetadata);
            P0.append(", publisher=");
            return a.y0(P0, this.publisher, ")");
        }

        public BasePubSubResultBuilder userMetadata(JsonElement jsonElement) {
            this.userMetadata = jsonElement;
            return this;
        }
    }

    public BasePubSubResult(String str, String str2, String str3, String str4, Long l, JsonElement jsonElement, String str5) {
        this.subscribedChannel = str;
        this.actualChannel = str2;
        this.channel = str3;
        this.subscription = str4;
        this.timetoken = l;
        this.userMetadata = jsonElement;
        this.publisher = str5;
    }

    public static BasePubSubResultBuilder builder() {
        return new BasePubSubResultBuilder();
    }

    @Deprecated
    public String getActualChannel() {
        return this.actualChannel;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getPublisher() {
        return this.publisher;
    }

    @Deprecated
    public String getSubscribedChannel() {
        return this.subscribedChannel;
    }

    public String getSubscription() {
        return this.subscription;
    }

    public Long getTimetoken() {
        return this.timetoken;
    }

    public JsonElement getUserMetadata() {
        return this.userMetadata;
    }

    public String toString() {
        StringBuilder P0 = a.P0("BasePubSubResult(subscribedChannel=");
        P0.append(getSubscribedChannel());
        P0.append(", actualChannel=");
        P0.append(getActualChannel());
        P0.append(", channel=");
        P0.append(getChannel());
        P0.append(", subscription=");
        P0.append(getSubscription());
        P0.append(", timetoken=");
        P0.append(getTimetoken());
        P0.append(", userMetadata=");
        P0.append(getUserMetadata());
        P0.append(", publisher=");
        P0.append(getPublisher());
        P0.append(")");
        return P0.toString();
    }

    public BasePubSubResult(BasePubSubResult basePubSubResult) {
        this.subscribedChannel = basePubSubResult.subscribedChannel;
        this.actualChannel = basePubSubResult.actualChannel;
        this.channel = basePubSubResult.channel;
        this.subscription = basePubSubResult.subscription;
        this.timetoken = basePubSubResult.timetoken;
        this.userMetadata = basePubSubResult.userMetadata;
        this.publisher = basePubSubResult.publisher;
    }
}
