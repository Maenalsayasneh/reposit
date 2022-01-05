package com.pubnub.api.callbacks;

import com.pubnub.api.PubNub;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadataResult;
import com.pubnub.api.models.consumer.objects_api.membership.PNMembershipResult;
import com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadataResult;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;
import com.pubnub.api.models.consumer.pubsub.PNSignalResult;
import com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult;
import com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult;

public abstract class SubscribeCallback {

    public static class BaseSubscribeCallback extends SubscribeCallback {
        public void channel(PubNub pubNub, PNChannelMetadataResult pNChannelMetadataResult) {
        }

        public void file(PubNub pubNub, PNFileEventResult pNFileEventResult) {
        }

        public void membership(PubNub pubNub, PNMembershipResult pNMembershipResult) {
        }

        public void message(PubNub pubNub, PNMessageResult pNMessageResult) {
        }

        public void messageAction(PubNub pubNub, PNMessageActionResult pNMessageActionResult) {
        }

        public void presence(PubNub pubNub, PNPresenceEventResult pNPresenceEventResult) {
        }

        public void signal(PubNub pubNub, PNSignalResult pNSignalResult) {
        }

        public void status(PubNub pubNub, PNStatus pNStatus) {
        }

        public void uuid(PubNub pubNub, PNUUIDMetadataResult pNUUIDMetadataResult) {
        }
    }

    public abstract void channel(PubNub pubNub, PNChannelMetadataResult pNChannelMetadataResult);

    public abstract void file(PubNub pubNub, PNFileEventResult pNFileEventResult);

    public abstract void membership(PubNub pubNub, PNMembershipResult pNMembershipResult);

    public abstract void message(PubNub pubNub, PNMessageResult pNMessageResult);

    public abstract void messageAction(PubNub pubNub, PNMessageActionResult pNMessageActionResult);

    public abstract void presence(PubNub pubNub, PNPresenceEventResult pNPresenceEventResult);

    public abstract void signal(PubNub pubNub, PNSignalResult pNSignalResult);

    public abstract void status(PubNub pubNub, PNStatus pNStatus);

    public abstract void uuid(PubNub pubNub, PNUUIDMetadataResult pNUUIDMetadataResult);
}
