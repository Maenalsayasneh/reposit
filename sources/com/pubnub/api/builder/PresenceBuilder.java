package com.pubnub.api.builder;

import com.pubnub.api.builder.dto.PresenceOperation;
import com.pubnub.api.managers.SubscriptionManager;
import java.util.List;

public class PresenceBuilder extends PubSubBuilder {
    private boolean connected;

    public PresenceBuilder(SubscriptionManager subscriptionManager) {
        super(subscriptionManager);
    }

    public PresenceBuilder connected(boolean z) {
        this.connected = z;
        return this;
    }

    public void execute() {
        getSubscriptionManager().adaptPresenceBuilder(PresenceOperation.builder().channels(getChannelSubscriptions()).channelGroups(getChannelGroupSubscriptions()).connected(this.connected).build());
    }

    public PresenceBuilder channelGroups(List<String> list) {
        return (PresenceBuilder) super.channelGroups(list);
    }

    public PresenceBuilder channels(List<String> list) {
        return (PresenceBuilder) super.channels(list);
    }
}
