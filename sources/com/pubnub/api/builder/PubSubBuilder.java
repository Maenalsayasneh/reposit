package com.pubnub.api.builder;

import com.pubnub.api.managers.SubscriptionManager;
import java.util.ArrayList;
import java.util.List;

public abstract class PubSubBuilder {
    private List<String> channelGroupSubscriptions = new ArrayList();
    private List<String> channelSubscriptions = new ArrayList();
    private SubscriptionManager subscriptionManager;

    public PubSubBuilder(SubscriptionManager subscriptionManager2) {
        this.subscriptionManager = subscriptionManager2;
    }

    public PubSubBuilder channelGroups(List<String> list) {
        this.channelGroupSubscriptions.addAll(list);
        return this;
    }

    public PubSubBuilder channels(List<String> list) {
        this.channelSubscriptions.addAll(list);
        return this;
    }

    public abstract void execute();

    public List<String> getChannelGroupSubscriptions() {
        return this.channelGroupSubscriptions;
    }

    public List<String> getChannelSubscriptions() {
        return this.channelSubscriptions;
    }

    public SubscriptionManager getSubscriptionManager() {
        return this.subscriptionManager;
    }

    public void setChannelGroupSubscriptions(List<String> list) {
        this.channelGroupSubscriptions = list;
    }

    public void setChannelSubscriptions(List<String> list) {
        this.channelSubscriptions = list;
    }

    public void setSubscriptionManager(SubscriptionManager subscriptionManager2) {
        this.subscriptionManager = subscriptionManager2;
    }
}
