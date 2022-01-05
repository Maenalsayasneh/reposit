package com.pubnub.api.models.consumer.access_manager.v3;

public class ChannelGroupGrant extends PNResource<ChannelGroupGrant> {
    private ChannelGroupGrant() {
    }

    public static ChannelGroupGrant id(String str) {
        ChannelGroupGrant channelGroupGrant = new ChannelGroupGrant();
        channelGroupGrant.resourceName = str;
        return channelGroupGrant;
    }

    public static ChannelGroupGrant pattern(String str) {
        ChannelGroupGrant channelGroupGrant = new ChannelGroupGrant();
        channelGroupGrant.resourcePattern = str;
        return channelGroupGrant;
    }

    public ChannelGroupGrant manage() {
        return (ChannelGroupGrant) super.manage();
    }

    public ChannelGroupGrant read() {
        return (ChannelGroupGrant) super.read();
    }
}
