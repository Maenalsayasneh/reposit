package com.pubnub.api.builder;

import com.pubnub.api.builder.dto.UnsubscribeOperation;
import com.pubnub.api.managers.SubscriptionManager;

public class UnsubscribeBuilder extends PubSubBuilder {
    public UnsubscribeBuilder(SubscriptionManager subscriptionManager) {
        super(subscriptionManager);
    }

    public void execute() {
        getSubscriptionManager().adaptUnsubscribeBuilder(UnsubscribeOperation.builder().channels(getChannelSubscriptions()).channelGroups(getChannelGroupSubscriptions()).build());
    }
}
