package com.pubnub.api.managers;

import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadataResult;
import com.pubnub.api.models.consumer.objects_api.membership.PNMembershipResult;
import com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadataResult;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;
import com.pubnub.api.models.consumer.pubsub.PNSignalResult;
import com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult;
import com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult;
import java.util.ArrayList;
import java.util.List;

public class ListenerManager {
    private final List<SubscribeCallback> listeners = new ArrayList();
    private final PubNub pubnub;

    public ListenerManager(PubNub pubNub) {
        this.pubnub = pubNub;
    }

    private List<SubscribeCallback> getListeners() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.listeners) {
            arrayList.addAll(this.listeners);
        }
        return arrayList;
    }

    public void addListener(SubscribeCallback subscribeCallback) {
        synchronized (this.listeners) {
            this.listeners.add(subscribeCallback);
        }
    }

    public void announce(PNStatus pNStatus) {
        for (SubscribeCallback status : getListeners()) {
            status.status(this.pubnub, pNStatus);
        }
    }

    public void removeListener(SubscribeCallback subscribeCallback) {
        synchronized (this.listeners) {
            this.listeners.remove(subscribeCallback);
        }
    }

    public void announce(PNMessageResult pNMessageResult) {
        for (SubscribeCallback message : getListeners()) {
            message.message(this.pubnub, pNMessageResult);
        }
    }

    public void announce(PNPresenceEventResult pNPresenceEventResult) {
        for (SubscribeCallback presence : getListeners()) {
            presence.presence(this.pubnub, pNPresenceEventResult);
        }
    }

    public void announce(PNSignalResult pNSignalResult) {
        for (SubscribeCallback signal : getListeners()) {
            signal.signal(this.pubnub, pNSignalResult);
        }
    }

    public void announce(PNUUIDMetadataResult pNUUIDMetadataResult) {
        for (SubscribeCallback uuid : getListeners()) {
            uuid.uuid(this.pubnub, pNUUIDMetadataResult);
        }
    }

    public void announce(PNChannelMetadataResult pNChannelMetadataResult) {
        for (SubscribeCallback channel : getListeners()) {
            channel.channel(this.pubnub, pNChannelMetadataResult);
        }
    }

    public void announce(PNMembershipResult pNMembershipResult) {
        for (SubscribeCallback membership : getListeners()) {
            membership.membership(this.pubnub, pNMembershipResult);
        }
    }

    public void announce(PNMessageActionResult pNMessageActionResult) {
        for (SubscribeCallback messageAction : getListeners()) {
            messageAction.messageAction(this.pubnub, pNMessageActionResult);
        }
    }

    public void announce(PNFileEventResult pNFileEventResult) {
        for (SubscribeCallback file : getListeners()) {
            file.file(this.pubnub, pNFileEventResult);
        }
    }
}
