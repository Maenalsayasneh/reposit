package com.pubnub.api.models.consumer.access_manager.v3;

public class ChannelGrant extends PNResource<ChannelGrant> {
    private ChannelGrant() {
    }

    public static ChannelGrant name(String str) {
        ChannelGrant channelGrant = new ChannelGrant();
        channelGrant.resourceName = str;
        return channelGrant;
    }

    public static ChannelGrant pattern(String str) {
        ChannelGrant channelGrant = new ChannelGrant();
        channelGrant.resourcePattern = str;
        return channelGrant;
    }

    public ChannelGrant delete() {
        return (ChannelGrant) super.delete();
    }

    public ChannelGrant get() {
        return (ChannelGrant) super.get();
    }

    public ChannelGrant join() {
        return (ChannelGrant) super.join();
    }

    public ChannelGrant manage() {
        return (ChannelGrant) super.manage();
    }

    public ChannelGrant read() {
        return (ChannelGrant) super.read();
    }

    public ChannelGrant update() {
        return (ChannelGrant) super.update();
    }

    public ChannelGrant write() {
        return (ChannelGrant) super.write();
    }
}
