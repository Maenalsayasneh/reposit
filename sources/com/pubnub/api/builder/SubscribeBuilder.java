package com.pubnub.api.builder;

import com.pubnub.api.builder.dto.SubscribeOperation;
import com.pubnub.api.managers.SubscriptionManager;
import java.util.List;

public class SubscribeBuilder extends PubSubBuilder {
    private boolean presenceEnabled;
    private Long timetoken;

    public SubscribeBuilder(SubscriptionManager subscriptionManager) {
        super(subscriptionManager);
    }

    public void execute() {
        getSubscriptionManager().adaptSubscribeBuilder(SubscribeOperation.builder().channels(getChannelSubscriptions()).channelGroups(getChannelGroupSubscriptions()).timetoken(this.timetoken).presenceEnabled(this.presenceEnabled).build());
    }

    public SubscribeBuilder withPresence() {
        this.presenceEnabled = true;
        return this;
    }

    public SubscribeBuilder withTimetoken(Long l) {
        this.timetoken = l;
        return this;
    }

    public SubscribeBuilder channelGroups(List<String> list) {
        return (SubscribeBuilder) super.channelGroups(list);
    }

    public SubscribeBuilder channels(List<String> list) {
        return (SubscribeBuilder) super.channels(list);
    }
}
